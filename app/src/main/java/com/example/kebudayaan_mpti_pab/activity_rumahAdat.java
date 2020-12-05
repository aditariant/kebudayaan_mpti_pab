package com.example.kebudayaan_mpti_pab;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class activity_rumahAdat extends AppCompatActivity {
    private static final String LOG_TAG = activity_pengenalanBudaya.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rumah_adat);
    }
    public void rumahadat1 (View view){
        Intent keRumahAdat = new Intent(activity_rumahAdat.this, activity_deskripsiBudaya.class);

        // 3 String ini diubah sesuai adatnya. ubah hanya yang di ujung \\
        String judulAdat = getString(R.string.judul_rumahAceh);
        String asalAdat = getString(R.string.asal_rumahAceh);
        String isiAdat = getString(R.string.isi_rumahAceh);

        // 3 ini biarin \\
        keRumahAdat.putExtra("judulAdats", judulAdat.toString());
        keRumahAdat.putExtra("asalAdats", asalAdat.toString());
        keRumahAdat.putExtra("isiAdats", isiAdat.toString());

        // nah yang ini ubah juga sesuain gambarnya. \\
        // jangan lupa di activity yang .xml nya image viewnya diubah resource gambarnya. \\
        // di .xml gambarnya sesuai sama kayak yang disini. \\
        keRumahAdat.putExtra("gambarAdats", R.drawable.contohtari1);

        startActivity(keRumahAdat);

        // jadi intinya yang diubah di file ini sama xml nya juga. \\
        // di file ini bikin method 16 di xml di pasangin onclick di image view. \\

        // seterusnya. di file activity_rumahAdat, activity_senjata, activity_baju, kayak gini semua
    }

    public void rumahadat2 (View view){
        Intent keRumahAdat = new Intent(activity_rumahAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_rumahSumut);
        String asalAdat = getString(R.string.asal_rumahSumUt);
        String isiAdat = getString(R.string.isi_rumahSumUt);

        keRumahAdat.putExtra("judulAdats", judulAdat.toString());
        keRumahAdat.putExtra("asalAdats", asalAdat.toString());
        keRumahAdat.putExtra("isiAdats", isiAdat.toString());
        keRumahAdat.putExtra("gambarAdats", R.drawable.contohtari2);

        startActivity(keRumahAdat);
    }

    public void  RumahAdat3 (View view){
        Intent  keRumahAdat = new Intent(activity_rumahAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_rumahSumsel);
        String asalAdat = getString(R.string.asal_rumahSumSel);
        String isiAdat = getString(R.string.isi_rumahSumSel);

        keRumahAdat.putExtra("judulAdats", judulAdat.toString());
        keRumahAdat.putExtra("asalAdats", asalAdat.toString());
        keRumahAdat.putExtra("isiAdats", isiAdat.toString());
        keRumahAdat.putExtra("gambarAdats", R.drawable.contohtari3);

        startActivity( keRumahAdat);
    }

    public void  RumahAdat4 (View view){
        Intent  keRumahAdat = new Intent(activity_rumahAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_rumahJabar);
        String asalAdat = getString(R.string.asal_rumahJabar);
        String isiAdat = getString(R.string.isi_rumahJabar);

        keRumahAdat.putExtra("judulAdats", judulAdat.toString());
        keRumahAdat.putExtra("asalAdats", asalAdat.toString());
        keRumahAdat.putExtra("isiAdats", isiAdat.toString());
        keRumahAdat.putExtra("gambarAdats", R.drawable.contohtari4);

        startActivity( keRumahAdat);
    }
}
