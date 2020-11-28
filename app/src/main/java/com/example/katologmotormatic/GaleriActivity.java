package com.example.katologmotormatic;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import com.example.katologmotormatic.model.Motor;

public class GaleriActivity extends AppCompatActivity {

    List<Motor> motors;
    int indeksTampil = 0;
    String merekMotor;
    Button btnPertama,btnTerakhir,btnSebelumnya,btnBerikutnya;
    TextView txTahun,txDeskripsi,txJudul,txJenis;
    ImageView ivFotoMotor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_jenis);
        Intent intent = getIntent();
        merekMotor = intent.getStringExtra(MainActivity.JENIS_GALERI_KEY);
        motors = DataProvider.getMotorsByTipe(this,merekMotor);
        inisialisasiView();
        tampilkanProfil();
    }

    private void inisialisasiView() {
        btnPertama = findViewById(R.id.btnPertama);
        btnSebelumnya = findViewById(R.id.btnSebelumnya);
        btnBerikutnya = findViewById(R.id.btnBerikutnya);
        btnTerakhir = findViewById(R.id.btnTerakhir);

        btnPertama.setOnClickListener(view -> motorPertama());
        btnTerakhir.setOnClickListener(view -> motorTerakhir());
        btnSebelumnya.setOnClickListener(view -> motorSebelumnya());
        btnBerikutnya.setOnClickListener(view -> motorBerikutnya());

        txJenis = findViewById(R.id.txJenis);
        txTahun = findViewById(R.id.txTahun);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        ivFotoMotor = findViewById(R.id.gambarMotor);

        txJudul = findViewById(R.id.txJudul);
        txJudul.setText("Berbagai Macam jenis "+ merekMotor);
    }


    private void tampilkanProfil() {
        Motor m = motors.get(indeksTampil);
        Log.d("SUZUKI","Menampilkan suzuki "+m.getJenis());
        txTahun.setText(m.getTahun());
        txJenis.setText(m.getJenis());
        txDeskripsi.setText(m.getDeskripsi());
        ivFotoMotor.setImageDrawable(this.getDrawable(m.getDrawableRes()));
    }

    private void motorPertama() {
        int posAwal = 0;
        if (indeksTampil == posAwal) {
            Toast.makeText(this,"Sudah di posisi pertama",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAwal;
            tampilkanProfil();
        }
    }

    private void motorTerakhir() {
        int posAkhir = motors.size() - 1;
        if (indeksTampil == posAkhir) {
            Toast.makeText(this,"Sudah di posisi terakhir",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAkhir;
            tampilkanProfil();
        }
    }

    private void motorBerikutnya() {
        if (indeksTampil == motors.size() - 1) {
            Toast.makeText(this,"Sudah di posisi terakhir",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil++;
            tampilkanProfil();
        }
    }

    private void motorSebelumnya() {
        if (indeksTampil == 0) {
            Toast.makeText(this,"Sudah di posisi pertama",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil--;
            tampilkanProfil();
        }
    }
}

