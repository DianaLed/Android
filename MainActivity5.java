package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MainActivity5 extends AppCompatActivity {
    private EditText day;
    private EditText month;
    private EditText year;
    private Button posmotr;
    int d=0, m=0, y=0;
    private CalendarView cal;
    private Calendar calendar;

    private Button button_last;
    private Button button_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        day=(EditText) findViewById(R.id.editTextTextPersonName2);
        month=(EditText) findViewById(R.id.editTextTextPersonName3);
        year=(EditText) findViewById(R.id.editTextTextPersonName4);
        posmotr=(Button) findViewById(R.id.button7);
        cal=(CalendarView) findViewById(R.id.calendarView);
        calendar=new GregorianCalendar(y, m-1, d);
        posmotr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                d=Integer.parseInt (String.valueOf(day.getText()));
                m=Integer.parseInt (String.valueOf(month.getText()));
                y=Integer.parseInt (String.valueOf(year.getText()));
                calendar.set(y, m-1, d);

                cal.setDate(calendar.getTimeInMillis(), true, true);
            }
        });

        cal.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                int mYear = i;
                int mMonth = i1;
                int mDay = i2;
                day.setText(String.valueOf(mDay));
                month.setText(String.valueOf(mMonth+1));
                year.setText(String.valueOf(mYear));
            }
        });
        button_last = (Button) findViewById(R.id.button2);
        button_last.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3=new Intent(MainActivity5.this, MainActivity234.class);
                startActivity(intent3);
            }
        });
        button_next = (Button) findViewById(R.id.button3);
        button_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4=new Intent(MainActivity5.this, MainActivity6.class);
                startActivity(intent4);
            }
        });
    };
}