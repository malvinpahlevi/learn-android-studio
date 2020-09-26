package com.example.materi_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

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

    /*
    * method panggil() for button Telepon
    * */
    public void panggil(View view){
        //declared String for calling number
        String nomor = "08134567890";

        //get function Dial on android to obj panggil
        Intent panggil = new Intent(Intent.ACTION_DIAL);

        panggil.setData(Uri.fromParts("tel",nomor,null));

        //do activity
        startActivity(panggil);
    }

    /*
    * method buka() for button Buka Browser
    * */
    public void buka(View view){
        //declared String for url
        String url = "https://www.detik.com/";

        Intent bukabrowser = new Intent(Intent.ACTION_VIEW);
        bukabrowser.setData(Uri.parse(url));
        startActivity(bukabrowser);
    }
}