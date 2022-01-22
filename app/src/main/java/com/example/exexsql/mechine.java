package com.example.exexsql;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class mechine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechine);
    }

    public void pannel(View view) {

        Intent it = new Intent(this,pannel.class);

        startActivity(it);

        finish();

    }

    public void inverter(View view) {

        Intent it = new Intent(this,inverter.class);

        startActivity(it);

        finish();

    }

    public void displaylist(View view) {

        Intent it = new Intent(this,listActivity.class);

        startActivity(it);

        finish();

    }
}