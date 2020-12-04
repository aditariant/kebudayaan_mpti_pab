package com.example.kebudayaan_mpti_pab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import static com.example.kebudayaan_mpti_pab.R.string.isi_tariAceh;

public class activity_senjata_tradisional extends AppCompatActivity {

    private static final String LOG_TAG = activity_pengenalanBudaya.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senjata_tradisional);
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
        keSenjataTradisional.putExtra("gambarAdats", R.drawable.senjata1);

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
        keSenjataTradisional.putExtra("gambarAdats", R.drawable.senjata4);

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
        keSenjataTradisional.putExtra("gambarAdats", R.drawable.senjata5);

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
        keSenjataTradisional.putExtra("gambarAdats", R.drawable.senjata6);

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
        keSenjataTradisional.putExtra("gambarAdats", R.drawable.senjata7);

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
        keSenjataTradisional.putExtra("gambarAdats", R.drawable.senjata8);

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
        keSenjataTradisional.putExtra("gambarAdats", R.drawable.senjata9);

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
        keSenjataTradisional.putExtra("gambarAdats", R.drawable.senjata10);

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
        keSenjataTradisional.putExtra("gambarAdats", R.drawable.senjata11);

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
        keSenjataTradisional.putExtra("gambarAdats", R.drawable.senjata12);

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
        keSenjataTradisional.putExtra("gambarAdats", R.drawable.senjata13);

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
        keSenjataTradisional.putExtra("gambarAdats", R.drawable.senjata14);

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
        keSenjataTradisional.putExtra("gambarAdats", R.drawable.senjata15);

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
        keSenjataTradisional.putExtra("gambarAdats", R.drawable.senjata16);

        startActivity(keSenjataTradisional);
    }

}