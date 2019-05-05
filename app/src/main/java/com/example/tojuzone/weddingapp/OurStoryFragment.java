package com.example.tojuzone.weddingapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class OurStoryFragment extends Fragment {

    private TextView maleText;
    private TextView femaleText;


    public OurStoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mView = inflater.inflate(R.layout.fragment_our_story, container, false);

        maleText = mView.findViewById(R.id.male_story_text);
        femaleText = mView.findViewById(R.id.female_story_text);

        maleText.setText("This is not your regular love story. Infact, this is no love story at all.\n" +
                "\n" +
                "Ours is a story of a love that grew from a bond to a friendship, to a partnership and then to a love that let me know I never wanted to be far away from her forever.\n" +
                "\n" +
                "I met Michelle for the first time on the 6th of January 2018 at a mutual friend's wedding. Most love stories often have either the man or the lady immediately awestruck by the other or conclude that they knew they had met their partners, especially if the meeting takes place at a wedding.\n" +
                "\n" +
                "This was certainly not the case for me. Hahahaha. I was however captivated by her charm of innocence and her calm reserve, so I took the bold step and approached her. We exchanged phone numbers in a hurry as she was already on her way home and was only waiting for her mom. All thanks to her mom for the brief delay and that was it.\n" +
                "\n" +
                "There is a saying that when you meet your better half and soulmate, by design, fate always finds a way to bring you both together. This could be what occured when after two weeks I finally called her -I wonder what she thought of me\uD83D\uDE03.\n" +
                "\n" +
                "Our first phone conversation is what people refer to as \"speaking as though we had known each other forever\", it was smooth, interactive and serene (remember I said we grew from a bond?).\n" +
                "\n" +
                "I was particularly drawn to Michelle's intelligence and her knowledge of the military. Her eloquence in military jargons/slangs further grew my attachment to her. You know, once you put on the uniform, grow through thick and thin together, the military becomes your family and your colleagues your brothers. So Michelle, you are like a brother to me.\n" +
                "\n" +
                "As a sojah man, I had not yet realised I had fallen in love with her. But I loved her charisma, her calm and her personality. The emotions had started building, I just didn't know it yet. So we planned our first date.\n" +
                "\n" +
                "The gentleman in me surfaced when we went for pizza and icecream -which she wanted- instead of the pounded yam I would have instead eaten. Our conversation was lively and binding, so after pizza, we went to see a movie. By the end of the day, if I had any doubt as to how I felt, it was erased completely with a kiss.\n" +
                "\n" +
                "Although I asked her out officially, we already knew where we were heading. We were building something strong. The exigencies of duty made it impossible for me to see her as frequently as I would have wished, but I made certain I did when the opportunity arose. 'As a brother at arms', she understood. \n" +
                "\n" +
                "One year after, on our anniversary, I asked her to marry me and she said yes!\n" +
                "\n" +
                "Michelle Tujuola Omoogun, you are my peace, my partner and my friend, with you has been a bond held with love. In this love I want to grow with you, you are where I call home");


        femaleText.setText("Hmm.. Where do I start from \uD83D\uDE05\n" +
                "\n" +
                "Its been an amazing and exciting journey for us and it all started on the 6th of January 2018 at about 7:30pm \uD83D\uDE01  yeah am that detailed \uD83D\uDE09\uD83D\uDE09\n" +
                "So I was about leaving the wedding reception venue of a mutual friend, when my mom decided to follow a wrong exit after I had advised it wasn’t where we came from or parked the car. So I waited for her to go check and come back so we could follow the right route. And there I noticed this officer (It was a military wedding)  starring at me and as I moved forward he moved closer with a friend of his, after a while he approached me with a very beautiful smile and wanted to talk but I told him I was leaving already as my mom was coming back, so he asked for my number immediately and I gave him. I heard nothing from him till about 2 weeks later, I had even forgotten I met someone then he sent a message and called… He was so sweet on the phone just like he is in person, we started talking and it felt like we had known all our lives but as a chicky babe na \uD83D\uDE09\uD83D\uDE09\uD83D\uDE01\uD83D\uDE01 I had to still form activity \uD83E\uDD23 we got close very fast and his sweetness and calmness got me intrigued. As we got to know each other better I fell hard for his intelligence and sincerity cause we had that in common, not leaving out his dedication to serve his country. \n" +
                "\tWe bonded fast (am sure you been thinking we had met \uD83D\uDE1C), no so we planned our first date 3 weeks after we started talking, he was patient with me cause I wasn’t ready yet to go on a date till I was sure of starting something. Our first date was amazing we went for pizza and ice cream which typically am not a fan of (cause am not the regular girl) but I had to be girly  \uD83D\uDE02\uD83E\uDD23 and afterwards a movie. That day was so surreal and it ended with a kiss and as a gentleman he dropped me off at home at about 7:00pm (cause I had curfew ☺☺). \n" +
                "So from the beginning we both knew we were heading somewhere and overtime he has been amazing, loving, protective, caring and practically everything a woman can ever ask for. Though we had our ups and downs but our love still kept us. Finally on our anniversary he proposed in the most amazing way and I said a big “YES”. Dominic Uchechukwu Anaekwe \n" +
                "I can’t wait to spend eternity with you.  I will love you forever and one thing I can promise you, is to always be by your side as your queen and strength through it all.");
        return mView;
    }

}
