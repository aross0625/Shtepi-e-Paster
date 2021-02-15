package com.set.cleaningapplicationtest;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;


public class ReservationQuestionScreen extends AppCompatActivity {

    CheckBox checkBox2;
    CheckBox checkBox3;
    CheckBox checkBox4;
    CheckBox checkBox5;
    CheckBox checkBox6;
    CheckBox checkBox7;
    CheckBox checkBox8;
    CheckBox checkBox9;
    EditText SpecialRequests;
    EditText OtherInfo;
    Button button;

    String Service1 = "";
    String Service2 = "";
    String Service3 = "";
    String Service4 = "";
    String Service5 = "";
    String Service6 = "";
    String Service7 = "";
    String Service8 = "";

    String Name = "";
    String Address = "";
    String Date = "";
    String Time = "";
    String Phone = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation_question_screen);

        Name = getIntent().getStringExtra("ClientName");
        Address = getIntent().getStringExtra("ClientAddress");
        Date = getIntent().getStringExtra("ClientDate");
        Time = getIntent().getStringExtra("ClientTime");
        Phone = getIntent().getStringExtra("ClientPhoneNumber");

        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);
        checkBox5 = findViewById(R.id.checkBox5);
        checkBox6 = findViewById(R.id.checkBox6);
        checkBox7 = findViewById(R.id.checkBox7);
        checkBox8 = findViewById(R.id.checkBox8);
        checkBox9 = findViewById(R.id.checkBox9);
        SpecialRequests = findViewById(R.id.SpecialRequests);
        OtherInfo = findViewById(R.id.OtherInfo);
        button = findViewById(R.id.button);

        // What happens when the "Submit" button is clicked

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Retrieve all data from inputs

                final boolean one = checkBox2.isChecked();
                final boolean two = checkBox3.isChecked();
                final boolean three = checkBox4.isChecked();
                final boolean four = checkBox5.isChecked();
                final boolean five = checkBox6.isChecked();
                final boolean six = checkBox7.isChecked();
                final boolean seven = checkBox8.isChecked();
                final boolean eight = checkBox9.isChecked();
                final String Extra1 = SpecialRequests.getText().toString();
                final String Extra2 = OtherInfo.getText().toString();

                // Verify whether CheckBoxes are checked

                if (one){
                    Service1 = "Service 1";
                }

                if (two){
                    Service2 = "Service 2";
                }

                if (three){
                    Service3 = "Service 3";
                }

                if (four){
                    Service4 = "Service 4";
                }

                if (five){
                    Service5 = "Service 5";
                }

                if (six){
                    Service6 = "Service 6";
                }

                if (seven){
                    Service7 = "Service 7";
                }

                if (eight){
                    Service8 = "Service 8";
                }

                // Sending the WhatsApp Message to Business Owner

                try {
                    String url = "https://api.whatsapp.com/send?phone="+"+355 0692023500"+"&text="+URLEncoder.encode("Automatic Request from Mobile Application: " + "\"" +  Name + "\"" + " at \"" + Address + "\" has scheduled an appointment for \"" + Date + "\" at \"" + Time + "\".  The following services are requested: " + Service1 + " " + Service2 + " " + Service3 + " " + Service4 + " " + Service5 + " " + Service6 + " " + Service7 + " " + Service8 + ".  They have the following special requests and additional info: \"" + Extra1 + "\" and \"" + Extra2 + "\".  They can be reached at the following number: \"" + Phone + "\"", "UTF-8");
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);

                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }

                // Sending the User to the Submit Page

                /*Intent startIntent = new Intent(getApplicationContext(), ReservationSubmitScreen.class);
                startIntent.putExtra("Something new", "Something new");
                startActivity(startIntent);*/

            }

        });


    }
}