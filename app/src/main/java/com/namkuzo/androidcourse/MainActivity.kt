package com.namkuzo.androidcourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import com.namkuzo.androidcourse.data.Message
import com.namkuzo.androidcourse.ui.theme.AndroidCourseTheme
import com.namkuzo.androidcourse.ui.theme.component.MessageCard

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidCourseTheme {
                Surface {
                    MessageCard(
                        msg = Message("Lexi", "Hey, take a look at Jetpack Compose, it's great!")
                    )
                }

            }
        }
    }
}


