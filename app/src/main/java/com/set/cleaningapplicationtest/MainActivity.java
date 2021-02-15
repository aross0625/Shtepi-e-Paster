package com.set.cleaningapplicationtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

ImageView image1;
ImageView image2;
ImageView image3;
ImageView image4;
ImageView image5;
ImageView image6;
TextView text1;
TextView text2;
TextView text3;
TextView text4;
TextView text5;
TextView text6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        image3 = findViewById(R.id.image3);
        image4 = findViewById(R.id.image4);
        image5 = findViewById(R.id.image5);
        image6 = findViewById(R.id.image6);
        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        text3 = findViewById(R.id.text3);
        text4 = findViewById(R.id.text4);
        text5 = findViewById(R.id.text5);
        text6 = findViewById(R.id.text6);

        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), ReservationScreen.class);
                startIntent.putExtra("Something new", "Something new");
                startActivity(startIntent);
            }
        });

        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), AboutUsScreen.class);
                startIntent.putExtra("Something new", "Something new");
                startActivity(startIntent);
            }
        });

        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), ServicesScreen.class);
                startIntent.putExtra("Something new", "Something new");
                startActivity(startIntent);
            }
        });

        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), PriceListScreen.class);
                startIntent.putExtra("Something new", "Something new");
                startActivity(startIntent);
            }
        });

        image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), FAQScreen.class);
                startIntent.putExtra("Something new", "Something new");
                startActivity(startIntent);
            }
        });

        image6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), ContactUsScreen.class);
                startIntent.putExtra("Something new", "Something new");
                startActivity(startIntent);
            }
        });

        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), ReservationScreen.class);
                startIntent.putExtra("Something new", "Something new");
                startActivity(startIntent);
            }
        });

        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), AboutUsScreen.class);
                startIntent.putExtra("Something new", "Something new");
                startActivity(startIntent);
            }
        });

        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), ServicesScreen.class);
                startIntent.putExtra("Something new", "Something new");
                startActivity(startIntent);
            }
        });

        text4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), PriceListScreen.class);
                startIntent.putExtra("Something new", "Something new");
                startActivity(startIntent);
            }
        });

        text5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), FAQScreen.class);
                startIntent.putExtra("Something new", "Something new");
                startActivity(startIntent);
            }
        });

        text6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), ContactUsScreen.class);
                startIntent.putExtra("Something new", "Something new");
                startActivity(startIntent);
            }
        });

    }

}

