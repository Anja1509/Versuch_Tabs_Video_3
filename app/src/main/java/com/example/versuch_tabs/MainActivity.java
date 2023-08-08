package com.example.versuch_tabs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

    }

    protected void initViews(){
        tabLayout = findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("Obst & Gemüse"));
        tabLayout.addTab(tabLayout.newTab().setText("Milchprodukte"));
        tabLayout.addTab(tabLayout.newTab().setText("Sonstiges"));
       
    }
}