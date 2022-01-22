package com.example.exexsql;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;

public class inverter3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inverter3);


        LineChart lineChart;

        ArrayList<Entry> entry_chart = new ArrayList<>();
        ArrayList<Entry> entry_chart2 = new ArrayList<>();



        lineChart = (LineChart) findViewById(R.id.inverter3V);//layout의 id
        LineData chartData = new LineData();

        entry_chart.add(new Entry(1, (float) 20.1));
        entry_chart.add(new Entry(2, (float) 23.4));
        entry_chart.add(new Entry(3, (float) 19.5));
        entry_chart.add(new Entry(4, (float) 22.1));
        entry_chart.add(new Entry(5, (float) 25.1));
        entry_chart.add(new Entry(6, (float) 23.7));
        entry_chart.add(new Entry(7, (float) 24.6));
        entry_chart.add(new Entry(8, (float) 21.3));

        entry_chart2.add(new Entry(1, (float) 12.4));
        entry_chart2.add(new Entry(2, (float) 15.3));
        entry_chart2.add(new Entry(3, (float) 10.2));
        entry_chart2.add(new Entry(4, (float) 14.2));
        entry_chart2.add(new Entry(5, (float) 17.1));
        entry_chart2.add(new Entry(6, (float) 18.7));
        entry_chart2.add(new Entry(7, (float) 16.6));
        entry_chart2.add(new Entry(8, (float) 16.9));



    /* 만약 (2, 3) add하고 (2, 5)한다고해서
    기존 (2, 3)이 사라지는게 아니라 x가 2인곳에 y가 3, 5의 점이 찍힘 */

        LineDataSet lineDataSet = new LineDataSet(entry_chart, "패널1 전압");
        chartData.addDataSet(lineDataSet);

        LineDataSet charData = new LineDataSet(entry_chart2, "패널1 전류");
        chartData.addDataSet(charData);
        charData.setColors(Color.BLACK);

        lineChart.setData(chartData);

        lineChart.invalidate();


    }




    public void displaylist(View view) {

        Intent it = new Intent(this,listActivity.class);

        startActivity(it);

        finish();

    }

    public void inverter(View view) {

        Intent it = new Intent(this,inverter.class);

        startActivity(it);

        finish();

    }
}