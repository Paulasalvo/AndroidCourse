package com.namkuzo.androidcourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.ui.Modifier
import com.namkuzo.androidcourse.ui.component.MySootheApp
import com.namkuzo.androidcourse.ui.component.state.WellnessScreen
import com.namkuzo.androidcourse.ui.theme.AndroidCourseTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                    AndroidCourseTheme {
                        Surface(
                            modifier = Modifier.fillMaxSize(),
                            color=MaterialTheme.colorScheme.background
                        ) {
                            WellnessScreen()
                        }
                    }
        }
    }
}


