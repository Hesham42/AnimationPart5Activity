package com.example.heshammostafa.animationpart5activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class Details extends AppCompatActivity {

    private ArrayList<Date.Information> mdata= new Date().getData();
    int postion;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        imageView= (ImageView) findViewById(R.id.details);
        postion=getIntent().getIntExtra("postion",0);
        imageView.setImageResource(mdata.get(postion).Item);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
