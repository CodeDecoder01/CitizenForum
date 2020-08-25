package com.example.citizenforum;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class signup extends AppCompatActivity {
    Button login,signup;
    EditText emailid,aad;
    EditText password,cpassword;
    String emailpattern="[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        AutoCompleteTextView tv=findViewById(R.id.autoCompleteTextView);
        //Spinner drop = findViewById(R.id.drop);
        String[] zones = new String[]{"Zone", "Thiruvottiyur", "Manali", "Madhavaram", "Tondiarpet",
                "Royapuram", "Thiru Vi Ka nagar", "Ambattur", "Anna Nagar", "Teynampet", "Kodambakkam", "Valsaravakkam"
                , "Alandur", "Adyar", "Perungudi", "Sholinganallur"};
        ArrayAdapter<String> adapt = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,zones);

            tv.setAdapter(adapt);
        /*drop.setOnItemClickListener(this);


        final ArrayAdapter<String> spinnerArr = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,zones) {
            spinnerArr.setDropDownResource(android.R.layout.simple_spinner_dropdown_item);
            drop.setAdapter(spinnerArr);
            @Override
            public boolean isEnabled(int pos) {
                if (pos == 0)
                    return false;
                else
                    return true;

            }

            @Override
            public View getDropDownView(int position, View convertview, ViewGroup parent) {
                {
                    View view = super.getDropDownView(position, convertview, parent);
                    TextView tv = (TextView) view;
                    if (position == 0)
                        tv.setTextColor(Color.GRAY);

                    else
                        tv.setTextColor(Color.BLACK);

                    return view;
                }
            }

            ;

            spinnerArr.setDropDownViewResource(
            R.layout.simple_spinner_item _);


        };*/
        login=findViewById(R.id.login2);
        emailid=findViewById(R.id.email2);
        password=findViewById(R.id.password2);
        cpassword=findViewById(R.id.cpassword2);
        signup=findViewById(R.id.signup2);
        aad=findViewById(R.id.Aadhar);
        signup.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v)
            {
                if(emailid.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Enter Email id",Toast.LENGTH_SHORT).show();
                }
                else if(password.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Enter Password",Toast.LENGTH_SHORT).show();
                }
                else if(cpassword.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Enter confirm Password",Toast.LENGTH_SHORT).show();
                }
                else if(!(password.getText().toString().equals(cpassword.getText().toString())))
                    Toast.makeText(getApplicationContext(),"Password mismatch",Toast.LENGTH_SHORT).show();
                else if(!emailid.getText().toString().trim().matches(emailpattern)){
                    Toast.makeText(getApplicationContext(),"Invalid Email id",Toast.LENGTH_SHORT).show();
                }
                else if(aad.getText().toString().length()!=12)
                {
                    Toast.makeText(getApplicationContext(),"Aadhar number length mismatch",Toast.LENGTH_SHORT).show();
                }
                else if(password.getText().toString().length()>12)
                {
                    Toast.makeText(getApplicationContext(),"Enter a shorter password",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent startintent=new Intent(getApplicationContext(),Menus.class);
                    startActivity(startintent);
            }
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startintent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(startintent);
            }
        });
    }
}

