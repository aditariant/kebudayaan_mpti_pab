package com.example.kebudayaan_mpti_pab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class activity_pengenalanBudaya extends AppCompatActivity {

    DrawerLayout drawerLayout;
    private String pilihBudaya;
    private static final String LOG_TAG = activity_pengenalanBudaya.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengenalan_budaya);

        drawerLayout = findViewById(R.id.drawer_layout);
    }

    public void ClickMenu(View view){
        MainActivity.openDrawer(drawerLayout);
    }

    public void ClickLogo(View view){
        MainActivity.closeDrawer(drawerLayout);
    }


    public void ClickBeranda(View view){
        MainActivity.redirectActivity(this, MainActivity.class);
    }

    public void ClickPengenalan(View view){
        recreate();
    }

    public void ClickKuis(View view){
        MainActivity.redirectActivity(this, activity_tarianAdat.class);
    }

    public void ClickKeluar(View view){
        MainActivity.logout(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        MainActivity.closeDrawer(drawerLayout);
    }

    public void tampilPesan(String pesan){
        Toast.makeText(getApplicationContext(), pesan, Toast.LENGTH_SHORT).show();
    }

    public void TarianDaerah (View view){
        /*pilihBudaya = getString(R.string.desc_tarian_daerah);
        tampilPesan(pilihBudaya);*/
        Intent intent = new Intent(activity_pengenalanBudaya.this, activity_tarianAdat.class);
        startActivity(intent);
    }

    public void SenjataTradisional (View view){
        /*pilihBudaya = getString(R.string.desc_senjata_tradisional);
        tampilPesan(pilihBudaya);*/
        Intent intent = new Intent(activity_pengenalanBudaya.this, activity_senjata_tradisional.class);
        startActivity(intent);
    }
    public void BajuAdat (View view){
        /*pilihBudaya = getString(R.string.desc_baju_adat);
        tampilPesan(pilihBudaya);*/
        /*Intent intent = new Intent(activity_pengenalanBudaya.this, activity_tarianAdat.class);
        startActivity(intent);*/
    }
    public void RumahAdat (View view){
        /*pilihBudaya = getString(R.string.desc_rumah_adat);
        tampilPesan(pilihBudaya);*/
        Intent intent = new Intent(activity_pengenalanBudaya.this, activity_rumahAdat.class);
        startActivity(intent);
    }

}