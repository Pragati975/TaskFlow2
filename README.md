# TaskFlow

A modern Android to-do app built with Jetpack Compose. TaskFlow helps you organize tasks into lists and groups, set reminders, schedule tasks, and track progress — all with a clean Material Design UI.

## Features

- Create and manage task lists organized into groups
- Add subtasks (steps) to any task
- Set due dates and reminders with repeat options (daily, weekly, monthly, yearly)
- Search across all tasks instantly
- Multiple themes: Daylight, Twilight, Midnight, Sunrise, Aurora, Wallpaper
- Multi-language support (English, Bahasa Indonesia)
- Foldable device support
- Landscape and tablet layouts

## Tech Stack

- **UI**: Jetpack Compose
- **Architecture**: MVI (Model-View-Intent)
- **DI**: Hilt
- **Database**: Room
- **Preferences**: DataStore (Proto)
- **Navigation**: Compose Navigation
- **Async**: Kotlin Coroutines + Flow
- **Backend**: Firebase (Auth, Crashlytics, Performance)
- **Notifications**: AlarmManager + NotificationManager

## Architecture

The project follows a feature-based package structure with clean separation of concerns:

```
app/
├── features/          # Feature modules (login, dashboard, todo, settings...)
│   └── <feature>/
│       ├── data/      # Environment (repository layer)
│       ├── di/        # Hilt modules
│       └── ui/        # Screen, ViewModel, State, Action
├── foundation/        # Shared infrastructure
│   ├── datasource/    # Room DB, DataStore, Server
│   ├── theme/         # Colors, typography, shapes
│   ├── uicomponent/   # Reusable Compose components
│   └── extension/     # Kotlin extension functions
├── model/             # Domain models
└── runtime/           # App entry point, navigation
```

## Getting Started

### Prerequisites
- Android Studio Hedgehog or later
- JDK 17
- Android SDK 35

### Setup

1. Clone the repository
2. Add your `google-services.json` to the `app/` directory
3. Open in Android Studio and sync Gradle
4. Run on a device or emulator (API 21+)

## License

```
Copyright 2024 Dev Kumar

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0
```
