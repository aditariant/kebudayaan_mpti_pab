package com.example.kebudayaan_mpti_pab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class activity_deskripsiBudaya extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi_budaya);

        ImageView imgDeskAdat =  findViewById(R.id.ivDeksripsiBudaya1);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            int gambarAdat = bundle.getInt("gambarAdats");
            imgDeskAdat.setImageResource(gambarAdat);
        }

        TextView judulDeskAdat = findViewById(R.id.tvHeaderDeskripsiBudaya);
        TextView asalDeskAdat = findViewById(R.id.tvAsalBudaya1);
        TextView isiDeskAdat = findViewById(R.id.tvIsiBudaya1);

        judulDeskAdat.setText(getIntent().getStringExtra("judulAdats"));
        asalDeskAdat.setText(getIntent().getStringExtra("asalAdats"));
        isiDeskAdat.setText(getIntent().getStringExtra("isiAdats"));
    }

    public void bajuadat3(View view) {
    }
}