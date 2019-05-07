package com.example.tojuzone.weddingapp.fragment;


import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tojuzone.weddingapp.R;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * A simple {@link Fragment} subclass.
 */
public class CountdownFragment extends Fragment {

    private TextView countdownHead;
    private TextView countLbl;

    private TextView countdown;
    private TextView daysText;
    private TextView hoursText;
    private TextView minutesText;
    private TextView secondsText;
    private TextView countdownTime;

    private Button get_location_btn;


    public CountdownFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mView = inflater.inflate(R.layout.fragment_countdown, container, false);

        countdownHead = mView.findViewById(R.id.countdown_head);
        countLbl = mView.findViewById(R.id.count_lbl);

        countdown = mView.findViewById(R.id.countdown_time);
        daysText = mView.findViewById(R.id.days_text);
        hoursText = mView.findViewById(R.id.hours_text);
        minutesText = mView.findViewById(R.id.minutes_text);
        secondsText = mView.findViewById(R.id.seconds_text);
        countdownTime = mView.findViewById(R.id.countdown_time);

        get_location_btn = mView.findViewById(R.id.get_loc_btn);


        Typeface typeface = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Oswald-Regular.ttf");
        countdown.setTypeface(typeface);
        get_location_btn.setTypeface(typeface);
        countdownHead.setTypeface(typeface);
        countLbl.setTypeface(typeface);

        Typeface lightFace = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Oswald-Light.ttf");
        daysText.setTypeface(lightFace);
        hoursText.setTypeface(lightFace);
        minutesText.setTypeface(lightFace);
        secondsText.setTypeface(lightFace);

        String myDate = "2019/05/09";
//creates a formatter that parses the date in the given format
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date date = null;
        try {
            date = sdf.parse(myDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        final long timeInMillis = date.getTime();
        final long currentTimeInMills = System.currentTimeMillis();

        long millDifference = timeInMillis - currentTimeInMills;


        get_location_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Uri gmmIntentUri = Uri.parse("geo:9.088168,7.4225648");
                Uri gmmIntentUri = Uri.parse("google.navigation:q=9.088168,7.4225648");

                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getActivity().getPackageManager()) != null) {
                    startActivity(mapIntent);
                }

            }
        });

        new CountDownTimer(millDifference,1000) {
            @Override
            public void onTick(long millisUntilFinished) {

                long seconds = millisUntilFinished / 1000;
                long minutes = seconds / 60;
                long hours = minutes / 60;
                long days = hours / 24;

                String secondsText;
                String minutesText;
                String hoursText;
                String daysText;


                if (seconds % 60 < 10) {
                    secondsText = "0" + seconds % 60;
                } else {
                    secondsText = String.valueOf(seconds % 60);
                }

                if (minutes % 60 < 10) {
                    minutesText = "0" + minutes % 60;
                } else {
                    minutesText = String.valueOf(minutes % 60);
                }

                if ( hours % 24 < 10 ) {
                    hoursText = "0" + hours % 24;
                } else {
                    hoursText = String.valueOf(hours % 24);
                }

                if ( days < 10) {
                    daysText = "0" + days;
                } else {
                    daysText = String.valueOf(days);
                }



                String time = daysText + " " + hoursText + " " + minutesText + " " + secondsText;
                countdownTime.setText(time);
            }

            @Override
            public void onFinish() {

            }
        }.start();

        return mView;
    }

}
