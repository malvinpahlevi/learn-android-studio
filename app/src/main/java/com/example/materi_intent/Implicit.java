package com.example.materi_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
/*
* Implicit responsibility for doin Task internal android
* like call number, open library, see contact etc
* */
public class Implicit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit);
    }

    public void panggil(View view){
        //declared
        String nomor = "08134567890";
        Intent panggil = new Intent(Intent.ACTION_DIAL);
        panggil.setData(Uri.fromParts("tel",nomor,null));
        startActivity(panggil);
    }
}