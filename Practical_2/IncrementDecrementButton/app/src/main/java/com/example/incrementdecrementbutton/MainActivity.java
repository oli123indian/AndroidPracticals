package com.example.incrementdecrementbutton;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.incrementdecrementbutton.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding activityMainBinding;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());

        activityMainBinding.incrementButton.setOnClickListener(v -> {
            counter = counter + 1;
            activityMainBinding.valueTextView.setText(String.valueOf(counter));
        });

        activityMainBinding.decrementButton.setOnClickListener(v -> {

            counter = counter - 1;
            activityMainBinding.valueTextView.setText(String.valueOf(counter));
        });

        activityMainBinding.resetButton.setOnClickListener(v -> {
            counter = 0;
            activityMainBinding.valueTextView.setText(String.valueOf(counter));
        });
    }
}