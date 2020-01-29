package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class numbersactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> number = new ArrayList<>();
        number.add(new Word ("one","lutti"));
        number.add(new Word("two","otiiko"));
        number.add(new Word("three","tolookosu"));
        number.add(new Word("four","oyyisa"));
        number.add(new Word("five","massokka"));
        number.add(new Word("six","temmokka"));
        number.add(new Word("seven","kenekaku"));
        number.add(new Word("eight","kawinta"));
        number.add(new Word("nine","wo'e"));
        number.add(new Word("ten","na'aacha"));

        WordAdapter Adapter = new WordAdapter(this, number);
        ListView listView = (ListView) findViewById(R.id.list);

        assert listView != null;
        listView.setAdapter(Adapter);



    }
}
