package com.example.amansingh.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.amansingh.ui.theme.Blur
import dev.chrisbanes.haze.HazeState
import dev.chrisbanes.haze.HazeStyle
import dev.chrisbanes.haze.haze
import dev.chrisbanes.haze.hazeChild


@Composable
fun JobScreen(modifier: Modifier= Modifier,
              hazeState: HazeState, paddingValues: PaddingValues)
{





    Box(modifier = modifier
        .background(MaterialTheme.colorScheme.background)
    )
    {

        JobList(
            modifier = Modifier
                .fillMaxSize()
                .haze(
                    state = hazeState,
                    style = HazeStyle(
                        blurRadius = 13.dp, tint = Blur
                    )
                ),
            paddingValues = paddingValues
        )



        BottomBar(
            modifier= Modifier.fillMaxWidth()
                .padding(horizontal = 25.dp)
                .align(Alignment.BottomStart)
                .padding(bottom= 25.dp)
                .hazeChild(
                    state= hazeState,
                    shape = RoundedCornerShape(25.dp)
                )
        )
    }
}


