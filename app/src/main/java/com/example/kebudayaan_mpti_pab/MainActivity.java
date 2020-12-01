package com.example.kebudayaan_mpti_pab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void pilihMenuPengenalan(View view) {
        Intent kePengenalan = new Intent(MainActivity.this, activity_pengenalanBudaya.class);
        startActivity(kePengenalan);
    }

    public void pilihMenuKuis(View view) {
        /*Intent keKuis = new Intent(MainActivity.this, kuis.class);
        startActivity(keKuis);*/
    }
}