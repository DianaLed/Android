package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;

public class MainActivity6 extends AppCompatActivity {

    private SeekBar hour;
    private SeekBar min;
    private SeekBar sec;

    private EditText e_hour;
    private EditText e_minutes;
    private EditText e_sec;

    private Button posmotr;

    private Button button_last;
    private Button button_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        hour=(SeekBar) findViewById(R.id.seekBar2);
        min=(SeekBar) findViewById(R.id.seekBar3);
        sec=(SeekBar) findViewById(R.id.seekBar4);

        posmotr=(Button) findViewById(R.id.button10);

        e_hour=(EditText)findViewById(R.id.editTextTextPersonName);
        e_minutes=(EditText)findViewById(R.id.editTextTextPersonName5);
        e_sec=(EditText)findViewById(R.id.editTextTextPersonName6);

        hour.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                e_hour.setText(String.valueOf(i));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        min.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                e_minutes.setText(String.valueOf(i));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        sec.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                e_sec.setText(String.valueOf(i));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        posmotr.setOnClickListener(new View.OnClickListener() {
            int h, m, s;
            public void onClick(View view) {
                h=Integer.parseInt (String.valueOf(e_hour.getText()));
                m=Integer.parseInt (String.valueOf(e_minutes.getText()));
                s=Integer.parseInt (String.valueOf(e_sec.getText()));
                hour.setProgress(h);
                min.setProgress(m);
                sec.setProgress(s);
            }
        });

        button_last = (Button) findViewById(R.id.button8);
        button_last.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5=new Intent(MainActivity6.this, MainActivity5.class);
                startActivity(intent5);
            }
        });
        button_next = (Button) findViewById(R.id.button9);
        button_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6=new Intent(MainActivity6.this, MainActivity7.class);
                startActivity(intent6);
            }
        });
    }
}