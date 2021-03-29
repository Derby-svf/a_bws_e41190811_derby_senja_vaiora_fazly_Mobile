package com.example.Derby_Senja_Android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Frame_Layout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame__layout);
    }

    public void Pindah(View view) {
        Intent intent = new Intent(Frame_Layout.this, Tabel_Layout.class);
        startActivity(intent);
    }
}