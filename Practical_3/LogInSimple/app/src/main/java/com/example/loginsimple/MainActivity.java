package com.example.loginsimple;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.Toast;

import com.example.loginsimple.databinding.ActivityMainBinding;
import com.example.loginsimple.R;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;
    public String defaultUserName= "admin";
    public String defaultPassword = "123456";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = activityMainBinding.getRoot();
        setContentView(view);

        activityMainBinding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = activityMainBinding.textEmailAddress.getText().toString();
                String password = activityMainBinding.editTextTextPassword.getText().toString();
                if(username.isEmpty() || password.isEmpty())
                {
                    Toast.makeText(MainActivity.this,"UserName or Password must not be empty",Toast.LENGTH_SHORT).show();
                }
                else if(username.equals(defaultUserName) && password.equals(defaultPassword) )
                {
                   Toast.makeText(MainActivity.this,"Welcome",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    Toast.makeText(MainActivity.this,"Invalid Username or Password",Toast.LENGTH_SHORT).show();

                }
                activityMainBinding.textEmailAddress.getText().clear();
                activityMainBinding.editTextTextPassword.getText().clear();
            }
        });

    }
}
