package com.example.kebudayaan_mpti_pab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class activity_pengenalanBudaya extends AppCompatActivity {

    private String pilihBudaya;
    private static final String LOG_TAG = activity_pengenalanBudaya.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengenalan_budaya);


    }

    public void tampilPesan(String pesan){
        Toast.makeText(getApplicationContext(), pesan, Toast.LENGTH_SHORT).show();
    }

    public void TarianDaerah (View view){
        /*pilihBudaya = getString(R.string.desc_tarian_daerah);
        tampilPesan(pilihBudaya);*/
        Intent keTarian = new Intent(activity_pengenalanBudaya.this, activity_tarianAdat.class);
        startActivity(keTarian);
    }

    public void SenjataTradisional (View view){
        /*pilihBudaya = getString(R.string.desc_senjata_tradisional);
        tampilPesan(pilihBudaya);*/
        Intent keTarian = new Intent(activity_pengenalanBudaya.this, activity_senjata_tradisional.class);
        startActivity(keTarian);
    }
    public void BajuAdat (View view){
        /*pilihBudaya = getString(R.string.desc_baju_adat);
        tampilPesan(pilihBudaya);*/
        /*Intent keTarian = new Intent(activity_pengenalanBudaya.this, activity_tarianAdat.class);
        startActivity(keTarian);*/
    }
    public void RumahAdat (View view){
        /*pilihBudaya = getString(R.string.desc_rumah_adat);
        tampilPesan(pilihBudaya);*/
        /*Intent keTarian = new Intent(activity_pengenalanBudaya.this, activity_tarianAdat.class);
        startActivity(keTarian);*/
    }

}