package com.example.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class recycler extends AppCompatActivity {

    private MahasiswaAdapter mAdapter;
    private RecyclerView rvMahasiswa;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        addData();

        rvMahasiswa = findViewById(R.id.rv_mahasiswa);

        mAdapter = new MahasiswaAdapter(mahasiswaArrayList);
        rvMahasiswa.setLayoutManager(new LinearLayoutManager(this));
        rvMahasiswa.setAdapter(mAdapter);
    }

    private void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Bella", "E41192227", "08134309333"));
        mahasiswaArrayList.add(new Mahasiswa("Widya", "E41190868", "08919292382"));
        mahasiswaArrayList.add(new Mahasiswa("Reza", "E41190860", "123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Viky", "E41192090", "01829319321"));
        mahasiswaArrayList.add(new Mahasiswa("Derby", "E41192010", "123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Reza", "E41193010", "123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Zami", "E41194509", "123456789"));
    }
}

