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

public class inverter1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inverter1);

        LineChart lineChart;

        ArrayList<Entry> entry_chart = new ArrayList<>();
        ArrayList<Entry> entry_chart2 = new ArrayList<>();



        lineChart = (LineChart) findViewById(R.id.inverter1V);//layout의 id
        LineData chartData = new LineData();

        entry_chart.add(new Entry(1, (float) 89.7));
        entry_chart.add(new Entry(2, (float) 102.45));
        entry_chart.add(new Entry(3, (float) 102.45));
        entry_chart.add(new Entry(4, (float) 103.55));
        entry_chart.add(new Entry(5, (float) 107.1));
        entry_chart.add(new Entry(6, (float) 114.8));
        entry_chart.add(new Entry(7, (float) 123.05));
        entry_chart.add(new Entry(8, (float) 125));
        entry_chart.add(new Entry(9, (float) 128.8));
        entry_chart.add(new Entry(10, (float) 129.05));
        entry_chart.add(new Entry(11, (float) 129.05));
        entry_chart.add(new Entry(12, (float) 131.5));
        entry_chart.add(new Entry(13, (float) 131));
        entry_chart.add(new Entry(14, (float) 142.3));
        entry_chart.add(new Entry(15, (float) 150.1));
        entry_chart.add(new Entry(16, (float) 150.1));
        entry_chart.add(new Entry(17, (float) 150.1));
        entry_chart.add(new Entry(18, (float) 165.5));
        entry_chart.add(new Entry(19, (float) 167.4));
        entry_chart.add(new Entry(20, (float) 166.1));
        entry_chart.add(new Entry(21, (float) 157.3));
        entry_chart.add(new Entry(22, (float) 181.1));
        entry_chart.add(new Entry(23, (float) 188.2));
        entry_chart.add(new Entry(24, (float) 204.8));
        entry_chart.add(new Entry(25, (float) 240.3));
        entry_chart.add(new Entry(26, (float) 252.6));
        entry_chart.add(new Entry(27, (float) 269.4));
        entry_chart.add(new Entry(28, (float) 272));
        entry_chart.add(new Entry(29, (float) 272));
        entry_chart.add(new Entry(30, (float) 288.21));


        entry_chart2.add(new Entry(1, (float) 68.2));
        entry_chart2.add(new Entry(2, (float) 91.7));
        entry_chart2.add(new Entry(3, (float) 91.7));
        entry_chart2.add(new Entry(4, (float) 97.3));
        entry_chart2.add(new Entry(5, (float) 97.7));
        entry_chart2.add(new Entry(6, (float) 108.9));
        entry_chart2.add(new Entry(7, (float) 120.5));
        entry_chart2.add(new Entry(8, (float) 122.7));
        entry_chart2.add(new Entry(9, (float) 126.8));
        entry_chart2.add(new Entry(10, (float) 128.4));
        entry_chart2.add(new Entry(11, (float) 128.4));
        entry_chart2.add(new Entry(12, (float) 128.6));
        entry_chart2.add(new Entry(13, (float) 128.2));
        entry_chart2.add(new Entry(14, (float) 140.1));
        entry_chart2.add(new Entry(15, (float) 148.6));
        entry_chart2.add(new Entry(16, (float) 148.6));
        entry_chart2.add(new Entry(17, (float) 165.8));
        entry_chart2.add(new Entry(18, (float) 165.6));
        entry_chart2.add(new Entry(19, (float) 165.8));
        entry_chart2.add(new Entry(20, (float) 156.2));
        entry_chart2.add(new Entry(21, (float) 156.2));
        entry_chart2.add(new Entry(22, (float) 181.5));
        entry_chart2.add(new Entry(23, (float) 188.6));
        entry_chart2.add(new Entry(24, (float) 205.6));
        entry_chart2.add(new Entry(25, (float) 244.6));
        entry_chart2.add(new Entry(26, (float) 258.4));
        entry_chart2.add(new Entry(27, (float) 276));
        entry_chart2.add(new Entry(28, (float) 280));
        entry_chart2.add(new Entry(29, (float) 280));
        entry_chart2.add(new Entry(30, (float) 294));



    /* 만약 (2, 3) add하고 (2, 5)한다고해서
    기존 (2, 3)이 사라지는게 아니라 x가 2인곳에 y가 3, 5의 점이 찍힘 */

        LineDataSet lineDataSet = new LineDataSet(entry_chart, "인버터1 입력 전류");
        chartData.addDataSet(lineDataSet);

        LineDataSet charData = new LineDataSet(entry_chart2, "인버터1 출력 전류");
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

    public void inverter(View view) {

        Intent it = new Intent(this,inverter.class);

        startActivity(it);

        finish();

    }
}