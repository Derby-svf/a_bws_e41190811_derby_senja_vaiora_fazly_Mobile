package com.example.Derby_Senja_Android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ScrollViewHorizontal_Layout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view_horizontal__layout);
    }

    public void Pindah(View view) {
        Intent intent = new Intent(ScrollViewHorizontal_Layout.this, MenuDashboard.class);
        startActivity(intent);
    }
}