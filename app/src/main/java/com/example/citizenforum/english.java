package com.example.citizenforum;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class english extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);

        Button btn = (Button) findViewById(R.id.button);
        Button btn2 = (Button) findViewById(R.id.Location);
        Button btn3= (Button) findViewById(R.id.Sports);
        Button btn4 = (Button) findViewById(R.id.Tech);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String google = "https://timesofindia.indiatimes.com";
                Uri web = Uri.parse(google);

                Intent intentnew = new Intent(Intent.ACTION_VIEW, web);
                startActivity(intentnew);


            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String google = "https://timesofindia.indiatimes.com/city/chennai";
                Uri web = Uri.parse(google);

                Intent intentnew = new Intent(Intent.ACTION_VIEW, web);
                startActivity(intentnew);


            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String google = "https://timesofindia.indiatimes.com/sports";
                Uri web = Uri.parse(google);

                Intent intentnew = new Intent(Intent.ACTION_VIEW, web);
                startActivity(intentnew);


            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String google = "https://www.gadgetsnow.com/?utm_source=toiweb&utm_medium=referral&utm_campaign=toiweb_hptopnav";
                Uri web = Uri.parse(google);

                Intent intentnew = new Intent(Intent.ACTION_VIEW, web);
                startActivity(intentnew);


            }
        });


    }
}