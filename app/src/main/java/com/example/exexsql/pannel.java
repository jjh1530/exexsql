package com.example.exexsql;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pannel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pannel);
    }

    public void pannel1(View view) {

        Intent it = new Intent(this,pannel1.class);

        startActivity(it);

        finish();

    }

    public void pannel2(View view) {

        Intent it = new Intent(this,pannel2.class);

        startActivity(it);

        finish();

    }

    public void pannel3(View view) {

        Intent it = new Intent(this,pannel3.class);

        startActivity(it);

        finish();

    }

    public void pannel4(View view) {

        Intent it = new Intent(this,pannel4.class);

        startActivity(it);

        finish();

    }

    public void pannel5(View view) {

        Intent it = new Intent(this,pannel5.class);

        startActivity(it);

        finish();

    }

    public void pannel6(View view) {

        Intent it = new Intent(this,pannel6.class);

        startActivity(it);

        finish();

    }

    public void displaylist(View view) {

        Intent it = new Intent(this,listActivity.class);

        startActivity(it);

        finish();

    }

}
