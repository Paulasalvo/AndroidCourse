package com.namkuzo.androidcourse.ui.theme.component

import SampleData
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.namkuzo.androidcourse.data.Message
import com.namkuzo.androidcourse.ui.theme.AndroidCourseTheme

@Composable
fun Conversation(messages: List<Message>) {
    LazyColumn {
        items(messages) { message ->
            MessageCard(message)
        }
    }
}

@Preview
@Composable
fun PreviewConversation() {
    AndroidCourseTheme {
        Conversation(SampleData.conversationSample)
    }
}