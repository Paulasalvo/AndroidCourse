package com.namkuzo.androidcourse

import SampleData
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import com.namkuzo.androidcourse.ui.theme.AndroidCourseTheme
import com.namkuzo.androidcourse.ui.component.Conversation
import com.namkuzo.androidcourse.ui.component.MySootheApp

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidCourseTheme {
                val windowSizeClass = calculateWindowSizeClass(this)
                MySootheApp(windowSizeClass)
            }
        }
    }
}


