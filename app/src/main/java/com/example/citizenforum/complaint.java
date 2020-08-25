package com.example.citizenforum;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.io.FileNotFoundException;

public class complaint extends AppCompatActivity {

    FloatingActionButton cam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complaint);
        cam=findViewById(R.id.pic);
        cam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI),1);

            }
        });

    }

    @Override
    protected  void onActivityResult(int requestcode,int resultcode,Intent data)
    {
        super.onActivityResult(requestcode,resultcode,data);
        if(requestcode==1 && resultcode== Activity.RESULT_OK)
        {
            Uri selected=data.getData();
            Bitmap bitmap=null;
            try{
                bitmap=MediaStore.Images.Media.getBitmap(this.getContentResolver(),selected);

            }catch(Exception e)
            {
                Toast.makeText(getApplicationContext(), "Error while uploading", Toast.LENGTH_SHORT).show();

            }
        }
    }
}
