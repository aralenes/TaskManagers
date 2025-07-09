# TaskManager
app/
├── data/
│   ├── local/
│   │   ├── TaskDao.kt
│   │   └── AppDatabase.kt
│   └── repository/
│       ├── TaskRepository.kt
│       └── SettingsRepository.kt
├── di/
│   ├── DatabaseModule.kt
│   ├── TaskModule.kt
│   └── SettingsModule.kt
├── domain/
│   └── model/
│       └── Task.kt
├── ui/
│   ├── component/
│   │   ├── DismissBackground.kt
│   │   ├── ModifierExt.kt
│   │   ├── TaskAppBar.kt
│   │   ├── TaskBottomNavigation.kt
│   │   └── TaskNavHost.kt
│   ├── screen/
│   │   ├── creation/
│   │   │   ├── Component
│   │   │   ├── CreateTask.kt
│   │   │   └── TaskCreationViewModel.kt
│   │   ├── dashboard/
│   │   │   ├── TaskCompletionProgress.kt
│   │   │   └── TaskDashboard.kt
│   │   ├── settings/
│   │   │   ├── Settings.kt
│   │   │   └── SettingsViewModel.kt
│   │   ├── taskdetail/
│   │   │   ├── Component
│   │   │   ├── TaskDetail.kt
│   │   │   └── TaskDetailViewModel.kt
│   │   └── tasklist/
│   │       ├── Component
│   │       ├── TaskList.kt
│   │       └── TaskListViewModel.kt
│   ├── theme/
│   │   ├── Color.kt
│   │   ├── Theme.kt
│   │   └── Type.kt
│   └── TaskManagerApp.kt
├── MainActivity.kt
└── TaskMangerApplication.kt
