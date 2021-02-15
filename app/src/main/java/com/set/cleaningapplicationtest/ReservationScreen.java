package com.set.cleaningapplicationtest;

import androidx.appcompat.app.AppCompatActivity;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.text.InputType;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.content.Intent;
import java.util.Calendar;

public class ReservationScreen extends AppCompatActivity {

    Button Submit;
    TextView Title;
    TextView LittleTitle;
    EditText Name;
    EditText Address;
    EditText Date;
    EditText Time;
    EditText Phone;
    DatePickerDialog picker;
    TimePickerDialog picker2;

    String value1, value2, value3, value4, value5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation_screen);

        // Initializing all of the app components

        Submit = findViewById(R.id.Submit);
        Title = findViewById(R.id.Title);
        LittleTitle = findViewById(R.id.LittleTitle);
        Name = (EditText) findViewById(R.id.Name);
        Address = (EditText) findViewById(R.id.Address);
        Date = (EditText) findViewById(R.id.Date);
        Time = (EditText) findViewById(R.id.Time);
        Phone = (EditText) findViewById(R.id.Phone);

        //Getting the Date with the Calendar Picker

        Date.setInputType(InputType.TYPE_NULL);
        Date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Calendar cldr = Calendar.getInstance();
                int day = cldr.get(Calendar.DAY_OF_MONTH);
                int month = cldr.get(Calendar.MONTH);
                int year = cldr.get(Calendar.YEAR);
                // date picker dialog
                picker = new DatePickerDialog(ReservationScreen.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                                Date.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                            }
                        }, year, month, day);
                picker.show();
            }
        });

        //Getting the Time with the Time Picker

        Time.setInputType(InputType.TYPE_NULL);
        Time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Calendar cldr2 = Calendar.getInstance();
                int hours = cldr2.get(Calendar.HOUR_OF_DAY);
                int minutes = cldr2.get(Calendar.MINUTE);
                // time picker dialog
                picker2 = new TimePickerDialog(ReservationScreen.this,
                        new TimePickerDialog.OnTimeSetListener() {
                            @Override
                            public void onTimeSet(TimePicker tp, int sHour, int sMinute) {
                                Time.setText(sHour + ":" + sMinute);
                            }
                        }, hours, minutes, false);
                picker2.show();
            }
        });

        // What happens when someone didn't input the correct data

        // Name.setError("You must input a valid name to continue");
        // Address.setError("You must input a valid address to continue");
        // Date.setError("You must input a valid date to continue");
        // Time.setError("You must input a valid time to continue");
        // Date.setError("You must input a valid date to continue");
        // Phone.setError("You must input a valid phone to continue");

        // What happens when the "Submit" button is clicked

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Retrieve all data from inputs

                value1 = Name.getText().toString();
                value2 = Address.getText().toString();
                value3 = Date.getText().toString();
                value4 = Time.getText().toString();
                value5 = Phone.getText().toString();

                // Send all data from inputs
                Intent startIntent = new Intent(getApplicationContext(), ReservationQuestionScreen.class);
                startIntent.putExtra("ClientName", value1);
                startIntent.putExtra("ClientAddress", value2);
                startIntent.putExtra("ClientDate", value3);
                startIntent.putExtra("ClientTime", value4);
                startIntent.putExtra("ClientPhoneNumber", value5);
                startActivity(startIntent);
            }
        });


    }

}
