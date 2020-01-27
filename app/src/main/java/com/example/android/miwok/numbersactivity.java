package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class numbersactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbersactivity);
        ArrayList<String> number = new ArrayList<>();
        number.add("one");
        number.add("two");
        number.add("three");
        number.add("four");
        number.add("five");
        number.add("six");
        number.add("seven");
        number.add("eight");
        number.add("nine");
        number.add("ten");

    }
}
