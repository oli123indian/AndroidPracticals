package com.example.login;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.login.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;
    public String defaultUserName= "admin";
    public String defaultPassword = "123456";
    MediaPlayer mediaPlayer;
    int totalAttemptRemaining = 5;
    CountDownTimer countDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = activityMainBinding.getRoot();
        setContentView(view);
        mediaPlayer = MediaPlayer.create(this,R.raw.naaudio);
        activityMainBinding.button.setOnClickListener(v -> {
            String username = activityMainBinding.textEmailAddress.getText().toString();
            String password = activityMainBinding.editTextTextPassword.getText().toString();
            if(username.isEmpty() || password.isEmpty())
            {
                Toast.makeText(MainActivity.this,"UserName or Password must not be empty",Toast.LENGTH_SHORT).show();

            }
            else if(username.equals(defaultUserName) && password.equals(defaultPassword) )
            {
                Intent i = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(i);

            }
            else
            {
                if(totalAttemptRemaining <= 1)
                {
                    activityMainBinding.textEmailAddress.setEnabled(false);
                    activityMainBinding.editTextTextPassword.setEnabled(false);
                    activityMainBinding.button.setEnabled(false);
                    countDownTimer = new CountDownTimer(30000,1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            long seconds = millisUntilFinished/1000;
                            String message = "Try After "+seconds+ " sec";
                            activityMainBinding.attemptRemaining.setText(message);
                        }

                        @Override
                        public void onFinish() {
                            totalAttemptRemaining = 5;
                            activityMainBinding.attemptRemaining.setText("");
                            countDownTimer.cancel();
                            activityMainBinding.textEmailAddress.setEnabled(true);
                            activityMainBinding.editTextTextPassword.setEnabled(true);
                            activityMainBinding.button.setEnabled(true);
                        }
                    }.start();
                }
                else
                {
                    --totalAttemptRemaining;
                    String s = "You have " + totalAttemptRemaining + " attempts remaining!";
                    activityMainBinding.attemptRemaining.setText(s);
                }
                activityMainBinding.textEmailAddress.getText().clear();
                activityMainBinding.editTextTextPassword.getText().clear();

            }
        });

    }
    }
