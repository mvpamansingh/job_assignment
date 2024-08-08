package com.example.amansingh.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun JobItem(modifier:Modifier= Modifier)
{

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        shape = RoundedCornerShape(12.dp),

        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            // Row for Job Title and Job Location
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Senior Developer",
                    fontSize = 18.sp,
                    color = Color.Black,
                    modifier = Modifier.weight(1f).padding(end = 8.dp)
                )
                Text(
                    text = "New York, NY",
                    fontSize = 18.sp,
                    color = Color.Black,
                    modifier = Modifier.weight(1f)
                )
            }

            Spacer(modifier = Modifier.height(16.dp)) // Space between the rows

            // Row for Job Salary and Phone Number
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "$120,000/year",
                    fontSize = 18.sp,
                    color = Color.Black,
                    modifier = Modifier.weight(1f).padding(end = 8.dp)
                )
                Text(
                    text = "+1 234 567 890",
                    fontSize = 18.sp,
                    color = Color.Black,
                    modifier = Modifier.weight(1f)
                )
            }
        }
    }
}