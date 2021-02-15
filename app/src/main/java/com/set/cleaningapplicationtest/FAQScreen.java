package com.set.cleaningapplicationtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FAQScreen extends AppCompatActivity {

    // Initializing all of the app components

    ExpandableListView ExpandableList;
    List<String> listGroup;
    HashMap<String, List<String>> listItem;
    MainAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f_a_q_screen);

        // Initializing all of the app components

        ExpandableList = findViewById(R.id.ExpandableList);
        listGroup = new ArrayList<>();
        listItem = new HashMap<>();
        adapter = new MainAdapter(this,listGroup,listItem);
        ExpandableList.setAdapter(adapter);
        initListData();

    }

    private void initListData(){

        listGroup.add(getString(R.string.question1));
        listGroup.add(getString(R.string.question2));
        listGroup.add(getString(R.string.question3));
        listGroup.add(getString(R.string.question4));

        String[] array;

        List<String> list1 = new ArrayList<>();
        array = getResources().getStringArray(R.array.answer1);
        for (String item : array){

            list1.add(item);
        }

        List<String> list2 = new ArrayList<>();
        array = getResources().getStringArray(R.array.answer2);
        for (String item : array){

            list2.add(item);
        }

        List<String> list3 = new ArrayList<>();
        array = getResources().getStringArray(R.array.answer3);
        for (String item : array){

            list3.add(item);
        }

        List<String> list4 = new ArrayList<>();
        array = getResources().getStringArray(R.array.answer1);
        for (String item : array){

            list4.add(item);
        }


        listItem.put(listGroup.get(0),list1);
        listItem.put(listGroup.get(1),list2);
        listItem.put(listGroup.get(2),list3);
        listItem.put(listGroup.get(3),list4);


        adapter.notifyDataSetChanged();

    }
}