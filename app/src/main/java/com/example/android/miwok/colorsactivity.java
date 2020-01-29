package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class colorsactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> color = new ArrayList<>();
        color.add(new Word("red","weṭeṭṭi"));
        color.add(new Word("green","chokokki"));
        color.add(new Word("brown","ṭakaakki"));
        color.add(new Word("gray","ṭopoppi"));
        color.add(new Word("black","kululli"));
        color.add(new Word("white","kelelli"));
        color.add(new Word("dusty yellow","ṭopiisә"));
        color.add(new Word("mustard yellow","chiwiiṭә"));

        WordAdapter adapter1 = new WordAdapter(this, color);
        ListView listview1 = (ListView) findViewById(R.id.list);

        assert listview1 != null;
        listview1.setAdapter(adapter1);
    }
}
