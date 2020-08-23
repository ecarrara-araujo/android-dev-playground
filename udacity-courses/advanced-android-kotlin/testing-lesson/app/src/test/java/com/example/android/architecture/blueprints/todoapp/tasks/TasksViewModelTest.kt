package com.example.android.architecture.blueprints.todoapp.tasks

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.android.architecture.blueprints.todoapp.utils.getOrAwaitValue
import org.hamcrest.CoreMatchers.*
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class TasksViewModelTest {
    @get:Rule
    val instantExecutorRule = InstantTaskExecutorRule()

    // subject under test
    private lateinit var tasksViewModel: TasksViewModel

    @Before
    fun setUp() {
        tasksViewModel = TasksViewModel(ApplicationProvider.getApplicationContext())
    }

    @Test
    fun addNewTask_setsNewTaskEvent() {
        // when adding a new task
        tasksViewModel.addNewTask()

        // then the new event task is triggered
        val value = tasksViewModel.newTaskEvent.getOrAwaitValue()
        assertThat(value.getContentIfNotHandled(), not(nullValue()))
    }

    @Test
    fun setFiltering_forAllTasks_AddTasksViewVisible() {
        // when the filter type is all tasks
        tasksViewModel.setFiltering(TasksFilterType.ALL_TASKS)

        // then the "Add task" action is visible
        val value = tasksViewModel.tasksAddViewVisible.getOrAwaitValue()
        assertThat(value, `is`(true))
    }
}
