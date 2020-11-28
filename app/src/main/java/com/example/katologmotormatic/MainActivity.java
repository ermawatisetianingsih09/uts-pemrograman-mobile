package com.example.katologmotormatic;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnHonda,btnSuzuki,btnYamaha;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnHonda = findViewById(R.id.btn_buka_jenis_honda);
        btnSuzuki = findViewById(R.id.btn_buka_jenis_suzuki);
        btnYamaha = findViewById(R.id.btn_buka_jenis_yamaha);
        btnHonda.setOnClickListener(view -> bukaGaleri("Honda"));
        btnSuzuki.setOnClickListener(view -> bukaGaleri("Suzuki"));
        btnYamaha.setOnClickListener(view -> bukaGaleri("Yamaha"));
    }

    private void bukaGaleri(String merekMotor) {
        Log.d("MAIN","Buka activity honda");
        Intent intent = new Intent(this, GaleriActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, merekMotor);
        startActivity(intent);
    }

}