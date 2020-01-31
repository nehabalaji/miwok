package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.ListView;

import java.util.ArrayList;

public class phrasesactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        final ArrayList<Word> phrase = new ArrayList<>();
        phrase.add(new Word("Where are you going?","minto wuksus"));
        phrase.add(new Word("What is your name?","tinnә oyaase'nә"));
        phrase.add(new Word("My name is...","oyaaset..."));
        phrase.add(new Word("How are you feeling?","michәksәs?"));
        phrase.add(new Word("I’m feeling good.","kuchi achit"));
        phrase.add(new Word("Are you coming?","әәnәs'aa?"));
        phrase.add(new Word("Yes, I’m coming.","hәә’ әәnәm"));
        phrase.add(new Word("I’m coming.","әәnәm"));
        phrase.add(new Word("Let’s go.","yoowutis"));
        phrase.add(new Word("Come here.","әnni'nem"));

        WordAdapter adapter2 = new WordAdapter(this, phrase,R.color.category_phrases);
        ListView listView2 = (ListView) findViewById(R.id.list);

        listView2.setAdapter(adapter2);

    }
}
