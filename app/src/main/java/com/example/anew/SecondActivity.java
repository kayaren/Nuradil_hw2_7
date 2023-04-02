package com.example.anew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
       String data =  getIntent().getStringExtra("kay");
        TextView textView = findViewById(R.id.text_view);
        textView.setText(data);
        Button crash = findViewById(R.id.crash);
        crash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              finishAffinity();


            }
        });

    }
}