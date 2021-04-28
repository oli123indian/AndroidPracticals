package com.example.login;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.login.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {

    ActivityMain2Binding activityMain2Binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMain2Binding = ActivityMain2Binding.inflate(getLayoutInflater());
        View nextView = activityMain2Binding.getRoot();
        setContentView(nextView);

        activityMain2Binding.logoutButton.setOnClickListener(v -> {
            AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity2.this);
            alertDialog.setMessage("Are you sure to log out?")
            .setTitle("LOG OUT?");
            alertDialog.setCancelable(false);
            alertDialog.setPositiveButton("Yes", (dialog, which) -> {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
//                        dialog.dismiss();
            });
            alertDialog.setNegativeButton("No", (dialog, which) -> dialog.dismiss());
            AlertDialog myAlert = alertDialog.create();
            myAlert.show();

        });
    }
}