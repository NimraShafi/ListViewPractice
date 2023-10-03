package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        ArrayList<person> arrayList = new ArrayList<>();
        arrayList.add(new person(R.drawable.image,"Nimra Shafi","this is meeeeee"));
        arrayList.add(new person(R.drawable.image,"Nimra Shafi","this is meeeeee"));
        arrayList.add(new person(R.drawable.image,"Nimra Shafi","this is meeeeee"));
        arrayList.add(new person(R.drawable.image,"Nimra Shafi","this is meeeeee"));
        arrayList.add(new person(R.drawable.image,"Nimra Shafi","this is meeeeee"));
        arrayList.add(new person(R.drawable.image,"Nimra Shafi","this is meeeeee"));
        arrayList.add(new person(R.drawable.image,"Nimra Shafi","this is meeeeee"));

        personAdapter personAdapter = new personAdapter(this,R.layout.list_row,arrayList);
        listView.setAdapter(personAdapter);
    }
}