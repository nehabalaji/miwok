package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class numbersactivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


       final ArrayList<Word> number = new ArrayList<>();
        number.add(new Word("one","lutti", R.drawable.number_one, R.raw.number_one));
        number.add(new Word("two","otiiko", R.drawable.number_two,R.raw.number_two));
        number.add(new Word("three","tolookosu",R.drawable.number_three,R.raw.number_three));
        number.add(new Word("four","oyyisa",R.drawable.number_four,R.raw.number_four));
        number.add(new Word("five","massokka",R.drawable.number_five,R.raw.number_five));
        number.add(new Word("six","temmokka",R.drawable.number_six,R.raw.number_six));
        number.add(new Word("seven","kenekaku",R.drawable.number_seven,R.raw.number_seven));
        number.add(new Word("eight","kawinta",R.drawable.number_eight,R.raw.number_eight));
        number.add(new Word("nine","wo'e",R.drawable.number_nine,R.raw.number_nine));
        number.add(new Word("ten","na'aacha",R.drawable.number_ten,R.raw.number_ten));

        WordAdapter Adapter = new WordAdapter(this, number,R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(Adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Word word = number.get(i);
                mMediaPlayer = MediaPlayer.create(numbersactivity.this,word.getmAudioResId());
                mMediaPlayer.start();
            }
        });



    }
}
