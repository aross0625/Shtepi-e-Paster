package com.set.cleaningapplicationtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class ServicesScreen extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services_screen);

        listView = findViewById(R.id.listView);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("1) Pastrimi bazik apartamenti 1+1");
        arrayList.add("2) Pastrimi bazik apartamenti 2+1");
        arrayList.add("3) Pastrimi bazik apartamenti 3+1");
        arrayList.add("4) Pastrimi gjenera");
        arrayList.add("5) Pastrim kendi");
        arrayList.add("6) Pastrim dysheku");
        arrayList.add("7) Pastrim dysheku dopio");
        arrayList.add("8) Higjenizim I siperfaqes tualetit guzhines");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,arrayList);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0){

                    Intent startIntent = new Intent(getApplicationContext(), Service1.class);
                    startIntent.putExtra("Something new", "Something new");
                    startActivity(startIntent);

                }
                if (i==1){

                    Intent startIntent = new Intent(getApplicationContext(), Service2.class);
                    startIntent.putExtra("Something new", "Something new");
                    startActivity(startIntent);

                }
                if (i==2){

                    Intent startIntent = new Intent(getApplicationContext(), Service3.class);
                    startIntent.putExtra("Something new", "Something new");
                    startActivity(startIntent);

                }
                if (i==3){

                    Intent startIntent = new Intent(getApplicationContext(), Service4.class);
                    startIntent.putExtra("Something new", "Something new");
                    startActivity(startIntent);

                }
                if (i==4){

                    Intent startIntent = new Intent(getApplicationContext(), Service5.class);
                    startIntent.putExtra("Something new", "Something new");
                    startActivity(startIntent);

                }
                if (i==5){

                    Intent startIntent = new Intent(getApplicationContext(), Service6.class);
                    startIntent.putExtra("Something new", "Something new");
                    startActivity(startIntent);

                }
                if (i==6){

                    Intent startIntent = new Intent(getApplicationContext(), Service7.class);
                    startIntent.putExtra("Something new", "Something new");
                    startActivity(startIntent);

                }
                if (i==7){

                    Intent startIntent = new Intent(getApplicationContext(), Service8.class);
                    startIntent.putExtra("Something new", "Something new");
                    startActivity(startIntent);

                }
            }
        });

    }
}