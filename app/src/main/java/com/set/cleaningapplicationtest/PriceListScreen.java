package com.set.cleaningapplicationtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class PriceListScreen extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_price_list_screen);

        listView = findViewById(R.id.listView);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Service #1: 3000 Leke");
        arrayList.add("Service #2: 4500 Leke");
        arrayList.add("Service #3: 5000 Leke");
        arrayList.add("Service #4: 100 deri ne 300 Leke per meter");
        arrayList.add("Service #5: 3500/4500 Leke");
        arrayList.add("Service #6: 1800 Leke");
        arrayList.add("Service #7: 2500 Leke");
        arrayList.add("Service #8: 3000/4500 Leke");

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