package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {
Button clk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        clk=(Button) findViewById(R.id.button);

    }
    public void movepage2(View v)
    {
        Intent prevpage=new Intent(Activity2.this,MainActivity.class);
        startActivity(prevpage);

    }

}