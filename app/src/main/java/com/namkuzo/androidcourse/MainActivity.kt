package com.namkuzo.androidcourse

import SampleData
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import com.namkuzo.androidcourse.ui.theme.AndroidCourseTheme
import com.namkuzo.androidcourse.ui.component.Conversation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidCourseTheme {
                Surface {
                    Conversation(messages = SampleData.conversationSample)

                }

            }
        }
    }
}


