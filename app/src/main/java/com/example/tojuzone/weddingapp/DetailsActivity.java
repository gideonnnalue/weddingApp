package com.example.tojuzone.weddingapp;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        String comments[] = new String[6];
        comments[0] = "Hope for the best,expect the worst,you only live once so live everyday like it’s your last.";
        comments[1] = "My name is Oyinkansola Fatogun. I’m a trained media personnel, and an entrepreneur from Bingham University.\n" +
                "\nI love food, watching movies, makeup and surfing the net." +
                "I love food, watching movies, makeup and surfing the net.";
        comments[2] = "Biography: jokotola is the junior sister of the bride and she is born in November 14 and presently she’s schooling in veritas university, Abuja";
        comments[3] = "A visionary, feminist and critique. I Love my family and friends, cherish my time spent with loved ones. Confident enough to know that " +
                "everyone matters but loving yourself matters most. A believer in a dream that one day the world will be a better place.\n" +
                "She is a close friend to the bride";
        comments[4] = "I hail from ondo state, yoruba by tribe\n" +
                "I'm cool,friendly and nice\n" +
                "I love singing, learning new things and improving on my talents \n" +
                "Above all I'm a lover of God";
        comments[5] = "My name is Tamunu Doubra, I am down to earth. I love adventures and meeting new people.";

        String title = getIntent().getStringExtra("title");
        Bitmap bitmap = getIntent().getParcelableExtra("image");

        TextView titleTextView = (TextView) findViewById(R.id.party_title);
        titleTextView.setText(title);

        TextView desc = findViewById(R.id.party_desc);
        TextView portfolio = findViewById(R.id.party_portfolio);

        ImageView imageView = (ImageView) findViewById(R.id.party_image);

        switch (title) {
            case "Salihu Barbara":
                imageView.setImageResource(R.drawable.barbara);
                portfolio.setText("LL.B");
                desc.setText(comments[0]);
                break;
            case "Oyinkansola Fatogun":
                imageView.setImageResource(R.drawable.fatogun);
                portfolio.setText("Bridesmaid");
                desc.setText(comments[1]);
                break;
            case "Omoogun Loveth Jokotola":
                imageView.setImageResource(R.drawable.loveth);
                portfolio.setText("Chief Bridesmaid");
                desc.setText(comments[2]);
                break;
            case "Salihu Veronica":
                imageView.setImageResource(R.drawable.veronica);
                portfolio.setText("Brides friend");
                desc.setText(comments[3]);
                break;
            case "Jennifer Anjorin":
                imageView.setImageResource(R.drawable.anjorin);
                portfolio.setText("Bridesmaid");
                desc.setText(comments[4]);
                break;
            case "Tamunu Doubra":
                imageView.setImageResource(R.drawable.doubra);
                portfolio.setText("Bridesmaid");
                desc.setText(comments[5]);
                break;
            default:
                return;

        }
//        imageView.setImageResource(R.drawable.anjorin);
//        imageView.setImageBitmap(bitmap);
    }
}
