package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity0 extends AppCompatActivity {
    Button clk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main0);
        clk=(Button) findViewById(R.id.button);
    }
    public void movepage0(View v)
    {
        Intent nextpage0=new Intent(MainActivity0.this,MainActivity.class);
        startActivity(nextpage0);
    }
    public void login(View v)
    {
        Intent login=new Intent(MainActivity0.this,signup_activity.class);
        startActivity(login);
    }
}