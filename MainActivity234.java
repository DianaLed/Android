package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity234 extends AppCompatActivity {
    private boolean click=false;
    int size_click=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main234);

        Resources resources = getResources();
        int backgroundColor1 = resources.getColor(R.color.purple_200, null);
        int backgroundColor2 = resources.getColor(R.color.purple_500,  null);

        TextView tw4_push = (TextView)findViewById(R.id.textView3);
        TextView tv2_num = (TextView)findViewById(R.id.textView5);

        Button button = (Button) findViewById(R.id.button6);
        button.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                tw4_push.setText("Отпусти кнопочку!");
                return false;
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(click){
                    //не нажато
                    tw4_push.setText("Отпущена");
                    size_click++;
                    button.setBackgroundColor(backgroundColor2);
                    tv2_num.setText(Integer.toString(size_click));
                    click=false;
                }else{
                    //нажато
                    tw4_push.setText("Нажата");
                    size_click++;
                    button.setBackgroundColor(backgroundColor1);
                    tv2_num.setText(Integer.toString(size_click));
                    click=true;
                }
            }
        });

        Button button_last=(Button)findViewById(R.id.button5);
        button_last.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(MainActivity234.this, MainActivity.class);
                startActivity(intent1);
            }
        });

        Button button_next=(Button)findViewById(R.id.button4);
        button_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(MainActivity234.this, MainActivity5.class);
                startActivity(intent2);
            }
        });
    }
}