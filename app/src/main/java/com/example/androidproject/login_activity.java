package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login_activity extends AppCompatActivity {

    EditText email,password;
    Button btnlogin;
    dbhelper myDB;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email=(EditText)findViewById(R.id.email);
        password=(EditText)findViewById(R.id.password);

        btnlogin=(Button) findViewById(R.id.login_btn);

        myDB=new dbhelper(this);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mail=email.getText().toString();
                String pass=password.getText().toString();

                if(mail.equals("") || pass.equals(""))
                {
                    Toast.makeText(login_activity.this, "Fill all the fields", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Boolean result = myDB.checkemailpassword(mail,pass);
                    if(result==true)
                    {
                        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(intent);

                    }
                    else
                    {
                        Toast.makeText(login_activity.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });


    }
}