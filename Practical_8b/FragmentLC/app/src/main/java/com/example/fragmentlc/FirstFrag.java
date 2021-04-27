package com.example.fragmentlc;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FirstFrag extends Fragment {

    private void printLog(String s) {
// display a message in Log File
        Log.d("LifeCycle:", s);
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_first, container, false);
        printLog("onCreateView Called");

        return v;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        printLog("onAttach Called");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        printLog("onCreate Called");
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        printLog("onViewCreated Called");

    }
    @Override
    public void onStart() {
        super.onStart();
        printLog("onStart Called");
    }

    @Override
    public void onResume() {
        super.onResume();
        printLog("onResume Called");
    }
    @Override
    public void onPause() {
        super.onPause();
        printLog("onPause Called");
    }
    @Override
    public void onStop() {
        super.onStop();
        printLog("onStop Called");
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        printLog("onDestroyView Called");
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        printLog("onDestroy Called");
    }


    @Override
    public void onDetach() {
        super.onDetach();
        printLog("onDetach Called");
    }
    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        printLog("onViewStateRestored called");
    }

}