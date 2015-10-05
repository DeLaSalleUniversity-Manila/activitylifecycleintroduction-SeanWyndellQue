package wynsean.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private static final String DEBUG_TAG = "MainActivity";


    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        Log.d(DEBUG_TAG, "onSaveInstanceState() method was called...");
    }



    @Override
    protected void onStop() {
        super.onStop();
        Log.d(DEBUG_TAG, "onStop() method was called...");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(DEBUG_TAG, "onRestart() method was called...");
    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.d(DEBUG_TAG, "onStart() method was called...");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d(DEBUG_TAG, "onPause() method was called...");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d(DEBUG_TAG, "onResume() method was called...");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(DEBUG_TAG, "onDestroy() method was called...");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(DEBUG_TAG, "onCreate() method was called...");
    }
}
