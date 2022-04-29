package com.example.kursach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Piter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piter);
    }

    public void OnClick (View view) {
        Intent s = new Intent(this, MainActivity.class);
        startActivity(s);
        finish();
    }
}