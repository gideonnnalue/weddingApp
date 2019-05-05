package com.example.tojuzone.weddingapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.tojuzone.weddingapp.activity.IntroActivity;

public class MainActivity extends AppCompatActivity {

    private TextView appName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        appName = findViewById(R.id.app_own_text);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/prata.ttf");
        appName.setTypeface(typeface);

        Thread timer = new Thread() {
            @Override
            public void run () {
                try {
                    sleep(3000);
                    Intent i = new Intent(getApplicationContext(), IntroActivity.class);
                    startActivity(i);
                    finish();
                    super.run();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        timer.start();
    }
}
