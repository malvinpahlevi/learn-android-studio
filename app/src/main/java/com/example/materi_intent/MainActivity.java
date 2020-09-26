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

        /*
        * set btnImplicit to obj
        * */
        Button btnimplicit = findViewById(R.id.btnimplicit);
        //listen onClik button
        btnimplicit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Implicit.class);
                //doin implicit activity
                startActivity(intent);
            }
        });

        /*
        * set btnExplicit to obj
        * */
        Button btnexplicit = findViewById(R.id.btnexplicit);
        //listen onClick button
        btnexplicit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Explicit.class);
                //doin implicit activity
                startActivity(intent);
            }
        });
    }




}