package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.example.spinner.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());

        ArrayList<String> numbers = new ArrayList<>();
        numbers.add("Select");
        numbers.add(getResources().getString(R.string.One));
        numbers.add(getResources().getString(R.string.Two));
        numbers.add(getResources().getString(R.string.Three));
        numbers.add(getResources().getString(R.string.Four));
        numbers.add(getResources().getString(R.string.Five));
        numbers.add(getResources().getString(R.string.Six));
        numbers.add(getResources().getString(R.string.Seven));
        numbers.add(getResources().getString(R.string.Eight));
        numbers.add(getResources().getString(R.string.Nine));
        numbers.add(getResources().getString(R.string.Ten));

        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, numbers);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        activityMainBinding.spinner.setAdapter(spinnerAdapter);

        activityMainBinding.spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                activityMainBinding.spinner.setSelection(position);
                Log.i("Position: ", String.valueOf(position));
                switch(position){
                    case 0:
                        break;
                    case 1:
                        activityMainBinding.imageView.setImageResource(R.drawable.number_one);
                        break;
                    case 2:
                        activityMainBinding.imageView.setImageResource(R.drawable.number_two);
                        break;
                    case 3:
                        activityMainBinding.imageView.setImageResource(R.drawable.number_three);
                        break;
                    case 4:
                        activityMainBinding.imageView.setImageResource(R.drawable.number_four);
                        break;
                    case 5:
                        activityMainBinding.imageView.setImageResource(R.drawable.number_five);
                        break;
                    case 6:
                        activityMainBinding.imageView.setImageResource(R.drawable.number_six);
                        break;
                    case 7:
                        activityMainBinding.imageView.setImageResource(R.drawable.number_seven);
                        break;
                    case 8:
                        activityMainBinding.imageView.setImageResource(R.drawable.number_eight);
                        break;
                    case 9:
                        activityMainBinding.imageView.setImageResource(R.drawable.number_nine);
                        break;
                    case 10:
                        activityMainBinding.imageView.setImageResource(R.drawable.number_ten);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



    }
}
