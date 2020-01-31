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
        final ArrayList<Word> color = new ArrayList<>();
        color.add(new Word("red","weṭeṭṭi",R.drawable.color_red));
        color.add(new Word("green","chokokki",R.drawable.color_green));
        color.add(new Word("brown","ṭakaakki",R.drawable.color_brown));
        color.add(new Word("gray","ṭopoppi",R.drawable.color_gray));
        color.add(new Word("black","kululli",R.drawable.color_black));
        color.add(new Word("white","kelelli",R.drawable.color_white));
        color.add(new Word("dusty yellow","ṭopiisә",R.drawable.color_dusty_yellow));
        color.add(new Word("mustard yellow","chiwiiṭә",R.drawable.color_mustard_yellow));

        WordAdapter adapter1 = new WordAdapter(this, color, R.color.category_colors);
        ListView listview1 = (ListView) findViewById(R.id.list);

        assert listview1 != null;
        listview1.setAdapter(adapter1);
    }
}
