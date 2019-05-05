package com.example.tojuzone.weddingapp.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tojuzone.weddingapp.R;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater inflater;

    public SliderAdapter(Context context) {
        this.context = context;
    }

    public int[] slide_images = {
            R.drawable.slide_img_1,
            R.drawable.slide_img_2,
            R.drawable.slide_img_3
    };

    public String[] slide_headings = {
            "Our Love",
            "Our Bond",
            "Our Wedding"
    };

    public String[] slide_descriptions = {
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laoccaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laoccaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laoccaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
    };

    public int[] divider_1 = {
            R.drawable.ic_divider,
            R.drawable.ic_divider,
            R.drawable.ic_divider
    };

    public int[] divider_2 = {
            R.drawable.ic_divider2,
            R.drawable.ic_divider2,
            R.drawable.ic_divider2
    };

    @Override
    public int getCount() {
        return slide_headings.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == (ConstraintLayout) o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slide_layout, container, false);

        ImageView slideImage = view.findViewById(R.id.slide_img);
        TextView slideHeader = view.findViewById(R.id.slide_header);
        ImageView divider1 = view.findViewById(R.id.divider1);
        ImageView divider2 = view.findViewById(R.id.divider2);
        TextView slideDesc = view.findViewById(R.id.slide_desc);

        Typeface typeface = Typeface.createFromAsset(context.getAssets(), "fonts/greatvibes.otf");
        slideHeader.setTypeface(typeface);


        slideImage.setImageResource(slide_images[position]);
        slideHeader.setText(slide_headings[position]);
        divider1.setImageResource(divider_1[position]);
        divider2.setImageResource(divider_2[position]);
        slideDesc.setText(slide_descriptions[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ConstraintLayout)object);
    }
}
