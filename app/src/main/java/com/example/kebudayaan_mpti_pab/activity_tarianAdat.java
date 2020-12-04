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

    //ubah per method public void tarianAdat nya. terus di activity tarian adat .xml dipasangin onClick di image view sesuai adatnya

    public void tarianAdat1 (View view){
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_deskripsiBudaya.class);

        //3 string ini diganti sesuai nama string per budayanya
        String judulAdat = getString(R.string.judul_tariAceh);
        String asalAdat = getString(R.string.asal_tariAceh);
        String isiAdat = getString(R.string.isi_tariAceh);

        keTarianAdat.putExtra("judulAdats", judulAdat.toString());
        keTarianAdat.putExtra("asalAdats", asalAdat.toString());
        keTarianAdat.putExtra("isiAdats", isiAdat.toString());
        //gambar per budaya. 'background1' diganti sesuai gambar per budayanya.
        keTarianAdat.putExtra("gambarAdats", R.drawable.background1);

        startActivity(keTarianAdat);
    }

    public void tarianAdat2 (View view){
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_deskripsiBudaya.class);
        startActivity(keTarianAdat);
    }

    public void tarianAdat3 (View view){
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_deskripsiBudaya.class);
        startActivity(keTarianAdat);
    }

    public void tarianAdat4 (View view){
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_deskripsiBudaya.class);
        startActivity(keTarianAdat);
    }

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