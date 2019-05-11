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

        String comments[] = new String[12];
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
        comments[6] = "Squadron Leader Mike Oyadougha is the Best Man to the Groom. He works with Nigerian Air Force Properties Limited, Abuja as the General Manager Finance.";
        comments[7] = "Sanni Abass is a lawyer based in abuja,he is a close associate of the groom and hails from kogi state.";
        comments[8] = "Thompson Araki is an Artillery Officer in the Nigerian Army. He's a Major by rank. Popularly known as 'TeeRaks', he works hard and equally socializes well.";
        comments[9] = "Lawrence is an Oron man,  an aspiring farmer who loves good food, an ardent lover of soccer and F1 racing. By day, he applies himself in the energy sector where he is involved in raising capital for energy projects.";
        comments[10] = "Major George Egbe Usibe is of the Nigerian Army Corps of Military Police. He is a dream chaser and a quintessential gentleman with an affinity for excellence.";
        comments[11] = "Hon Nnaji Paul Chidozie Is A Political Scientist Cum Businessman Based In Abuja. He Is A Close Ally Of The Groom.";

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
            case "Squadron Leader Mike Oyadougha":
                imageView.setImageResource(R.drawable.oyadougha);
                portfolio.setText("Best Man");
                desc.setText(comments[6]);
                break;
            case "Sanni Abass":
                imageView.setImageResource(R.drawable.abass);
                portfolio.setText("Groomsman");
                desc.setText(comments[7]);
                break;
            case "Major Thompson Araki":
                imageView.setImageResource(R.drawable.araki);
                portfolio.setText("Groomsman");
                desc.setText(comments[8]);
                break;
            case "Lawrence":
                imageView.setImageResource(R.drawable.lawrence);
                portfolio.setText("Groomsman");
                desc.setText(comments[9]);
                break;
            case "Major George Egbe Usibe":
                imageView.setImageResource(R.drawable.usibe);
                portfolio.setText("Groomsman");
                desc.setText(comments[10]);
                break;
            case "Hon Nnaji Paul Chidozie":
                imageView.setImageResource(R.drawable.chidozie);
                portfolio.setText("Close Friend");
                desc.setText(comments[11]);
                break;
            default:
                return;

        }
//        imageView.setImageResource(R.drawable.anjorin);
//        imageView.setImageBitmap(bitmap);
    }
}
