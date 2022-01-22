package com.example.exexsql;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class inverter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inverter);
    }

    public void displaylist(View view) {

        Intent it = new Intent(this,listActivity.class);

        startActivity(it);

        finish();

    }

    public void inverter1(View view) {

        Intent it = new Intent(this,inverter1.class);

        startActivity(it);

        finish();

    }

    public void inverter2(View view) {

        Intent it = new Intent(this,inverter2.class);

        startActivity(it);

        finish();

    }

    public void inverter3(View view) {

        Intent it = new Intent(this,inverter3.class);

        startActivity(it);

        finish();

    }
}