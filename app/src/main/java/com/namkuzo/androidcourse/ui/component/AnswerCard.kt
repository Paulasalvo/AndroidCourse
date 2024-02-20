package com.namkuzo.androidcourse.ui.component

import SampleData
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.namkuzo.androidcourse.data.Answer

@Composable
fun AnswerCard(
    answer: Answer,
    isSelected: Boolean,
    onAnswerSelected: (Answer) -> Unit = {}
) {
    ElevatedCard {
        Row(
            modifier = Modifier.fillMaxWidth().padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier.weight(1f),
                text = answer.text
            )
            RadioButton(
                selected = isSelected,
                onClick = { onAnswerSelected(answer)}
            )
        }
    }
}

@Preview
@Composable
fun PreviewAnswerCard() {
    AnswerCard(SampleData.answerSample.first(), true)
}