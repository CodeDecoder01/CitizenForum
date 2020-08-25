package com.example.citizenforum;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button login;
EditText emailid;
EditText password;
Button sign;
String emailpattern="[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login=findViewById(R.id.login);
        emailid=findViewById(R.id.email);
        password=findViewById(R.id.password);
        sign=findViewById(R.id.signup);
        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v) {
                if (emailid.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter Email id", Toast.LENGTH_SHORT).show();
                } else if (password.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter Password", Toast.LENGTH_SHORT).show();
                } else if (!emailid.getText().toString().trim().matches(emailpattern)) {
                    Toast.makeText(getApplicationContext(), "Invalid Email id", Toast.LENGTH_SHORT).show();
                } else if (password.getText().toString().length() > 12) {
                    Toast.makeText(getApplicationContext(), "Enter a shorter password", Toast.LENGTH_SHORT).show();
                } else
                {
                    Intent startintent=new Intent(getApplicationContext(),Menus.class);
                    startActivity(startintent);
                }
            }
        });

        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startintent=new Intent(getApplicationContext(),signup.class);
                startActivity(startintent);
            }
        });



    }
}

