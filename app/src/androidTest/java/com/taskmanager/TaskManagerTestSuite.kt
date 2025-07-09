package com.taskmanager

import org.junit.runner.RunWith
import org.junit.runners.Suite


@RunWith(Suite::class)
@Suite.SuiteClasses(
    TaskCreationFlowTest::class,
    TaskListFilterAndSortTest::class
)
class TaskManagerTestSuite
