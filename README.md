# Activity Lifecycle Introduction (with Logcat output)

This assignment illustrates the Android activity lifecycle using Logcat.

## Problem:

Implement an Android application that displays Logs in Logcat when the following methods are called:

1. *onCreate()* - handles the creation of the activity object, and the loading of any static resources like themes, images, layouts, set up menus, and the like.

2. *onStart()* - executes every time the activity begins.

3. *onResume()* - executes when the activity is making a transition from the Paused state and into the Running state again.

4. *onPause()* - called when the activity is still partially visible.

5. *onSaveInstanceState()* - called before the activity gets destroyed, which means you get an opportunity to save any variables you want to retain.

6. *onStop()* - called when the activity is no longer visible on the screen.

7. *onRestart()* - called when activity was stopped but is started again later.

8. *onDestroy()* - called when the entire app is being shut down and unloaded from memory.


## Basig Logging:

```Java
  private static final String DEBUG_TAG = "MainActivity";
  ...
      @Override
    protected void onStart() {
        super.onStart();
        Log.d(DEBUG_TAG, "onStart() method was called... (Tinawag po ang onStart())");
    }
    ...
```


## Results:

On App Launch:

```shell
10-05 21:25:00.958  14812-14812/wynsean.activitylifecycle D/MainActivity﹕ onCreate() method was called...
10-05 21:25:00.968  14812-14812/wynsean.activitylifecycle D/MainActivity﹕ onStart() method was called...
10-05 21:25:00.968  14812-14812/wynsean.activitylifecycle D/MainActivity﹕ onResume() method was called...
```


On Android 'Home' button press: 
```shell
10-05 21:25:21.938  14812-14812/wynsean.activitylifecycle D/MainActivity﹕ onPause() method was called...
10-05 21:25:22.918  14812-14812/wynsean.activitylifecycle D/MainActivity﹕ onSaveInstanceState() method was called...
10-05 21:25:22.928  14812-14812/wynsean.activitylifecycle D/MainActivity﹕ onStop() method was called...
```


On relaunch of the App: (Notice that onCreate() was no longer called)
```shell
10-05 21:25:39.498  14812-14812/wynsean.activitylifecycle D/MainActivity﹕ onRestart() method was called...
10-05 21:25:39.498  14812-14812/wynsean.activitylifecycle D/MainActivity﹕ onStart() method was called...
10-05 21:25:39.498  14812-14812/wynsean.activitylifecycle D/MainActivity﹕ onResume() method was called...
```


On Android 'Back' button press:
```shell
10-05 21:25:51.648  14812-14812/wynsean.activitylifecycle D/MainActivity﹕ onPause() method was called...
10-05 21:25:52.368  14812-14812/wynsean.activitylifecycle D/MainActivity﹕ onStop() method was called...
10-05 21:25:52.368  14812-14812/wynsean.activitylifecycle D/MainActivity﹕ onDestroy() method was called...
```


On relaunch after being destroyed:
```shell
10-05 21:26:03.888  14812-14812/wynsean.activitylifecycle D/MainActivity﹕ onCreate() method was called...
10-05 21:26:03.888  14812-14812/wynsean.activitylifecycle D/MainActivity﹕ onStart() method was called...
10-05 21:26:03.888  14812-14812/wynsean.activitylifecycle D/MainActivity﹕ onResume() method was called...
```


On configuration change (Rotating the Screen)
```shell
10-05 21:26:14.968  14812-14812/wynsean.activitylifecycle D/MainActivity﹕ onPause() method was called...
10-05 21:26:14.968  14812-14812/wynsean.activitylifecycle D/MainActivity﹕ onSaveInstanceState() method was called...
10-05 21:26:14.968  14812-14812/wynsean.activitylifecycle D/MainActivity﹕ onStop() method was called...
10-05 21:26:14.968  14812-14812/wynsean.activitylifecycle D/MainActivity﹕ onDestroy() method was called...
10-05 21:26:15.148  14812-14812/wynsean.activitylifecycle D/MainActivity﹕ onCreate() method was called...
10-05 21:26:15.148  14812-14812/wynsean.activitylifecycle D/MainActivity﹕ onStart() method was called...
10-05 21:26:15.148  14812-14812/wynsean.activitylifecycle D/MainActivity﹕ onResume() method was called...
```


## Screenshots:

![alt tag](https://github.com/wynsean/ActivityLifeCycle/blob/master/Screenshot1.png)

![alt tag](https://github.com/wynsean/ActivityLifeCycle/blob/master/Screenshot2.png)

![alt tag](https://github.com/wynsean/ActivityLifeCycle/blob/master/Screenshot3.png)

