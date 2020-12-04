package com.example.kebudayaan_mpti_pab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_tarianAdat extends AppCompatActivity {

    private static final String LOG_TAG = activity_pengenalanBudaya.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarian_adat);
    }

    //---------------------------------\\
    // Ubah per method public void tarianAdat 1-16 nya \\
    // Terus di activity_tarian_adat.xml dipasangin onClick per image view sesuai adatnya \\
    //---------------------------------\\

    public void tarianAdat1 (View view){
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_deskripsiBudaya.class);

        // 3 String ini diubah sesuai adatnya. ubah hanya yang di ujung \\
        String judulAdat = getString(R.string.judul_tariAceh);
        String asalAdat = getString(R.string.asal_tariAceh);
        String isiAdat = getString(R.string.isi_tariAceh);

        // 3 ini biarin \\
        keTarianAdat.putExtra("judulAdats", judulAdat.toString());
        keTarianAdat.putExtra("asalAdats", asalAdat.toString());
        keTarianAdat.putExtra("isiAdats", isiAdat.toString());

        // nah yang ini ubah juga sesuain gambarnya. \\
        // jangan lupa di activity yang .xml nya image viewnya diubah resource gambarnya. \\
        // di .xml gambarnya sesuai sama kayak yang disini. \\
        keTarianAdat.putExtra("gambarAdats", R.drawable.contohtari1);

        startActivity(keTarianAdat);

        // jadi intinya yang diubah di file ini sama xml nya juga. \\
        // di file ini bikin method 16 di xml di pasangin onclick di image view. \\

        // seterusnya. di file activity_rumahAdat, activity_senjata, activity_baju, kayak gini semua
    }

    public void tarianAdat2 (View view){
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_tariAceh);
        String asalAdat = getString(R.string.asal_tariAceh);
        String isiAdat = getString(R.string.isi_tariAceh);

        keTarianAdat.putExtra("judulAdats", judulAdat.toString());
        keTarianAdat.putExtra("asalAdats", asalAdat.toString());
        keTarianAdat.putExtra("isiAdats", isiAdat.toString());
        keTarianAdat.putExtra("gambarAdats", R.drawable.contohtari2);

        startActivity(keTarianAdat);
    }

    public void tarianAdat3 (View view){
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_tariAceh);
        String asalAdat = getString(R.string.asal_tariAceh);
        String isiAdat = getString(R.string.isi_tariAceh);

        keTarianAdat.putExtra("judulAdats", judulAdat.toString());
        keTarianAdat.putExtra("asalAdats", asalAdat.toString());
        keTarianAdat.putExtra("isiAdats", isiAdat.toString());
        keTarianAdat.putExtra("gambarAdats", R.drawable.contohtari3);

        startActivity(keTarianAdat);
    }

    public void tarianAdat4 (View view){
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_tariAceh);
        String asalAdat = getString(R.string.asal_tariAceh);
        String isiAdat = getString(R.string.isi_tariAceh);

        keTarianAdat.putExtra("judulAdats", judulAdat.toString());
        keTarianAdat.putExtra("asalAdats", asalAdat.toString());
        keTarianAdat.putExtra("isiAdats", isiAdat.toString());
        keTarianAdat.putExtra("gambarAdats", R.drawable.contohtari4);

        startActivity(keTarianAdat);
    }



    //tinggal matiin comment, ctrl + shift + ?

    /*public void tarianAdat5 (View view){
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_tarianAdat.class);



        startActivity(keTarianAdat);
    }

    public void tarianAdat6 (View view){
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_tarianAdat.class);



        startActivity(keTarianAdat);
    }

    public void tarianAdat7 (View view){
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_tarianAdat.class);



        startActivity(keTarianAdat);
    }

    public void tarianAdat8 (View view){
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_tarianAdat.class);



        startActivity(keTarianAdat);
    }

    public void tarianAdat9 (View view){
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_tarianAdat.class);



        startActivity(keTarianAdat);
    }

    public void tarianAdat10 (View view){
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_tarianAdat.class);



        startActivity(keTarianAdat);
    }

    public void tarianAdat11 (View view){
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_tarianAdat.class);



        startActivity(keTarianAdat);
    }

    public void tarianAdat12 (View view){
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_tarianAdat.class);



        startActivity(keTarianAdat);
    }

    public void tarianAdat13 (View view){
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_tarianAdat.class);



        startActivity(keTarianAdat);
    }

    public void tarianAdat14 (View view){
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_tarianAdat.class);



        startActivity(keTarianAdat);
    }

    public void tarianAdat15 (View view){
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_tarianAdat.class);



        startActivity(keTarianAdat);
    }

    public void tarianAdat16 (View view){
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_tarianAdat.class);



        startActivity(keTarianAdat);
    }*/
}