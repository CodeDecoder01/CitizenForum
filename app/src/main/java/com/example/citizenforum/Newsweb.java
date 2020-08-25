package com.example.citizenforum;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Newsweb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newsweb);
        /*Button btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String google = "http://124.124.61.162";
                Uri web = Uri.parse(google);

                Intent intentnew = new Intent(Intent.ACTION_VIEW, web);
                startActivity(intentnew);*/
        Button eng=findViewById(R.id.english);
        Button tam=findViewById(R.id.tamil);

        eng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent englishi=new Intent(getApplicationContext(),english.class);
                startActivity(englishi);
            }
        });
        /*tam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent tamili=new Intent(getApplicationContext(),tamil.class);
                startActivity(tamili);
            }
        });*/
    }
}
