package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv10_chislo = (TextView)findViewById(R.id.textView10);
        TextView tv12_str = (TextView)findViewById(R.id.textView12);
        TextView tvi_chislo = (TextView)findViewById(R.id.editTextNumber);
        TextView tvi_str = (TextView)findViewById(R.id.editTextNumber2);

        Button button_next=(Button)findViewById(R.id.button);

        tvi_chislo.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                tv10_chislo.setText(tvi_chislo.getText());
                return false;
            }
        });
        tvi_str.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                tv12_str.setText(tvi_str.getText());
                return false;
            }
        });
        button_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, MainActivity234.class);
                startActivity(intent);
            }
        });


    }
}