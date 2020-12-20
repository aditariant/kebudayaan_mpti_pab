package com.example.kebudayaan_mpti_pab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class activity_pengenalanBudaya extends AppCompatActivity {

    DrawerLayout drawerLayout;

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
        MainActivity.closeDrawer(drawerLayout);
    }

    public void ClickKuis(View view){
        MainActivity.redirectActivity(this, StartingScreenActivity.class);
    }

    public void ClickKeluar(View view){
        MainActivity.logout(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        MainActivity.closeDrawer(drawerLayout);
    }

    public void TarianDaerah (View view){
        Intent intent = new Intent(activity_pengenalanBudaya.this, activity_tarianAdat.class);
        startActivity(intent);
    }

    public void SenjataTradisional (View view){
        Intent intent = new Intent(activity_pengenalanBudaya.this, activity_senjata_tradisional.class);
        startActivity(intent);
    }
    public void BajuAdat (View view){
        Intent intent = new Intent(activity_pengenalanBudaya.this, activity_pakaianAdat.class);
        startActivity(intent);
    }
    public void RumahAdat (View view){
        Intent intent = new Intent(activity_pengenalanBudaya.this, activity_rumahAdat.class);
        startActivity(intent);
    }

}