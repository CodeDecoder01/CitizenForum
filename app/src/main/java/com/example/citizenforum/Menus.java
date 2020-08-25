package com.example.citizenforum;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class Menus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menus);

        ImageButton comp=findViewById(R.id.imageButton5);
        comp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent startintent=new Intent(getApplicationContext(),complaint.class);
                    startActivity(startintent);
        }

    });
        ImageButton comp1=findViewById(R.id.imageButton2);
        comp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startintent=new Intent(getApplicationContext(),Newsweb.class);
                startActivity(startintent);
            }

        });

       ImageButton comp2=findViewById(R.id.imageButton4);
        comp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startintent2=new Intent(getApplicationContext(), inform.class);
                startActivity(startintent2);
            }

        });
}
}