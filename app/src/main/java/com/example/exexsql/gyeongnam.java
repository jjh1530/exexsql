package com.example.exexsql;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class gyeongnam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gyeongnam);

        BarChart barChart = findViewById(R.id.gyeongnam);

        ArrayList<BarEntry> visitors = new ArrayList<>();
        visitors.add(new BarEntry(2017,6615));
        visitors.add(new BarEntry(2018,7306));
        visitors.add(new BarEntry(2019,7945));

        BarDataSet barDataSet = new BarDataSet(visitors,"경상남도");
        barDataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        barDataSet.setValueTextColor(Color.BLACK);
        barDataSet.setValueTextSize(16f);

        BarData barData = new BarData(barDataSet);

        barChart.setFitBars(true);
        barChart.setData(barData);
        barChart.getDescription().setText("경상남도 차트");
        barChart.animateY(2500);

    }


    public void displaylist(View view) {

        Intent it = new Intent(this,listActivity.class);

        startActivity(it);

        finish();

    }

    public void area(View view) {

        Intent it = new Intent(this,area.class);

        startActivity(it);

        finish();

    }
}