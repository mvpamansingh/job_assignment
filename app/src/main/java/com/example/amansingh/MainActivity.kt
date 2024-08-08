package com.example.amansingh

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.tooling.preview.Preview
import com.example.amansingh.presentation.JobScreen
import com.example.amansingh.presentation.TopBar
import com.example.amansingh.ui.theme.AmanSinghTheme
import dev.chrisbanes.haze.HazeState
import dev.chrisbanes.haze.haze
import dev.chrisbanes.haze.hazeChild

@OptIn(ExperimentalMaterial3Api::class)
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AmanSinghTheme {

                val hazeState = remember {
                    HazeState()
                }
                val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(
                    state= rememberTopAppBarState()
                )
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                        .nestedScroll(scrollBehavior.nestedScrollConnection)
                        .background(MaterialTheme.colorScheme.background),

                    containerColor = Color.Transparent,

                    topBar = {
                        TopBar(modifier= Modifier.hazeChild(state=hazeState),
                            scrollBehavior = scrollBehavior)

                    },
                ) { innerPadding ->

                    JobScreen(modifier= Modifier.fillMaxSize()
                        .padding(innerPadding) ,
                        hazeState = hazeState, paddingValues = innerPadding
                        )
                }
            }
        }
    }
}

