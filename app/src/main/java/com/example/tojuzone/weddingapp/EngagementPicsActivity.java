package com.example.tojuzone.weddingapp;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class EngagementPicsActivity extends AppCompatActivity {

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engagement_pics);


        viewPager = findViewById(R.id.engagementViewPager);
        EngagementPagerAdapter adapter = new EngagementPagerAdapter(this);
        viewPager.setAdapter(adapter);
    }
}
