package com.example.tojuzone.weddingapp.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.tojuzone.weddingapp.EngagementVideoActivity;
import com.example.tojuzone.weddingapp.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class EngagementPicsFragment extends Fragment {


    public EngagementPicsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mView = inflater.inflate(R.layout.fragment_engagement_pics, container, false);

        Intent intent = new Intent(getActivity(), EngagementVideoActivity.class);
        startActivity(intent);


        return mView;
    }

}
