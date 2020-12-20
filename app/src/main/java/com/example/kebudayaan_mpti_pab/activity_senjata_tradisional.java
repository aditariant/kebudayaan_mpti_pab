package com.example.kebudayaan_mpti_pab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import static com.example.kebudayaan_mpti_pab.R.string.isi_tariAceh;

public class activity_senjata_tradisional extends AppCompatActivity {

    private static final String LOG_TAG = activity_pengenalanBudaya.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senjata_tradisional);

        ImageView toolbarleftIcons = findViewById(R.id.leftIcon);
        toolbarleftIcons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    public void senjataAceh(View view) {
        Intent keSenjataTradisional = new Intent(activity_senjata_tradisional.this, deskripsiBudaya2.class);

        String judulAdat = getString(R.string.judul_senjataAceh);
        String asalAdat = getString(R.string.asal_senjataAceh);
        String isiAdat = getString(R.string.sejarah_senjataAceh);
        String ciriAdat = getString(R.string.ciri_senjataAceh);

        keSenjataTradisional.putExtra("judulAdats", judulAdat.toString());
        keSenjataTradisional.putExtra("asalAdats", asalAdat.toString());
        keSenjataTradisional.putExtra("isiAdats", isiAdat.toString());
        keSenjataTradisional.putExtra("ciriAdats", ciriAdat.toString());
        keSenjataTradisional.putExtra("gambarAdats", R.drawable.senjataa1);

        startActivity(keSenjataTradisional);
    }

    public void senjataSumUt(View view) {
        Intent keSenjataTradisional = new Intent(activity_senjata_tradisional.this, deskripsiBudaya2.class);

        String judulAdat = getString(R.string.judul_senjataSumUt);
        String asalAdat = getString(R.string.asal_senjataSumUt);
        String isiAdat = getString(R.string.sejarah_senjataSumUt);
        String ciriAdat = getString(R.string.ciri_senjataAceh);

        keSenjataTradisional.putExtra("judulAdats", judulAdat.toString());
        keSenjataTradisional.putExtra("asalAdats", asalAdat.toString());
        keSenjataTradisional.putExtra("isiAdats", isiAdat.toString());
        keSenjataTradisional.putExtra("ciriAdats", ciriAdat.toString());
        keSenjataTradisional.putExtra("gambarAdats", R.drawable.senjata2);

        startActivity(keSenjataTradisional);
    }

    public void senjataSumBar(View view) {
        Intent keSenjataTradisional = new Intent(activity_senjata_tradisional.this, deskripsiBudaya2.class);

        String judulAdat = getString(R.string.judul_senjataSumBar);
        String asalAdat = getString(R.string.asal_senjataSumBar);
        String isiAdat = getString(R.string.sejarah_senjataSumBar);
        String ciriAdat = getString(R.string.ciri_senjataSumBar);

        keSenjataTradisional.putExtra("judulAdats", judulAdat.toString());
        keSenjataTradisional.putExtra("asalAdats", asalAdat.toString());
        keSenjataTradisional.putExtra("isiAdats", isiAdat.toString());
        keSenjataTradisional.putExtra("ciriAdats", ciriAdat.toString());
        keSenjataTradisional.putExtra("gambarAdats", R.drawable.senjata3);

        startActivity(keSenjataTradisional);
    }

    public void senjataRiau(View view) {
        Intent keSenjataTradisional = new Intent(activity_senjata_tradisional.this, deskripsiBudaya2.class);

        String judulAdat = getString(R.string.judul_senjataRiau);
        String asalAdat = getString(R.string.asal_senjataRiau);
        String isiAdat = getString(R.string.sejarah_senjataRiau);
        String ciriAdat = getString(R.string.ciri_senjataRiau);

        keSenjataTradisional.putExtra("judulAdats", judulAdat.toString());
        keSenjataTradisional.putExtra("asalAdats", asalAdat.toString());
        keSenjataTradisional.putExtra("isiAdats", isiAdat.toString());
        keSenjataTradisional.putExtra("ciriAdats", ciriAdat.toString());
        keSenjataTradisional.putExtra("gambarAdats", R.drawable.senjata4);

        startActivity(keSenjataTradisional);
    }

    public void senjataKepRi(View view) {
        Intent keSenjataTradisional = new Intent(activity_senjata_tradisional.this, deskripsiBudaya2.class);

        String judulAdat = getString(R.string.judul_senjataKepRi);
        String asalAdat = getString(R.string.asal_senjataKepRi);
        String isiAdat = getString(R.string.sejarah_senjataKepRi);
        String ciriAdat = getString(R.string.ciri_senjataKepRi);

        keSenjataTradisional.putExtra("judulAdats", judulAdat.toString());
        keSenjataTradisional.putExtra("asalAdats", asalAdat.toString());
        keSenjataTradisional.putExtra("isiAdats", isiAdat.toString());
        keSenjataTradisional.putExtra("ciriAdats", ciriAdat.toString());
        keSenjataTradisional.putExtra("gambarAdats", R.drawable.senjata5);

        startActivity(keSenjataTradisional);
    }

    public void senjataJambi(View view) {
        Intent keSenjataTradisional = new Intent(activity_senjata_tradisional.this, deskripsiBudaya2.class);

        String judulAdat = getString(R.string.judul_senjataJambi);
        String asalAdat = getString(R.string.asal_senjataJambi);
        String isiAdat = getString(R.string.sejarah_senjataJambi);
        String ciriAdat = getString(R.string.ciri_senjataJambi);

        keSenjataTradisional.putExtra("judulAdats", judulAdat.toString());
        keSenjataTradisional.putExtra("asalAdats", asalAdat.toString());
        keSenjataTradisional.putExtra("isiAdats", isiAdat.toString());
        keSenjataTradisional.putExtra("ciriAdats", ciriAdat.toString());
        keSenjataTradisional.putExtra("gambarAdats", R.drawable.senjata6);

        startActivity(keSenjataTradisional);
    }

    public void senjataBengkulu(View view) {
        Intent keSenjataTradisional = new Intent(activity_senjata_tradisional.this, deskripsiBudaya2.class);

        String judulAdat = getString(R.string.judul_senjataBengkulu);
        String asalAdat = getString(R.string.asal_senjataBengkulu);
        String isiAdat = getString(R.string.sejarah_senjataBengkulu);
        String ciriAdat = getString(R.string.ciri_senjataBengkulu);

        keSenjataTradisional.putExtra("judulAdats", judulAdat.toString());
        keSenjataTradisional.putExtra("asalAdats", asalAdat.toString());
        keSenjataTradisional.putExtra("isiAdats", isiAdat.toString());
        keSenjataTradisional.putExtra("ciriAdats", ciriAdat.toString());
        keSenjataTradisional.putExtra("gambarAdats", R.drawable.senjata7);

        startActivity(keSenjataTradisional);
    }

    public void senjataBabel(View view) {
        Intent keSenjataTradisional = new Intent(activity_senjata_tradisional.this, deskripsiBudaya2.class);

        String judulAdat = getString(R.string.judul_senjataBabel);
        String asalAdat = getString(R.string.asal_senjataBabel);
        String isiAdat = getString(R.string.sejarah_senjataBabel);
        String ciriAdat = getString(R.string.ciri_senjataBabel);

        keSenjataTradisional.putExtra("judulAdats", judulAdat.toString());
        keSenjataTradisional.putExtra("asalAdats", asalAdat.toString());
        keSenjataTradisional.putExtra("isiAdats", isiAdat.toString());
        keSenjataTradisional.putExtra("ciriAdats", ciriAdat.toString());
        keSenjataTradisional.putExtra("gambarAdats", R.drawable.senjata8);

        startActivity(keSenjataTradisional);
    }

    public void senjataSumSel(View view) {
        Intent keSenjataTradisional = new Intent(activity_senjata_tradisional.this, deskripsiBudaya2.class);

        String judulAdat = getString(R.string.judul_senjataSumSel);
        String asalAdat = getString(R.string.asal_senjataSumSel);
        String isiAdat = getString(R.string.sejarah_senjataSumSel);
        String ciriAdat = getString(R.string.ciri_senjataSumSel);

        keSenjataTradisional.putExtra("judulAdats", judulAdat.toString());
        keSenjataTradisional.putExtra("asalAdats", asalAdat.toString());
        keSenjataTradisional.putExtra("isiAdats", isiAdat.toString());
        keSenjataTradisional.putExtra("ciriAdats", ciriAdat.toString());
        keSenjataTradisional.putExtra("gambarAdats", R.drawable.senjata9);

        startActivity(keSenjataTradisional);
    }

    public void senjataLampung(View view) {
        Intent keSenjataTradisional = new Intent(activity_senjata_tradisional.this, deskripsiBudaya2.class);

        String judulAdat = getString(R.string.judul_senjataLampung);
        String asalAdat = getString(R.string.asal_senjataLampung);
        String isiAdat = getString(R.string.sejarah_senjataLampung);
        String ciriAdat = getString(R.string.ciri_senjataLampung);

        keSenjataTradisional.putExtra("judulAdats", judulAdat.toString());
        keSenjataTradisional.putExtra("asalAdats", asalAdat.toString());
        keSenjataTradisional.putExtra("isiAdats", isiAdat.toString());
        keSenjataTradisional.putExtra("ciriAdats", ciriAdat.toString());
        keSenjataTradisional.putExtra("gambarAdats", R.drawable.senjata10);

        startActivity(keSenjataTradisional);
    }

    public void senjataBanten(View view) {
        Intent keSenjataTradisional = new Intent(activity_senjata_tradisional.this, deskripsiBudaya2.class);

        String judulAdat = getString(R.string.judul_senjataBanten);
        String asalAdat = getString(R.string.asal_senjataBanten);
        String isiAdat = getString(R.string.sejarah_senjataBanten);
        String ciriAdat = getString(R.string.ciri_senjataBanten);

        keSenjataTradisional.putExtra("judulAdats", judulAdat.toString());
        keSenjataTradisional.putExtra("asalAdats", asalAdat.toString());
        keSenjataTradisional.putExtra("isiAdats", isiAdat.toString());
        keSenjataTradisional.putExtra("ciriAdats", ciriAdat.toString());
        keSenjataTradisional.putExtra("gambarAdats", R.drawable.senjata11);

        startActivity(keSenjataTradisional);
    }

    public void senjataJabar(View view) {
        Intent keSenjataTradisional = new Intent(activity_senjata_tradisional.this, deskripsiBudaya2.class);

        String judulAdat = getString(R.string.judul_senjataJaBar);
        String asalAdat = getString(R.string.asal_senjataJaBar);
        String isiAdat = getString(R.string.sejarah_senjataJaBar);
        String ciriAdat = getString(R.string.ciri_senjataJaBar);

        keSenjataTradisional.putExtra("judulAdats", judulAdat.toString());
        keSenjataTradisional.putExtra("asalAdats", asalAdat.toString());
        keSenjataTradisional.putExtra("isiAdats", isiAdat.toString());
        keSenjataTradisional.putExtra("ciriAdats", ciriAdat.toString());
        keSenjataTradisional.putExtra("gambarAdats", R.drawable.senjata12);

        startActivity(keSenjataTradisional);
    }

    public void senjataJakarta(View view) {
        Intent keSenjataTradisional = new Intent(activity_senjata_tradisional.this, deskripsiBudaya2.class);

        String judulAdat = getString(R.string.judul_senjataJakarta);
        String asalAdat = getString(R.string.asal_senjataJakarta);
        String isiAdat = getString(R.string.sejarah_senjataJakarta);
        String ciriAdat = getString(R.string.ciri_senjataJakarta);

        keSenjataTradisional.putExtra("judulAdats", judulAdat.toString());
        keSenjataTradisional.putExtra("asalAdats", asalAdat.toString());
        keSenjataTradisional.putExtra("isiAdats", isiAdat.toString());
        keSenjataTradisional.putExtra("ciriAdats", ciriAdat.toString());
        keSenjataTradisional.putExtra("gambarAdats", R.drawable.senjata13);

        startActivity(keSenjataTradisional);
    }

    public void senjataJaTeng(View view) {
        Intent keSenjataTradisional = new Intent(activity_senjata_tradisional.this, deskripsiBudaya2.class);

        String judulAdat = getString(R.string.judul_senjataJaTeng);
        String asalAdat = getString(R.string.asal_senjataJaTeng);
        String isiAdat = getString(R.string.sejarah_senjataJaTeng);
        String ciriAdat = getString(R.string.ciri_senjataJaTeng);

        keSenjataTradisional.putExtra("judulAdats", judulAdat.toString());
        keSenjataTradisional.putExtra("asalAdats", asalAdat.toString());
        keSenjataTradisional.putExtra("isiAdats", isiAdat.toString());
        keSenjataTradisional.putExtra("ciriAdats", ciriAdat.toString());
        keSenjataTradisional.putExtra("gambarAdats", R.drawable.senjata14);

        startActivity(keSenjataTradisional);
    }

    public void senjataYogyakarta(View view) {
        Intent keSenjataTradisional = new Intent(activity_senjata_tradisional.this, deskripsiBudaya2.class);

        String judulAdat = getString(R.string.judul_senjataYogyakarta);
        String asalAdat = getString(R.string.asal_senjataYogyakarta);
        String isiAdat = getString(R.string.sejarah_senjataYogyakarta);
        String ciriAdat = getString(R.string.ciri_senjataYogyakarta);

        keSenjataTradisional.putExtra("judulAdats", judulAdat.toString());
        keSenjataTradisional.putExtra("asalAdats", asalAdat.toString());
        keSenjataTradisional.putExtra("isiAdats", isiAdat.toString());
        keSenjataTradisional.putExtra("ciriAdats", ciriAdat.toString());
        keSenjataTradisional.putExtra("gambarAdats", R.drawable.senjata15);

        startActivity(keSenjataTradisional);
    }

    public void senjataJaTim(View view) {
        Intent keSenjataTradisional = new Intent(activity_senjata_tradisional.this, deskripsiBudaya2.class);

        String judulAdat = getString(R.string.judul_senjataJaTim);
        String asalAdat = getString(R.string.asal_senjataJaTim);
        String isiAdat = getString(R.string.sejarah_senjataJaTim);
        String ciriAdat = getString(R.string.ciri_senjataJaTim);

        keSenjataTradisional.putExtra("judulAdats", judulAdat.toString());
        keSenjataTradisional.putExtra("asalAdats", asalAdat.toString());
        keSenjataTradisional.putExtra("isiAdats", isiAdat.toString());
        keSenjataTradisional.putExtra("ciriAdats", ciriAdat.toString());
        keSenjataTradisional.putExtra("gambarAdats", R.drawable.senjata16);

        startActivity(keSenjataTradisional);
    }

    public void senjataBali(View view) {
        Intent keSenjataTradisional = new Intent(activity_senjata_tradisional.this, deskripsiBudaya2.class);

        String judulAdat = getString(R.string.judul_senjataBali);
        String asalAdat = getString(R.string.asal_senjataBali);
        String isiAdat = getString(R.string.sejarah_senjataBali);
        String ciriAdat = getString(R.string.ciri_senjataBali);

        keSenjataTradisional.putExtra("judulAdats", judulAdat.toString());
        keSenjataTradisional.putExtra("asalAdats", asalAdat.toString());
        keSenjataTradisional.putExtra("isiAdats", isiAdat.toString());
        keSenjataTradisional.putExtra("ciriAdats", ciriAdat.toString());
        keSenjataTradisional.putExtra("gambarAdats", R.drawable.senjata17);

        startActivity(keSenjataTradisional);
    }

    public void senjataNTT(View view) {
        Intent keSenjataTradisional = new Intent(activity_senjata_tradisional.this, deskripsiBudaya2.class);

        String judulAdat = getString(R.string.judul_senjataNTT);
        String asalAdat = getString(R.string.asal_senjataNTT);
        String isiAdat = getString(R.string.sejarah_senjataNTT);
        String ciriAdat = getString(R.string.ciri_senjataNTT);

        keSenjataTradisional.putExtra("judulAdats", judulAdat.toString());
        keSenjataTradisional.putExtra("asalAdats", asalAdat.toString());
        keSenjataTradisional.putExtra("isiAdats", isiAdat.toString());
        keSenjataTradisional.putExtra("ciriAdats", ciriAdat.toString());
        keSenjataTradisional.putExtra("gambarAdats", R.drawable.senjata18);

        startActivity(keSenjataTradisional);
    }

    public void senjataNTB(View view) {
        Intent keSenjataTradisional = new Intent(activity_senjata_tradisional.this, deskripsiBudaya2.class);

        String judulAdat = getString(R.string.judul_senjataNTB);
        String asalAdat = getString(R.string.asal_senjataNTB);
        String isiAdat = getString(R.string.sejarah_senjataNTB);
        String ciriAdat = getString(R.string.ciri_senjataNTB);

        keSenjataTradisional.putExtra("judulAdats", judulAdat.toString());
        keSenjataTradisional.putExtra("asalAdats", asalAdat.toString());
        keSenjataTradisional.putExtra("isiAdats", isiAdat.toString());
        keSenjataTradisional.putExtra("ciriAdats", ciriAdat.toString());
        keSenjataTradisional.putExtra("gambarAdats", R.drawable.senjata19);

        startActivity(keSenjataTradisional);
    }

    public void senjataKalUt(View view) {
        Intent keSenjataTradisional = new Intent(activity_senjata_tradisional.this, deskripsiBudaya2.class);

        String judulAdat = getString(R.string.judul_senjataKalUt);
        String asalAdat = getString(R.string.asal_senjataKalUt);
        String isiAdat = getString(R.string.sejarah_senjataKalUt);
        String ciriAdat = getString(R.string.ciri_senjataKalUt);

        keSenjataTradisional.putExtra("judulAdats", judulAdat.toString());
        keSenjataTradisional.putExtra("asalAdats", asalAdat.toString());
        keSenjataTradisional.putExtra("isiAdats", isiAdat.toString());
        keSenjataTradisional.putExtra("ciriAdats", ciriAdat.toString());
        keSenjataTradisional.putExtra("gambarAdats", R.drawable.senjata20);

        startActivity(keSenjataTradisional);
    }

    public void senjataKalBar(View view) {
        Intent keSenjataTradisional = new Intent(activity_senjata_tradisional.this, deskripsiBudaya2.class);

        String judulAdat = getString(R.string.judul_senjataKalBar);
        String asalAdat = getString(R.string.asal_senjataKalBar);
        String isiAdat = getString(R.string.sejarah_senjataKalBar);
        String ciriAdat = getString(R.string.ciri_senjataKalBar);

        keSenjataTradisional.putExtra("judulAdats", judulAdat.toString());
        keSenjataTradisional.putExtra("asalAdats", asalAdat.toString());
        keSenjataTradisional.putExtra("isiAdats", isiAdat.toString());
        keSenjataTradisional.putExtra("ciriAdats", ciriAdat.toString());
        keSenjataTradisional.putExtra("gambarAdats", R.drawable.senjata21);

        startActivity(keSenjataTradisional);
    }

    public void senjataKalTengah(View view) {
        Intent keSenjataTradisional = new Intent(activity_senjata_tradisional.this, deskripsiBudaya2.class);

        String judulAdat = getString(R.string.judul_senjataKalTengah);
        String asalAdat = getString(R.string.asal_senjataKalTengah);
        String isiAdat = getString(R.string.sejarah_senjataKalTengah);
        String ciriAdat = getString(R.string.ciri_senjataKalTengah);

        keSenjataTradisional.putExtra("judulAdats", judulAdat.toString());
        keSenjataTradisional.putExtra("asalAdats", asalAdat.toString());
        keSenjataTradisional.putExtra("isiAdats", isiAdat.toString());
        keSenjataTradisional.putExtra("ciriAdats", ciriAdat.toString());
        keSenjataTradisional.putExtra("gambarAdats", R.drawable.senjata22);

        startActivity(keSenjataTradisional);
    }

    public void senjataKalTim(View view) {
        Intent keSenjataTradisional = new Intent(activity_senjata_tradisional.this, deskripsiBudaya2.class);

        String judulAdat = getString(R.string.judul_senjataKalTim);
        String asalAdat = getString(R.string.asal_senjataKalTim);
        String isiAdat = getString(R.string.sejarah_senjataKalTim);
        String ciriAdat = getString(R.string.ciri_senjataKalTim);

        keSenjataTradisional.putExtra("judulAdats", judulAdat.toString());
        keSenjataTradisional.putExtra("asalAdats", asalAdat.toString());
        keSenjataTradisional.putExtra("isiAdats", isiAdat.toString());
        keSenjataTradisional.putExtra("ciriAdats", ciriAdat.toString());
        keSenjataTradisional.putExtra("gambarAdats", R.drawable.senjata23);

        startActivity(keSenjataTradisional);
    }

    public void senjataKalSel(View view) {
        Intent keSenjataTradisional = new Intent(activity_senjata_tradisional.this, deskripsiBudaya2.class);

        String judulAdat = getString(R.string.judul_senjataKalSel);
        String asalAdat = getString(R.string.asal_senjataKalSel);
        String isiAdat = getString(R.string.sejarah_senjataKalSel);
        String ciriAdat = getString(R.string.ciri_senjataKalSel);

        keSenjataTradisional.putExtra("judulAdats", judulAdat.toString());
        keSenjataTradisional.putExtra("asalAdats", asalAdat.toString());
        keSenjataTradisional.putExtra("isiAdats", isiAdat.toString());
        keSenjataTradisional.putExtra("ciriAdats", ciriAdat.toString());
        keSenjataTradisional.putExtra("gambarAdats", R.drawable.senjata24);

        startActivity(keSenjataTradisional);
    }

    public void senjataGorontalo(View view) {
        Intent keSenjataTradisional = new Intent(activity_senjata_tradisional.this, deskripsiBudaya2.class);

        String judulAdat = getString(R.string.judul_senjataGorontalo);
        String asalAdat = getString(R.string.asal_senjataGorontalo);
        String isiAdat = getString(R.string.sejarah_senjataGorontalo);
        String ciriAdat = getString(R.string.ciri_senjataGorontalo);

        keSenjataTradisional.putExtra("judulAdats", judulAdat.toString());
        keSenjataTradisional.putExtra("asalAdats", asalAdat.toString());
        keSenjataTradisional.putExtra("isiAdats", isiAdat.toString());
        keSenjataTradisional.putExtra("ciriAdats", ciriAdat.toString());
        keSenjataTradisional.putExtra("gambarAdats", R.drawable.senjata25);

        startActivity(keSenjataTradisional);
    }

    public void senjataSulUt(View view) {
        Intent keSenjataTradisional = new Intent(activity_senjata_tradisional.this, deskripsiBudaya2.class);

        String judulAdat = getString(R.string.judul_senjataSulUt);
        String asalAdat = getString(R.string.asal_senjataSulUt);
        String isiAdat = getString(R.string.sejarah_senjataSulUt);
        String ciriAdat = getString(R.string.ciri_senjataSulUt);

        keSenjataTradisional.putExtra("judulAdats", judulAdat.toString());
        keSenjataTradisional.putExtra("asalAdats", asalAdat.toString());
        keSenjataTradisional.putExtra("isiAdats", isiAdat.toString());
        keSenjataTradisional.putExtra("ciriAdats", ciriAdat.toString());
        keSenjataTradisional.putExtra("gambarAdats", R.drawable.senjata26);

        startActivity(keSenjataTradisional);
    }

    public void senjataSulBar(View view) {
        Intent keSenjataTradisional = new Intent(activity_senjata_tradisional.this, deskripsiBudaya2.class);

        String judulAdat = getString(R.string.judul_senjataSulBar);
        String asalAdat = getString(R.string.asal_senjataSulBar);
        String isiAdat = getString(R.string.sejarah_senjataSulBar);
        String ciriAdat = getString(R.string.ciri_senjataSulBar);

        keSenjataTradisional.putExtra("judulAdats", judulAdat.toString());
        keSenjataTradisional.putExtra("asalAdats", asalAdat.toString());
        keSenjataTradisional.putExtra("isiAdats", isiAdat.toString());
        keSenjataTradisional.putExtra("ciriAdats", ciriAdat.toString());
        keSenjataTradisional.putExtra("gambarAdats", R.drawable.senjata27);

        startActivity(keSenjataTradisional);
    }

    public void senjataSulTengah(View view) {
        Intent keSenjataTradisional = new Intent(activity_senjata_tradisional.this, deskripsiBudaya2.class);

        String judulAdat = getString(R.string.judul_senjataSulTengah);
        String asalAdat = getString(R.string.asal_senjataSulTengah);
        String isiAdat = getString(R.string.sejarah_senjataSulTengah);
        String ciriAdat = getString(R.string.ciri_senjataSulTengah);

        keSenjataTradisional.putExtra("judulAdats", judulAdat.toString());
        keSenjataTradisional.putExtra("asalAdats", asalAdat.toString());
        keSenjataTradisional.putExtra("isiAdats", isiAdat.toString());
        keSenjataTradisional.putExtra("ciriAdats", ciriAdat.toString());
        keSenjataTradisional.putExtra("gambarAdats", R.drawable.senjata28);

        startActivity(keSenjataTradisional);
    }

    public void senjataSulTeng(View view) {
        Intent keSenjataTradisional = new Intent(activity_senjata_tradisional.this, deskripsiBudaya2.class);

        String judulAdat = getString(R.string.judul_senjataSulTeng);
        String asalAdat = getString(R.string.asal_senjataSulTeng);
        String isiAdat = getString(R.string.sejarah_senjataSulTeng);
        String ciriAdat = getString(R.string.ciri_senjataSulTeng);

        keSenjataTradisional.putExtra("judulAdats", judulAdat.toString());
        keSenjataTradisional.putExtra("asalAdats", asalAdat.toString());
        keSenjataTradisional.putExtra("isiAdats", isiAdat.toString());
        keSenjataTradisional.putExtra("ciriAdats", ciriAdat.toString());
        keSenjataTradisional.putExtra("gambarAdats", R.drawable.senjata29);

        startActivity(keSenjataTradisional);
    }

    public void senjataSulSel(View view) {
        Intent keSenjataTradisional = new Intent(activity_senjata_tradisional.this, deskripsiBudaya2.class);

        String judulAdat = getString(R.string.judul_senjataSulSel);
        String asalAdat = getString(R.string.asal_senjataSulSel);
        String isiAdat = getString(R.string.sejarah_senjataSulSel);
        String ciriAdat = getString(R.string.ciri_senjataSulSel);

        keSenjataTradisional.putExtra("judulAdats", judulAdat.toString());
        keSenjataTradisional.putExtra("asalAdats", asalAdat.toString());
        keSenjataTradisional.putExtra("isiAdats", isiAdat.toString());
        keSenjataTradisional.putExtra("ciriAdats", ciriAdat.toString());
        keSenjataTradisional.putExtra("gambarAdats", R.drawable.senjata30);

        startActivity(keSenjataTradisional);
    }

    public void senjataMalukuUtara(View view) {
        Intent keSenjataTradisional = new Intent(activity_senjata_tradisional.this, deskripsiBudaya2.class);

        String judulAdat = getString(R.string.judul_senjataMalukuUtara);
        String asalAdat = getString(R.string.asal_senjataMalukuUtara);
        String isiAdat = getString(R.string.sejarah_senjataMalukuUtara);
        String ciriAdat = getString(R.string.ciri_senjataMalukuUtara);

        keSenjataTradisional.putExtra("judulAdats", judulAdat.toString());
        keSenjataTradisional.putExtra("asalAdats", asalAdat.toString());
        keSenjataTradisional.putExtra("isiAdats", isiAdat.toString());
        keSenjataTradisional.putExtra("ciriAdats", ciriAdat.toString());
        keSenjataTradisional.putExtra("gambarAdats", R.drawable.senjata31);

        startActivity(keSenjataTradisional);
    }

    public void senjataMaluku(View view) {
        Intent keSenjataTradisional = new Intent(activity_senjata_tradisional.this, deskripsiBudaya2.class);

        String judulAdat = getString(R.string.judul_tariMaluku);
        String asalAdat = getString(R.string.asal_tariMaluku);
        String isiAdat = getString(R.string.isi_tariMaluku);
        String ciriAdat = getString(R.string.ciri_senjataMaluku);

        keSenjataTradisional.putExtra("judulAdats", judulAdat.toString());
        keSenjataTradisional.putExtra("asalAdats", asalAdat.toString());
        keSenjataTradisional.putExtra("isiAdats", isiAdat.toString());
        keSenjataTradisional.putExtra("ciriAdats", ciriAdat.toString());
        keSenjataTradisional.putExtra("gambarAdats", R.drawable.senjata32);

        startActivity(keSenjataTradisional);
    }

    public void senjataPapua(View view) {
        Intent keSenjataTradisional = new Intent(activity_senjata_tradisional.this, deskripsiBudaya2.class);

        String judulAdat = getString(R.string.judul_senjataPapua);
        String asalAdat = getString(R.string.asal_senjataPapua);
        String isiAdat = getString(R.string.sejarah_senjataPapua);
        String ciriAdat = getString(R.string.ciri_senjataPapua);

        keSenjataTradisional.putExtra("judulAdats", judulAdat.toString());
        keSenjataTradisional.putExtra("asalAdats", asalAdat.toString());
        keSenjataTradisional.putExtra("isiAdats", isiAdat.toString());
        keSenjataTradisional.putExtra("ciriAdats", ciriAdat.toString());
        keSenjataTradisional.putExtra("gambarAdats", R.drawable.senjata33);

        startActivity(keSenjataTradisional);
    }

    public void senjataPapuaBarat(View view) {
        Intent keSenjataTradisional = new Intent(activity_senjata_tradisional.this, deskripsiBudaya2.class);

        String judulAdat = getString(R.string.judul_senjataPapuaBarat);
        String asalAdat = getString(R.string.asal_senjataPapuaBarat);
        String isiAdat = getString(R.string.sejarah_senjataPapuaBarat);
        String ciriAdat = getString(R.string.ciri_senjataPapuaBarat);

        keSenjataTradisional.putExtra("judulAdats", judulAdat.toString());
        keSenjataTradisional.putExtra("asalAdats", asalAdat.toString());
        keSenjataTradisional.putExtra("isiAdats", isiAdat.toString());
        keSenjataTradisional.putExtra("ciriAdats", ciriAdat.toString());
        keSenjataTradisional.putExtra("gambarAdats", R.drawable.senjata34);

        startActivity(keSenjataTradisional);
    }

}