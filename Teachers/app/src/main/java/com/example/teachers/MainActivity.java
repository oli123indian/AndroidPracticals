package com.example.teachers;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.example.teachers.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(activityMainBinding.getRoot());
        activityMainBinding.imageView.setVisibility(View.INVISIBLE);

        ArrayList<String> courses = new ArrayList<>();
        courses.add("Mathematics");
        courses.add("Chemistry");
        courses.add("Physics");
        courses.add("Computer Science");
        courses.add("Botany");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,courses);
        activityMainBinding.coursesListView.setAdapter(arrayAdapter);

        activityMainBinding.coursesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                activityMainBinding.imageView.setVisibility(View.VISIBLE);
                if(position == 0)
                {
                    activityMainBinding.imageView.setImageResource(R.drawable.maths);
                }
                else if(position == 1){
                    activityMainBinding.imageView.setImageResource(R.drawable.chem);
                }
                else if(position == 2){
                    activityMainBinding.imageView.setImageResource(R.drawable.physics);
                }
                else if(position == 3){
                    activityMainBinding.imageView.setImageResource(R.drawable.computer);
                }
                else
                {
                    activityMainBinding.imageView.setImageResource(R.drawable.botany);
                }

            }
        });
    }
}