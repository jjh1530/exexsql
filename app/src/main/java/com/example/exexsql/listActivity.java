package com.example.exexsql;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class listActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
    }

    public void displaymain(View view) {

        Intent it = new Intent(this,MainActivity.class);

        startActivity(it);

        finish();

    }

    public void displayarea(View view) {

        Intent it = new Intent(this,area.class);

        startActivity(it);

        finish();

    }

    public void displaylist(View view) {

        Intent it = new Intent(this,listActivity.class);

        startActivity(it);

        finish();

    }

    public void mechine(View view) {

        Intent it = new Intent(this, mechine.class);

        startActivity(it);

        finish();

    }

    public void power(View view) {

        Intent it = new Intent(this, powerplant.class);

        startActivity(it);

        finish();

    }

    public static class MainActivity extends AppCompatActivity {

        // m은 멤버를 뜻함 전역변수 선언
        private RecyclerView mRv_sun;
        private FloatingActionButton mBtn_wirte;
        private ArrayList<money> mSun_list;
        private DBHelper mDBHelper;
        private Adapter mAdapter;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            setInit();
        }

        private void setInit() {
            mDBHelper = new DBHelper(this);
            mRv_sun = findViewById(R.id.rv_sun);
            mBtn_wirte = findViewById(R.id.btn_write);
            mSun_list = new ArrayList<>();

            // loadRecent DB
            loadRecentDB();

            mBtn_wirte.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //팝업창 띄우기
                    Dialog dialog = new Dialog(MainActivity.this, android.R.style.Theme_Material_Light_Dialog);
                    dialog.setContentView(R.layout.adit);
                    EditText et_day = dialog.findViewById(R.id.et_day);
                    EditText et_month = dialog.findViewById(R.id.et_month);
                    EditText et_daym = dialog.findViewById(R.id.et_daym);
                    EditText et_monthm = dialog.findViewById(R.id.et_monthm);
                    Button btn_OK = dialog.findViewById(R.id.btn_ok);
                    btn_OK.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String currentTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
                            mDBHelper.InsertSun(et_day.getText().toString(), et_month.getText().toString(), et_daym.getText().toString(), et_monthm.getText().toString(), currentTime);

                            //INSERT DB
                            money item = new money();
                            item.setday(et_day.getText().toString());
                            item.setmonth(et_month.getText().toString());
                            item.setdaym(et_daym.getText().toString());
                            item.setmonthm(et_monthm.getText().toString());
                            item.setWriteDate(currentTime);

                            mAdapter.addItem(item);
                            mRv_sun.smoothScrollToPosition(0);
                            dialog.dismiss();
                            Toast.makeText(MainActivity.this, "발전량 추가", Toast.LENGTH_SHORT).show();

                        }
                    });

                    dialog.show();

                }
            });
        }

        private void loadRecentDB() {
            // 저장되어있는 DB 가져옴
            mSun_list = mDBHelper.getSunList();
            if (mAdapter == null) {
                mAdapter = new Adapter(mSun_list, this);
                mRv_sun.setHasFixedSize(true);
                mRv_sun.setAdapter(mAdapter);
            }
        }


        public void displaylist(View view) {

            Intent it = new Intent(this,listActivity.class);

            startActivity(it);

            finish();

        }

    }
}