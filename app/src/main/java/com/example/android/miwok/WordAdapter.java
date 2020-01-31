package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    public WordAdapter( Context context, ArrayList<Word> words) {
        super(context,0, words);
    }
    @NonNull
    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
         View listItemView = convertView;
         if(listItemView==null) {
             listItemView = LayoutInflater.from(getContext()).inflate(
                     R.layout.list_item, parent, false);
         }
             Word word = getItem(position);

                 TextView miwoktextView = (TextView) listItemView.findViewById(R.id.tv1);
                 miwoktextView.setText(word.getmMiwoktranslation());

                 TextView defaulttextView = (TextView) listItemView.findViewById(R.id.tv2);
                 defaulttextView.setText(word.getmDefaulttranslation());

                ImageView imageView = (ImageView) listItemView.findViewById(R.id.list_item1);
                if(word.hasImage()){
                    imageView.setImageResource(word.getmImageResourceId());
                    imageView.setVisibility(View.VISIBLE);
                }
                else
                {
                    imageView.setVisibility(View.GONE);
                }

        return listItemView;
    }
}
