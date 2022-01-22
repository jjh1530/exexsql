package com.example.exexsql;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class powerplant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_powerplant);

        PieChart pieChart = findViewById(R.id.powerplant);

        ArrayList<PieEntry> visitors = new ArrayList<>();
        visitors.add(new PieEntry(2,"경기도"));
        visitors.add(new PieEntry(1,"강원도"));
        visitors.add(new PieEntry(1,"충청북도"));
        visitors.add(new PieEntry(2,"충청남도"));
        visitors.add(new PieEntry(4,"전라북도"));
        visitors.add(new PieEntry(3,"전라남도"));
        visitors.add(new PieEntry(2,"경상북도"));
        visitors.add(new PieEntry(1,"경상남도"));

        PieDataSet pieDataSet = new PieDataSet(visitors, "발전소현황");
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet.setValueLineWidth(Color.BLACK);
        pieDataSet.setValueTextSize(16f);

        PieData pieData = new PieData(pieDataSet);

        pieChart.setData(pieData);
        pieChart.getDescription().setEnabled(false);
        pieChart.setCenterText("발전소 개수");
        pieChart.animate();
    }



    public void displaylist(View view) {

        Intent it = new Intent(this,listActivity.class);

        startActivity(it);

        finish();

    }

}