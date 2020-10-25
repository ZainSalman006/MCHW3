package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Second_activity extends AppCompatActivity {

    TextView tView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity);

        tView = findViewById(R.id.textView2);

        Intent intent = getIntent();
        String str1 = intent.getStringExtra("rb1");
        String str2 = intent.getStringExtra("rb2");
        String str3 = intent.getStringExtra("rb3");
        String str4 = intent.getStringExtra("rb4");
        String str5 = intent.getStringExtra("R1");
        String str6 = intent.getStringExtra("R2");

        if(!(str1=="null"))
        {
            tView.setText(str1);
        }
        if(!(str2=="null"))
        {
            tView.setText(tView.getText()+" "+str2);
        }
        if(!(str3=="null"))
        {
            tView.setText(tView.getText()+" "+str3);
        }
        if(!(str4=="null"))
        {
            tView.setText(tView.getText()+" "+str4);
        }

        tView.setText(tView.getText()+" "+str5+" "+str6);

    }
}