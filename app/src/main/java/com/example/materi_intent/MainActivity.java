package com.example.materi_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get btnimplicit to obj
        Button btnimplicit = findViewById(R.id.btnimplicit);

        //listen onClik on button
        btnimplicit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Implicit.class);
                //doin implicit activity
                startActivity(intent);
            }
        });
    }




}