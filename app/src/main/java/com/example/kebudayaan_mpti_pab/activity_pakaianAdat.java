package com.example.kebudayaan_mpti_pab;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class activity_pakaianAdat extends AppCompatActivity {

    private static final String LOG_TAG = activity_pengenalanBudaya.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pakaian_adat);
    }

    public void bajuAdat1 (View view){
        Intent keBajuAdat = new Intent(activity_pakaianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_pakaianAceh);
        String asalAdat = getString(R.string.asal_pakaianAceh);
        String isiAdat = getString(R.string.isi_pakaianAceh);

        keBajuAdat.putExtra("judulAdats", judulAdat.toString());
        keBajuAdat.putExtra("asalAdats", asalAdat.toString());
        keBajuAdat.putExtra("isiAdats", isiAdat.toString());
        keBajuAdat.putExtra("gambarAdats", R.drawable.baju1);

        startActivity(keBajuAdat);
    }
    public void bajuAdat2 (View view){
        Intent keBajuAdat = new Intent(activity_pakaianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_pakaianSumut);
        String asalAdat = getString(R.string.asal_pakaianSumut);
        String isiAdat = getString(R.string.isi_pakaianSumut);

        keBajuAdat.putExtra("judulAdats", judulAdat.toString());
        keBajuAdat.putExtra("asalAdats", asalAdat.toString());
        keBajuAdat.putExtra("isiAdats", isiAdat.toString());
        keBajuAdat.putExtra("gambarAdats", R.drawable.baju2);

        startActivity(keBajuAdat);
    }
    public void bajuAdat3 (View view){
        Intent keBajuAdat = new Intent(activity_pakaianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_pakaianSumbar);
        String asalAdat = getString(R.string.asal_pakaianSumbar);
        String isiAdat = getString(R.string.isi_pakaianSumbar);

        keBajuAdat.putExtra("judulAdats", judulAdat.toString());
        keBajuAdat.putExtra("asalAdats", asalAdat.toString());
        keBajuAdat.putExtra("isiAdats", isiAdat.toString());
        keBajuAdat.putExtra("gambarAdats", R.drawable.baju3);

        startActivity(keBajuAdat);
    }
    public void bajuAdat4 (View view){
        Intent keBajuAdat = new Intent(activity_pakaianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_pakaianSumsel);
        String asalAdat = getString(R.string.asal_pakaianSumsel);
        String isiAdat = getString(R.string.isi_pakaianSumsel);

        keBajuAdat.putExtra("judulAdats", judulAdat.toString());
        keBajuAdat.putExtra("asalAdats", asalAdat.toString());
        keBajuAdat.putExtra("isiAdats", isiAdat.toString());
        keBajuAdat.putExtra("gambarAdats", R.drawable.baju4);

        startActivity(keBajuAdat);
    }
    public void bajuAdat5 (View view){
        Intent keBajuAdat = new Intent(activity_pakaianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_pakaianJabar);
        String asalAdat = getString(R.string.asal_pakaianJabar);
        String isiAdat = getString(R.string.isi_pakaianJabar);

        keBajuAdat.putExtra("judulAdats", judulAdat.toString());
        keBajuAdat.putExtra("asalAdats", asalAdat.toString());
        keBajuAdat.putExtra("isiAdats", isiAdat.toString());
        keBajuAdat.putExtra("gambarAdats", R.drawable.baju5);

        startActivity(keBajuAdat);
    }
    public void bajuAdat6 (View view){
        Intent keBajuAdat = new Intent(activity_pakaianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_pakaianJkt);
        String asalAdat = getString(R.string.asal_pakaianJkt);
        String isiAdat = getString(R.string.isi_pakaianJkt);

        keBajuAdat.putExtra("judulAdats", judulAdat.toString());
        keBajuAdat.putExtra("asalAdats", asalAdat.toString());
        keBajuAdat.putExtra("isiAdats", isiAdat.toString());
        keBajuAdat.putExtra("gambarAdats", R.drawable.baju6);

        startActivity(keBajuAdat);
    }
    public void bajuAdat7 (View view){
        Intent keBajuAdat = new Intent(activity_pakaianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_pakaianJogja);
        String asalAdat = getString(R.string.asal_pakaianJogja);
        String isiAdat = getString(R.string.isi_pakaianJogja);

        keBajuAdat.putExtra("judulAdats", judulAdat.toString());
        keBajuAdat.putExtra("asalAdats", asalAdat.toString());
        keBajuAdat.putExtra("isiAdats", isiAdat.toString());
        keBajuAdat.putExtra("gambarAdats", R.drawable.baju7);

        startActivity(keBajuAdat);
    }
    public void bajuAdat8 (View view){
        Intent keBajuAdat = new Intent(activity_pakaianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_pakaianJatim);
        String asalAdat = getString(R.string.asal_pakaianJatim);
        String isiAdat = getString(R.string.isi_pakaianJatim);

        keBajuAdat.putExtra("judulAdats", judulAdat.toString());
        keBajuAdat.putExtra("asalAdats", asalAdat.toString());
        keBajuAdat.putExtra("isiAdats", isiAdat.toString());
        keBajuAdat.putExtra("gambarAdats", R.drawable.baju8);

        startActivity(keBajuAdat);
    }
    public void bajuAdat9 (View view){
        Intent keBajuAdat = new Intent(activity_pakaianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_pakaianBali);
        String asalAdat = getString(R.string.asal_pakaianBali);
        String isiAdat = getString(R.string.isi_pakaianBali);

        keBajuAdat.putExtra("judulAdats", judulAdat.toString());
        keBajuAdat.putExtra("asalAdats", asalAdat.toString());
        keBajuAdat.putExtra("isiAdats", isiAdat.toString());
        keBajuAdat.putExtra("gambarAdats", R.drawable.baju9);

        startActivity(keBajuAdat);
    }
    public void bajuAdat10 (View view){
        Intent keBajuAdat = new Intent(activity_pakaianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_pakaianKalbar);
        String asalAdat = getString(R.string.asal_pakaianKalbar);
        String isiAdat = getString(R.string.isi_pakaianKalbar);

        keBajuAdat.putExtra("judulAdats", judulAdat.toString());
        keBajuAdat.putExtra("asalAdats", asalAdat.toString());
        keBajuAdat.putExtra("isiAdats", isiAdat.toString());
        keBajuAdat.putExtra("gambarAdats", R.drawable.baju10);

        startActivity(keBajuAdat);
    }
    public void bajuAdat11 (View view){
        Intent keBajuAdat = new Intent(activity_pakaianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_pakaianKaltim);
        String asalAdat = getString(R.string.asal_pakaianKaltim);
        String isiAdat = getString(R.string.isi_pakaianKaltim);

        keBajuAdat.putExtra("judulAdats", judulAdat.toString());
        keBajuAdat.putExtra("asalAdats", asalAdat.toString());
        keBajuAdat.putExtra("isiAdats", isiAdat.toString());
        keBajuAdat.putExtra("gambarAdats", R.drawable.baju11);

        startActivity(keBajuAdat);
    }
    public void bajuAdat12 (View view){
        Intent keBajuAdat = new Intent(activity_pakaianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_pakaianKalsel);
        String asalAdat = getString(R.string.asal_pakaianKalsel);
        String isiAdat = getString(R.string.isi_pakaianKalsel);

        keBajuAdat.putExtra("judulAdats", judulAdat.toString());
        keBajuAdat.putExtra("asalAdats", asalAdat.toString());
        keBajuAdat.putExtra("isiAdats", isiAdat.toString());
        keBajuAdat.putExtra("gambarAdats", R.drawable.baju12);

        startActivity(keBajuAdat);
    }
    public void bajuAdat13 (View view){
        Intent keBajuAdat = new Intent(activity_pakaianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_pakaianGorontalo);
        String asalAdat = getString(R.string.asal_pakaianGorontalo);
        String isiAdat = getString(R.string.isi_pakaianGorontalo);

        keBajuAdat.putExtra("judulAdats", judulAdat.toString());
        keBajuAdat.putExtra("asalAdats", asalAdat.toString());
        keBajuAdat.putExtra("isiAdats", isiAdat.toString());
        keBajuAdat.putExtra("gambarAdats", R.drawable.baju13);

        startActivity(keBajuAdat);
    }
    public void bajuAdat14 (View view){
        Intent keBajuAdat = new Intent(activity_pakaianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_pakaianSulsel);
        String asalAdat = getString(R.string.asal_pakaianSulsel);
        String isiAdat = getString(R.string.isi_pakaianSulsel);

        keBajuAdat.putExtra("judulAdats", judulAdat.toString());
        keBajuAdat.putExtra("asalAdats", asalAdat.toString());
        keBajuAdat.putExtra("isiAdats", isiAdat.toString());
        keBajuAdat.putExtra("gambarAdats", R.drawable.baju14);

        startActivity(keBajuAdat);
    }
    public void bajuAdat15 (View view){
        Intent keBajuAdat = new Intent(activity_pakaianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_pakaianMaluku);
        String asalAdat = getString(R.string.asal_pakaianMaluku);
        String isiAdat = getString(R.string.isi_pakaianMaluku);

        keBajuAdat.putExtra("judulAdats", judulAdat.toString());
        keBajuAdat.putExtra("asalAdats", asalAdat.toString());
        keBajuAdat.putExtra("isiAdats", isiAdat.toString());
        keBajuAdat.putExtra("gambarAdats", R.drawable.baju15);

        startActivity(keBajuAdat);
    }
    public void bajuAdat16 (View view){
        Intent keBajuAdat = new Intent(activity_pakaianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_pakaianPapua);
        String asalAdat = getString(R.string.asal_pakaianPapua);
        String isiAdat = getString(R.string.isi_pakaianPapua);

        keBajuAdat.putExtra("judulAdats", judulAdat.toString());
        keBajuAdat.putExtra("asalAdats", asalAdat.toString());
        keBajuAdat.putExtra("isiAdats", isiAdat.toString());
        keBajuAdat.putExtra("gambarAdats", R.drawable.baju16);

        startActivity(keBajuAdat);
    }
}
