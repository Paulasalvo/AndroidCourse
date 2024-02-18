package com.namkuzo.androidcourse.ui.theme.component

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.namkuzo.androidcourse.R
import com.namkuzo.androidcourse.data.Message
import com.namkuzo.androidcourse.ui.theme.AndroidCourseTheme

@Composable
fun MessageCard(msg: Message) {
    Row(modifier = Modifier.padding(all = 8.dp)){
        Image(
            modifier= Modifier
                .width(100.dp)
                .clip(CircleShape)
                .border(1.5.dp, MaterialTheme.colorScheme.primary, CircleShape),
            painter = painterResource(id = R.drawable.girl),
            contentDescription ="ita a pretty girl"
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column {
            Text(text = msg.author,
                color = MaterialTheme.colorScheme.secondary,
                style = MaterialTheme.typography.titleSmall)
            Spacer(modifier = Modifier.height(4.dp))
            Surface(shape = MaterialTheme.shapes.medium, shadowElevation = 1.dp) {
                Text(modifier = Modifier.padding(4.dp),
                    text = msg.body,
                    style = MaterialTheme.typography.bodyMedium)
            }

        }
    }


}

@Preview(name = "Light Mode")
@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
    name = "Dark Mode"
)
@Composable
fun PreviewMessageCard() {
    AndroidCourseTheme {
        Surface {
            MessageCard(
                msg = Message("Lexi", "Hey, take a look at Jetpack Compose, it's great!")
            )
        }

    }

}