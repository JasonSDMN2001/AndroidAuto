package com.example.androidauto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Add the MapsFragment to the activity
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, new MapsFragment())
                .commit();
    }
}