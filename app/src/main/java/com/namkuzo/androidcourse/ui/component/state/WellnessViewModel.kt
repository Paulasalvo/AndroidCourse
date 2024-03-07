package com.namkuzo.androidcourse.ui.component.state

import androidx.lifecycle.ViewModel


fun getWellnessTasks() = List(30) { i -> WellnessTask(i, "Task # $i") }
class WellnessViewModel: ViewModel() {
    private val tasksIntern = getWellnessTasks().toMutableList()
    val tasks: List<WellnessTask>
        get()= tasksIntern

    fun remove(item: WellnessTask) {
        tasksIntern.remove(item)
    }
    fun changeTaskChecked(item: WellnessTask, checked: Boolean) =
        tasksIntern.find { it.id == item.id }?.let { task ->
            task.checked = checked
        }

}

