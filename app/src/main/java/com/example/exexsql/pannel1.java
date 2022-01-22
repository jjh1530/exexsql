package com.example.exexsql;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;

public class pannel1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pannel1);


        LineChart lineChart;

        ArrayList<Entry> entry_chart = new ArrayList<>();
        ArrayList<Entry> entry_chart2 = new ArrayList<>();



        lineChart = (LineChart) findViewById(R.id.pannel1V);//layout의 id
        LineData chartData = new LineData();

        entry_chart.add(new Entry(1, (float) 231));
        entry_chart.add(new Entry(2, (float) 232));
        entry_chart.add(new Entry(3, (float) 232));
        entry_chart.add(new Entry(4, (float) 231));
        entry_chart.add(new Entry(5, (float) 232.10));
        entry_chart.add(new Entry(6, (float) 232.10));
        entry_chart.add(new Entry(7, (float) 231.5));
        entry_chart.add(new Entry(8, (float) 232.10));
        entry_chart.add(new Entry(9, (float) 232.10));
        entry_chart.add(new Entry(10, (float) 232.10));
        entry_chart.add(new Entry(11, (float) 232.10));
        entry_chart.add(new Entry(12, (float) 232.10));
        entry_chart.add(new Entry(13, (float) 232.10));
        entry_chart.add(new Entry(14, (float) 232.10));
        entry_chart.add(new Entry(15, (float) 232.10));
        entry_chart.add(new Entry(16, (float) 232.10));
        entry_chart.add(new Entry(17, (float) 232.10));
        entry_chart.add(new Entry(18, (float) 232.10));
        entry_chart.add(new Entry(19, (float) 232.10));
        entry_chart.add(new Entry(20, (float) 232.10));
        entry_chart.add(new Entry(21, (float) 232.10));
        entry_chart.add(new Entry(22, (float) 232.67));
        entry_chart.add(new Entry(23, (float) 232.67));
        entry_chart.add(new Entry(24, (float) 232.10));
        entry_chart.add(new Entry(25, (float) 232.10));
        entry_chart.add(new Entry(26, (float) 232.10));
        entry_chart.add(new Entry(27, (float) 232.10));
        entry_chart.add(new Entry(28, (float) 232.10));
        entry_chart.add(new Entry(29, (float) 231.52));
        entry_chart.add(new Entry(30, (float) 232.10));


        entry_chart2.add(new Entry(1, (float) 26.5));
        entry_chart2.add(new Entry(2, (float) 27.9));
        entry_chart2.add(new Entry(3, (float) 29.4));
        entry_chart2.add(new Entry(4, (float) 27.3));
        entry_chart2.add(new Entry(5, (float) 25.1));
        entry_chart2.add(new Entry(6, (float) 22.8));
        entry_chart2.add(new Entry(7, (float) 22.9));
        entry_chart2.add(new Entry(8, (float) 24.5));
        entry_chart2.add(new Entry(9, (float) 23.7));
        entry_chart2.add(new Entry(10, (float) 22.1));
        entry_chart2.add(new Entry(11, (float) 22.1));
        entry_chart2.add(new Entry(12, (float) 27.6));
        entry_chart2.add(new Entry(13, (float) 28.2));
        entry_chart2.add(new Entry(14, (float) 23.2));
        entry_chart2.add(new Entry(15, (float) 23.3));
        entry_chart2.add(new Entry(16, (float) 23.1));
        entry_chart2.add(new Entry(17, (float) 23.2));
        entry_chart2.add(new Entry(18, (float) 24.4));
        entry_chart2.add(new Entry(19, (float) 22.5));
        entry_chart2.add(new Entry(20, (float) 27.5));
        entry_chart2.add(new Entry(21, (float) 27.1));
        entry_chart2.add(new Entry(22, (float) 25.2));
        entry_chart2.add(new Entry(23, (float) 31.7));
        entry_chart2.add(new Entry(24, (float) 37.5));
        entry_chart2.add(new Entry(25, (float) 31.4));
        entry_chart2.add(new Entry(26, (float) 31.4));
        entry_chart2.add(new Entry(27, (float) 31.2));
        entry_chart2.add(new Entry(28, (float) 28.6));
        entry_chart2.add(new Entry(29, (float) 29.5));
        entry_chart2.add(new Entry(30, (float) 27.3));



    /* 만약 (2, 3) add하고 (2, 5)한다고해서
    기존 (2, 3)이 사라지는게 아니라 x가 2인곳에 y가 3, 5의 점이 찍힘 */

        LineDataSet lineDataSet = new LineDataSet(entry_chart, "패널1 전압");
        chartData.addDataSet(lineDataSet);

        LineDataSet charData = new LineDataSet(entry_chart2, "패널1 전류");
        chartData.addDataSet(charData);
        charData.setColors(Color.RED);

        lineChart.setData(chartData);

        lineChart.invalidate();



    }







    public void displaylist(View view) {

        Intent it = new Intent(this,listActivity.class);

        startActivity(it);

        finish();

    }

    public void pannel(View view) {

        Intent it = new Intent(this,pannel.class);

        startActivity(it);

        finish();

    }
}