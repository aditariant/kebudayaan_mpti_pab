package com.example.kebudayaan_mpti_pab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class deskripsiBudaya2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi_budaya2);

        ImageView imgDeskAdat =  findViewById(R.id.ivDeksripsiBudaya1);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            int gambarAdat = bundle.getInt("gambarAdats");
            imgDeskAdat.setImageResource(gambarAdat);
        }

        TextView judulDeskAdat = findViewById(R.id.tvHeaderDeskripsiBudaya);
        TextView asalDeskAdat = findViewById(R.id.tvAsalBudaya1);
        TextView isiDeskAdat = findViewById(R.id.tvIsiBudaya1);
        TextView ciriDeskAdat = findViewById(R.id.tvCiriBudaya1);

        judulDeskAdat.setText(getIntent().getStringExtra("judulAdats"));
        asalDeskAdat.setText(getIntent().getStringExtra("asalAdats"));
        isiDeskAdat.setText(getIntent().getStringExtra("isiAdats"));
        ciriDeskAdat.setText(getIntent().getStringExtra("ciriAdats"));

        ImageView toolbarleftIcons = findViewById(R.id.leftIcon);
        toolbarleftIcons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}