package com.example.heshammostafa.animationpart5activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Push(View view) {
        startActivity(new Intent(MainActivity.this,scound.class));
    overridePendingTransition(R.anim.activity_open_translate,R.anim.activity_close_translate);
    }

    public void Slide(View view) {
        startActivity(new Intent(MainActivity.this,scound.class));
        overridePendingTransition(R.anim.activity_open_push_up_in,R.anim.activity_push_up_out);

    }
}
