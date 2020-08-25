package com.example.citizenforum;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class inform extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        FloatingActionButton  btn = findViewById(R.id.land);
        FloatingActionButton btn2 = findViewById(R.id.trans);
        FloatingActionButton btn3= findViewById(R.id.tneb);
        FloatingActionButton btn4 = findViewById(R.id.vote);
        FloatingActionButton btn5 =findViewById(R.id.aad);
        FloatingActionButton btn6 =findViewById(R.id.certifi);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String google = "https://eservices.tn.gov.in/eservicesnew/index.html";
                Uri web = Uri.parse(google);

                Intent intentnew = new Intent(Intent.ACTION_VIEW, web);
                startActivity(intentnew);


            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String google = "https://tnsta.gov.in/";
                Uri web = Uri.parse(google);

                Intent intentnew = new Intent(Intent.ACTION_VIEW, web);
                startActivity(intentnew);


            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String google = "https://www.tnebnet.org/awp/login?locale=en";
                Uri web = Uri.parse(google);

                Intent intentnew = new Intent(Intent.ACTION_VIEW, web);
                startActivity(intentnew);


            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String google = "https://www.nvsp.in/";
                Uri web = Uri.parse(google);

                Intent intentnew = new Intent(Intent.ACTION_VIEW, web);
                startActivity(intentnew);


            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String google = "https://www.nvsp.in/";
                Uri web = Uri.parse(google);

                Intent intentnew = new Intent(Intent.ACTION_VIEW, web);
                startActivity(intentnew);


            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String google = "https://www.nvsp.in/";
                Uri web = Uri.parse(google);

                Intent intentnew = new Intent(Intent.ACTION_VIEW, web);
                startActivity(intentnew);


            }
        });


    }
}
