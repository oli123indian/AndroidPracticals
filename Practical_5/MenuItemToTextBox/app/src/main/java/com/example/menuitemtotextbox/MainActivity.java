package com.example.menuitemtotextbox;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.menuitemtotextbox.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
            {
                activityMainBinding.textViewFromMenu.setText(item.getTitle());
                break;
            }
            case R.id.item2:
            {
                activityMainBinding.textViewFromMenu.setText(item.getTitle());
                break;
            }
            case R.id.item3:
            {
                activityMainBinding.textViewFromMenu.setText(item.getTitle());
                break;
            }
            case R.id.item4:
            {
                activityMainBinding.textViewFromMenu.setText(item.getTitle());
                break;
            }
            case R.id.item5:
            {
                activityMainBinding.textViewFromMenu.setText(item.getTitle());
                break;
            }
        }
        return super.onOptionsItemSelected(item);
    }
}