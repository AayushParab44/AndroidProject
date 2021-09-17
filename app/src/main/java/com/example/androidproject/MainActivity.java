package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button clk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clk=(Button) findViewById(R.id.button);

    }
    public void movepage(View V)
    {
        Intent next_page=new Intent(MainActivity.this,Activity2.class);
        startActivity(next_page);

    }
    public void prevpage(View V)
    {
        Intent prev_page=new Intent(MainActivity.this,MainActivity0.class);
        startActivity(prev_page);

    }

}