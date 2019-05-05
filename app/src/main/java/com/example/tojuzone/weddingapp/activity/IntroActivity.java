package com.example.tojuzone.weddingapp.activity;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.tojuzone.weddingapp.R;
import com.example.tojuzone.weddingapp.adapter.SliderAdapter;

public class IntroActivity extends AppCompatActivity {

    private ViewPager slideViewPager;
    private LinearLayout mDotsLayout;

    private SliderAdapter sliderAdapter;

    private TextView[] mDots;

    private Button nextBtn;
    private Button prevBtn;

    private int mCurrentPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        slideViewPager = findViewById(R.id.slideViewPager);
        mDotsLayout = findViewById(R.id.dotsLayout);

        nextBtn = findViewById(R.id.nextBtn);
        prevBtn = findViewById(R.id.prevBtn);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/prata.ttf");
        nextBtn.setTypeface(typeface);
        prevBtn.setTypeface(typeface);

        sliderAdapter = new SliderAdapter(this);

        slideViewPager.setAdapter(sliderAdapter);



        addDotsIndicator(0);

        slideViewPager.addOnPageChangeListener(viewListener);

        // OnClickListener
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slideViewPager.setCurrentItem(mCurrentPage + 1);

                if (mCurrentPage == 2) {
                    Intent I = new Intent(getApplicationContext(), WeddingActivity.class);
                    startActivity(I);
                    finish();
                }
            }
        });

        prevBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slideViewPager.setCurrentItem(mCurrentPage - 1);
            }
        });

    }

    public void addDotsIndicator (int position) {
        mDots = new TextView[3];
        mDotsLayout.removeAllViews();

        for (int i = 0; i < mDots.length; i++) {

            mDots[i] = new TextView(this);
            mDots[i].setText(Html.fromHtml("&#8226;"));
            mDots[i].setTextColor(getResources().getColor(R.color.colorLightGold));
            mDots[i].setTextSize(30);

            mDotsLayout.addView(mDots[i]);
        }

        if(mDots.length > 0) {
            mDots[position].setTextColor(getResources().getColor(R.color.goldColor));
        }
    }

    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int i) {
            addDotsIndicator(i);
            mCurrentPage = i;

            if(i == 0) {
                nextBtn.setEnabled(true);
                prevBtn.setEnabled(false);
                prevBtn.setVisibility(View.INVISIBLE);

                nextBtn.setText("Next");
                prevBtn.setText("");
            } else if (i == mDots.length - 1) {
                nextBtn.setEnabled(true);
                prevBtn.setEnabled(true);
                prevBtn.setVisibility(View.VISIBLE);

                nextBtn.setText("Finish");
                prevBtn.setText("Prev");
            } else {
                nextBtn.setEnabled(true);
                prevBtn.setEnabled(true);
                prevBtn.setVisibility(View.VISIBLE);

                nextBtn.setText("Next");
                prevBtn.setText("Prev");
            }

        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    };
}
