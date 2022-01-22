package com.example.exexsql;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DBHelper extends SQLiteOpenHelper {
    private static final int DB_VERSION = 1;
    private static final String DB_NAME = "sun.db";

    public DBHelper(@Nullable Context context) {

        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //데이터 베이스가 생성이 될 때 호출 AUTOINCREMENT : 자동으로 1씩올라감
        // 테이블명 TodoList  id는 기본키 + 쓸수록 자동으로 1 증가
        db.execSQL("CREATE TABLE IF NOT EXISTS SunList (id INTEGER PRIMARY KEY AUTOINCREMENT, day TEXT NOT NULL, month TEXT NOT NULL, daym TEXT NOT NULL, monthm TEXT NOT NULL,writeDate TEXT NOT NULL)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        onCreate(db);

    }

    //SELECT 문
    public ArrayList<money> getSunList() {
        ArrayList<money> sunItems = new ArrayList<>();

        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM SunList ORDER BY writeDate DESC", null);
        if(cursor.getCount() != 0) {
            // 조회 데이터가 있을 떄 내부 수행
            while (cursor.moveToNext()) {
                int id = cursor.getInt(cursor.getColumnIndex("id"));
                String day = cursor.getString(cursor.getColumnIndex("day"));
                String month = cursor.getString(cursor.getColumnIndex("month"));
                String daym = cursor.getString(cursor.getColumnIndex("daym"));
                String monthm = cursor.getString(cursor.getColumnIndex("monthm"));
                String writeDate = cursor.getString(cursor.getColumnIndex("writeDate"));

                money money = new money();
                money.setId(id);
                money.setday(day);
                money.setmonth(month);
                money.setdaym(daym);
                money.setmonthm(monthm);
                money.setWriteDate(writeDate);
                sunItems.add(money);
            }
        }
        cursor.close();

        return  sunItems;
    }

    //INSERT 문
    public void InsertSun(String _day, String _month, String _daym, String _monthm,  String _writeDate) {
        SQLiteDatabase db = getWritableDatabase();  //wirteable : 쓰기 가능하게 만드는
        db.execSQL("INSERT INTO SunList(day, month, daym, monthm, writeDate) VALUES('" + _day + "', '" + _month + "', '" + _daym + "', '" + _monthm + "' , '" + _writeDate + "');");
    }

    // UPDATE 문
    public void UpdateSun(String _day, String _month, String _daym, String _monthm ,  String _wirteDate ,String _beforeDate) {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("UPDATE SunList SET day='" + _day + "', month='" + _month + "', daym='" + _daym + "',monthm='" + _monthm + "',writeDate= '" + _wirteDate  + "' WHERE writeDate = '" + _beforeDate +"'");
    }

    // DELETE 문
    public void DeleteSun(String _beforDate) {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM SunList WHERE writeDate= '" + _beforDate + "'");
    }
}

