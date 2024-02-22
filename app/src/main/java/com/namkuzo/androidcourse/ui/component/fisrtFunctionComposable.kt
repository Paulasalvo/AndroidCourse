package com.namkuzo.androidcourse.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.namkuzo.androidcourse.ui.theme.AndroidCourseTheme

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
   Surface(
       modifier.padding(horizontal = 8.dp, vertical = 4.dp),
       color = MaterialTheme.colorScheme.primary
   ) {
       Column (modifier = modifier.fillMaxWidth().padding(24.dp)) {
           Text(text = "Hello")
           Text(text = "$name!")
        }
    }
}

@Composable
fun MyApp(
    modifier: Modifier = Modifier,
    names: List<String> = listOf("World", "Compose")
) {
    Surface(
        modifier = modifier,
        color = MaterialTheme.colorScheme.background
    ) {
        Column(modifier.padding(vertical = 4.dp)) {
            for (name in names) {
                Greeting(name = name)
            }
        }
    }
}

@Preview(showBackground = true, widthDp = 320)
@Composable
fun GreetingPreview() {
    AndroidCourseTheme {
        MyApp()
    }
}

