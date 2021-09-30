package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signup_activity extends AppCompatActivity {

    EditText email,password;
    Button btnreg,btnlogin;
    dbhelper myDB;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        email=(EditText)findViewById(R.id.email);
        password=(EditText)findViewById(R.id.password);

        btnreg=(Button) findViewById(R.id.registerpg_btn);
        btnlogin=(Button) findViewById(R.id.loginpg_btn);

        myDB=new dbhelper(this);

        btnreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mail=email.getText().toString();
                String pass=password.getText().toString();

                if(mail.equals("") || pass.equals(""))
                {
                    Toast.makeText(signup_activity.this, "Fill all the fields", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Boolean validcheckemail = myDB.checkemail(mail);
                    if(validcheckemail==false)
                    {
                        Boolean regresult=myDB.insertData(mail,pass);
                        if (regresult==true)
                        {
                            Toast.makeText(signup_activity.this, "Registration successful", Toast.LENGTH_SHORT).show();
                            Intent intent=new Intent(getApplicationContext(),login_activity.class);
                            startActivity(intent);
                        }
                        else
                        {
                            Toast.makeText(signup_activity.this, "Registration unsuccessful", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else{
                        Toast.makeText(signup_activity.this, "User already exists", Toast.LENGTH_SHORT).show();


                    }



                }
            }
        });
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),login_activity.class);
                startActivity(intent);
            }
        });



    }
}