package com.example.exexsql;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class area extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);
    }

    public void displaylist(View view) {

        Intent it = new Intent(this,listActivity.class);

        startActivity(it);

        finish();

    }

    public void gyeonggi(View view) {

        Intent it = new Intent(this,gyeonggi.class);

        startActivity(it);

        finish();

    }

    public void gangwon(View view) {

        Intent it = new Intent(this,gangwon.class);

        startActivity(it);

        finish();

    }

    public void chungbuk(View view) {

        Intent it = new Intent(this,chungbuk.class);

        startActivity(it);

        finish();

    }

    public void chungnam(View view) {

        Intent it = new Intent(this,chungnam.class);

        startActivity(it);

        finish();

    }

    public void jeonam(View view) {

        Intent it = new Intent(this,jeonam.class);

        startActivity(it);

        finish();

    }

    public void jeonbuk(View view) {

        Intent it = new Intent(this,jeonbuk.class);

        startActivity(it);

        finish();

    }

    public void gyeongbuk(View view) {

        Intent it = new Intent(this,gyeongbuk.class);

        startActivity(it);

        finish();

    }

    public void gyeongnam(View view) {

        Intent it = new Intent(this,gyeongnam.class);

        startActivity(it);

        finish();

    }
}