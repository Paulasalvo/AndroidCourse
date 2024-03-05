package com.namkuzo.androidcourse.ui.component.state

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier



@Composable
fun WellnessTaskList(
    modifier: Modifier= Modifier,
    list: List<WellnessTask>,
    onCloseTask:(WellnessTask)->Unit
){
    LazyColumn(
        modifier = modifier
    ){
        items(
            items=list,
            key={ task-> task.id}
        ){task->
            WellnessTaskItem1(
                taskName = task.label,
                onClose = { onCloseTask(task)},
                modifier)
        }

        }
    }
