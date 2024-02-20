package com.namkuzo.androidcourse.ui.screen

import SampleData
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.namkuzo.androidcourse.data.Answer
import com.namkuzo.androidcourse.ui.component.AnswerCard

@Composable
fun AnswerScreen(answerList: List<Answer>) {
    val context = LocalContext.current
    var selectedAnswer: Answer? by rememberSaveable {
        mutableStateOf(null)
    }
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Center
    ) {
        answerList.forEach { myAnswer ->
            AnswerCard(
                answer = myAnswer,
                isSelected = selectedAnswer == myAnswer,
                onAnswerSelected = {
                    selectedAnswer = myAnswer
                    Toast.makeText(context, it.text, Toast.LENGTH_SHORT).show()
                }
            )
            Spacer(modifier = Modifier.padding(top = 8.dp))
        }
    }
}

@Preview
@Composable
fun PreviewAnswerScreen() {
    AnswerScreen(answerList = SampleData.answerSample)
}
