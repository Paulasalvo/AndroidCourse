package com.namkuzo.androidcourse.ui.component.state

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WaterCounter (modifier: Modifier = Modifier ) {
    var count = 0
    Text("You've had $count glases.",
        modifier=modifier.padding(16.dp)
    )
}