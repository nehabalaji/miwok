package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

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





        return listItemView;
    }
}
