package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.activitylifecycle.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Activity","onCreate()");
//        Toast.makeText(getApplicationContext(),"onCreate()",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Activity","onStart()");
//        Toast.makeText(getApplicationContext(),"onStart()",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Activity","onResume()");
//        Toast.makeText(getApplicationContext(),"onResume()",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Activity","onPause()");
//        Toast.makeText(getApplicationContext(),"onPause()",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Activity","onStop()");
//        Toast.makeText(getApplicationContext(),"onStop()",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Activity","onRestart()");
//        Toast.makeText(getApplicationContext(),"onRestart()",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Activity","onDestroy()");
//        Toast.makeText(getApplicationContext(),"onDestroy()",Toast.LENGTH_SHORT).show();
    }
}