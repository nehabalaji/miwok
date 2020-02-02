package com.example.android.miwok;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class phrasesactivity extends AppCompatActivity {
    private MediaPlayer mMediaplayer;

    private MediaPlayer.OnCompletionListener onCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            releaseMediaPlayer();
        }
    };


    @Override
    protected void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        final ArrayList<Word> phrase = new ArrayList<>();
        phrase.add(new Word("Where are you going?","minto wuksus",R.raw.phrase_where_are_you_going));
        phrase.add(new Word("What is your name?","tinnә oyaase'nә",R.raw.phrase_what_is_your_name));
        phrase.add(new Word("My name is...","oyaaset...",R.raw.phrase_my_name_is));
        phrase.add(new Word("How are you feeling?","michәksәs?",R.raw.phrase_how_are_you_feeling));
        phrase.add(new Word("I’m feeling good.","kuchi achit",R.raw.phrase_im_feeling_good));
        phrase.add(new Word("Are you coming?","әәnәs'aa?",R.raw.phrase_are_you_coming));
        phrase.add(new Word("Yes, I’m coming.","hәә’ әәnәm",R.raw.phrase_yes_im_coming));
        phrase.add(new Word("I’m coming.","әәnәm",R.raw.phrase_im_coming));
        phrase.add(new Word("Let’s go.","yoowutis",R.raw.phrase_lets_go));
        phrase.add(new Word("Come here.","әnni'nem",R.raw.phrase_come_here));

        WordAdapter adapter2 = new WordAdapter(this, phrase,R.color.category_phrases);
        ListView listView2 = (ListView) findViewById(R.id.list);

        listView2.setAdapter(adapter2);


        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                releaseMediaPlayer();
                Word word = phrase.get(i);
                mMediaplayer = MediaPlayer.create(phrasesactivity.this, word.getmAudioResId());
                mMediaplayer.start();

            }
        });
    }

    private void releaseMediaPlayer(){
        if(mMediaplayer!=null){
            mMediaplayer.release();
            mMediaplayer = null;
        }
    }

    private AudioManager.OnAudioFocusChangeListener mOnAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() {
        @Override
        public void onAudioFocusChange(int i) {
            if(i == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT || i == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK) {
                mMediaplayer.pause();
                mMediaplayer.seekTo(0);
            }
            else
                if(i == AudioManager.AUDIOFOCUS_GAIN){
                    mMediaplayer.start();
                }
                else
                    if(i==AudioManager.AUDIOFOCUS_LOSS){
                        releaseMediaPlayer();
                    }

        }
    };
}
