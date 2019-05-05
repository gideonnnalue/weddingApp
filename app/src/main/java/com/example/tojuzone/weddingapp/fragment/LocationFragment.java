package com.example.tojuzone.weddingapp.fragment;


import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tojuzone.weddingapp.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class LocationFragment extends Fragment {

    private TextView tradHead;
    private TextView whiteHead;
    private TextView tradLoc;
    private TextView whiteLoc;
    private TextView visitMapText;

    private Button tradLocBtn;
    private Button whiteLocBtn;

    private Dialog mDialog;

    public LocationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mView = inflater.inflate(R.layout.fragment_location, container, false);

        tradHead = mView.findViewById(R.id.trad_head);
        whiteHead = mView.findViewById(R.id.white_head);
        tradLoc = mView.findViewById(R.id.trad_loc);
        whiteLoc = mView.findViewById(R.id.white_loc);
        visitMapText = mView.findViewById(R.id.visit_map_text);

        tradLocBtn = mView.findViewById(R.id.trad_loc_btn);
        whiteLocBtn = mView.findViewById(R.id.white_loc_btn);

        mDialog = new Dialog(getActivity());

        tradLoc.setText("Thursday 9th May, 2019\n" +
                "By 12:00pm Prompt\n" +
                "@ No 2 Jigalambu Street Abacha Road, Karu FCT Abuja.");

        whiteLoc.setText("On Saturday May 11, 2019\n" +
                "By 12:00pm prompt\n" +
                "@Holy Family Catholic Church Lifecamp FCT, Abuja\n" +
                "\n" +
                "Reception Follows Immediately at the\n" +
                "NAF Conference Center, Plot 496 Ahmadu Bello way, Kado FCT Abuja.");

        Typeface typeface = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Oswald-Regular.ttf");

        Typeface lightFace = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Oswald-Light.ttf");

        tradLoc.setTypeface(lightFace);
        whiteLoc.setTypeface(lightFace);
        visitMapText.setTypeface(typeface);
        tradHead.setTypeface(typeface);
        whiteHead.setTypeface(typeface);
        tradLocBtn.setTypeface(typeface);
        whiteLocBtn.setTypeface(typeface);

        tradLocBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Traditional wedding location", Toast.LENGTH_SHORT).show();
                Uri gmmIntentUri = Uri.parse("geo:9.0205,7.5843");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getActivity().getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
            }
        });

        whiteLocBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "White wedding location", Toast.LENGTH_SHORT).show();
                chooseLoc();
            }
        });

        return mView;
    }

    private void chooseLoc() {
        mDialog.setContentView(R.layout.wedding_choice_loc);

        Button mainLocBtn = mDialog.findViewById(R.id.main_loc_btn);
        Button recLocBtn = mDialog.findViewById(R.id.rec_loc_btn);

        mainLocBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:9.088168,7.4225648");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getActivity().getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
            }
        });

        recLocBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:9.0791,7.3989431");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getActivity().getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
            }
        });



        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mDialog.show();
    }

}
