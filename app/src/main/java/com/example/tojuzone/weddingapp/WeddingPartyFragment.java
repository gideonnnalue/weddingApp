package com.example.tojuzone.weddingapp;


import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class WeddingPartyFragment extends Fragment {

    private GridView gridView;
    private GridViewAdapter gridAdapter;


    public WeddingPartyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mView = inflater.inflate(R.layout.fragment_wedding_party, container, false);

        gridView = (GridView) mView.findViewById(R.id.gridView);
        gridAdapter = new GridViewAdapter(getContext(), R.layout.grid_item_layout, getData());
        gridView.setAdapter(gridAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                ImageItem item = (ImageItem) parent.getItemAtPosition(position);

                //Create intent
                Intent intent = new Intent(getContext(), DetailsActivity.class);
                intent.putExtra("title", item.getTitle());
//                intent.putExtra("image", item.getImage());

                //Start details activity
                startActivity(intent);
            }
        });

        return mView;
    }

    /**
     * Prepare some dummy data for gridview
     */
    private ArrayList<ImageItem> getData() {
        final ArrayList<ImageItem> imageItems = new ArrayList<>();
        String names[] = {"Salihu Barbara", "Oyinkansola Fatogun", "Omoogun Loveth Jokotola", "Salihu Veronica", "Jennifer Anjorin", "Tamunu Doubra", "Squadron Leader Mike Oyadougha", "Sanni Abass", "Major Thompson Araki", "Lawrence", "Major George Egbe Usibe", "Hon Nnaji Paul Chidozie"};
        TypedArray imgs = getResources().obtainTypedArray(R.array.image_ids);
        for (int i = 0; i < imgs.length(); i++) {
            Bitmap bitmap = BitmapFactory.decodeResource(getResources(), imgs.getResourceId(i, -1));
            imageItems.add(new ImageItem(bitmap, names[i]));
        }
        return imageItems;
    }

}
