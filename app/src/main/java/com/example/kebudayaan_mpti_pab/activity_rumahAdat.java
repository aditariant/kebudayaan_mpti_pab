package com.example.kebudayaan_mpti_pab;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class activity_rumahAdat extends AppCompatActivity {

    private static final String LOG_TAG = activity_pengenalanBudaya.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rumah_adat);
    }

    public void rumahAdat1 (View view){
        Intent keRumahAdat = new Intent(activity_rumahAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_rumahAceh);
        String asalAdat = getString(R.string.asal_rumahAceh);
        String isiAdat = getString(R.string.isi_rumahAceh);

        keRumahAdat.putExtra("judulAdats", judulAdat.toString());
        keRumahAdat.putExtra("asalAdats", asalAdat.toString());
        keRumahAdat.putExtra("isiAdats", isiAdat.toString());
        keRumahAdat.putExtra("gambarAdats", R.drawable.contohtari1);

        startActivity(keRumahAdat);
    }

    public void rumahAdat2 (View view){
        Intent keRumahAdat = new Intent(activity_rumahAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_rumahSumut);
        String asalAdat = getString(R.string.asal_rumahSumUt);
        String isiAdat = getString(R.string.isi_rumahSumUt);

        keRumahAdat.putExtra("judulAdats", judulAdat.toString());
        keRumahAdat.putExtra("asalAdats", asalAdat.toString());
        keRumahAdat.putExtra("isiAdats", isiAdat.toString());
        keRumahAdat.putExtra("gambarAdats", R.drawable.contohtari2);

        startActivity(keRumahAdat);
    }

    public void rumahAdat3 (View view){
        Intent  keRumahAdat = new Intent(activity_rumahAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_rumahSumBar);
        String asalAdat = getString(R.string.asal_rumahSumBar);
        String isiAdat = getString(R.string.isi_rumahSumBar);

        keRumahAdat.putExtra("judulAdats", judulAdat.toString());
        keRumahAdat.putExtra("asalAdats", asalAdat.toString());
        keRumahAdat.putExtra("isiAdats", isiAdat.toString());
        keRumahAdat.putExtra("gambarAdats", R.drawable.contohtari3);

        startActivity( keRumahAdat);
    }

    public void  rumahAdat4 (View view){
        Intent  keRumahAdat = new Intent(activity_rumahAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_rumahJabar);
        String asalAdat = getString(R.string.asal_rumahJabar);
        String isiAdat = getString(R.string.isi_rumahJabar);

        keRumahAdat.putExtra("judulAdats", judulAdat.toString());
        keRumahAdat.putExtra("asalAdats", asalAdat.toString());
        keRumahAdat.putExtra("isiAdats", isiAdat.toString());
        keRumahAdat.putExtra("gambarAdats", R.drawable.contohtari4);

        startActivity( keRumahAdat);
    }

}
