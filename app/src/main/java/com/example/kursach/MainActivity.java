package com.example.kursach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    private Object Intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void moscow(View view) {
        Intent a = new Intent(this, Moscow.class);
        startActivity(a);
        finish();
    }

    public void piter(View view) {
        Intent a = new Intent(this, Piter.class);
        startActivity(a);
        finish();
    }

    public void sochi(View view) {
        Intent a = new Intent(this, Sochi.class);
        startActivity(a);
        finish();
    }

    public void anapa(View view) {
        Intent a = new Intent(this, Anapa.class);
        startActivity(a);
        finish();
    }

    public void yalta(View view) {
        Intent a = new Intent(this, Yalta.class);
        startActivity(a);
        finish();
    }

    public void gelik(View view) {
        Intent a = new Intent(this, Gelik.class);
        startActivity(a);
        finish();
    }

    public void kazan(View view) {
        Intent a = new Intent(this, Kazan.class);
        startActivity(a);
        finish();
    }

    public void karelia(View view) {
        Intent a = new Intent(this, Karelia.class);
        startActivity(a);
        finish();
    }

    public void altai(View view) {
        Intent a = new Intent(this, Altai.class);
        startActivity(a);
        finish();
    }
}

