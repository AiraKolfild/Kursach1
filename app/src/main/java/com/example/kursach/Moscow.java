package com.example.kursach;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Moscow extends AppCompatActivity {


    private Object view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.moscow);
    }
        public void OnClick (View view){
            Intent a = new Intent(this, MainActivity.class);
            startActivity(a);
            finish();

        }
    }

