package com.example.kebudayaan_mpti_pab;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class activity_rumahAdat extends AppCompatActivity {

    private static final String LOG_TAG = activity_pengenalanBudaya.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rumah_adat);

        ImageView toolbarleftIcons = findViewById(R.id.leftIcon);
        toolbarleftIcons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    public void rumahAdat1 (View view){
        Intent keRumahAdat = new Intent(activity_rumahAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_rumahAceh);
        String asalAdat = getString(R.string.asal_rumahAceh);
        String isiAdat = getString(R.string.isi_rumahAceh);

        keRumahAdat.putExtra("judulAdats", judulAdat.toString());
        keRumahAdat.putExtra("asalAdats", asalAdat.toString());
        keRumahAdat.putExtra("isiAdats", isiAdat.toString());
        keRumahAdat.putExtra("gambarAdats", R.drawable.rumah1);

        startActivity(keRumahAdat);
    }

    public void rumahAdat2 (View view){
        Intent keRumahAdat = new Intent(activity_rumahAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_rumahSumut);
        String asalAdat = getString(R.string.asal_rumahSumUt);
        String isiAdat = getString(R.string.isi_rumahSumUt);

        keRumahAdat.putExtra("judulAdats", judulAdat.toString());
        keRumahAdat.putExtra("asalAdats", asalAdat.toString());
        keRumahAdat.putExtra("isiAdats", isiAdat.toString());
        keRumahAdat.putExtra("gambarAdats", R.drawable.rumah2);

        startActivity(keRumahAdat);
    }

    public void  rumahAdat3 (View view){
        Intent  keRumahAdat = new Intent(activity_rumahAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_rumahSumbar);
        String asalAdat = getString(R.string.asal_rumahSumBar);
        String isiAdat = getString(R.string.isi_rumahSumBar);

        keRumahAdat.putExtra("judulAdats", judulAdat.toString());
        keRumahAdat.putExtra("asalAdats", asalAdat.toString());
        keRumahAdat.putExtra("isiAdats", isiAdat.toString());
        keRumahAdat.putExtra("gambarAdats", R.drawable.rumah3);

        startActivity( keRumahAdat);
    }

    public void  rumahAdat4 (View view){
        Intent  keRumahAdat = new Intent(activity_rumahAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_rumahRiau);
        String asalAdat = getString(R.string.asal_rumahRiau);
        String isiAdat = getString(R.string.isi_rumahRiau);

        keRumahAdat.putExtra("judulAdats", judulAdat.toString());
        keRumahAdat.putExtra("asalAdats", asalAdat.toString());
        keRumahAdat.putExtra("isiAdats", isiAdat.toString());
        keRumahAdat.putExtra("gambarAdats", R.drawable.rumah4);

        startActivity( keRumahAdat);
    }
    public void  rumahAdat5 (View view){
        Intent  keRumahAdat = new Intent(activity_rumahAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_rumahKepri);
        String asalAdat = getString(R.string.asal_rumahKepri);
        String isiAdat = getString(R.string.isi_rumahKepri);

        keRumahAdat.putExtra("judulAdats", judulAdat.toString());
        keRumahAdat.putExtra("asalAdats", asalAdat.toString());
        keRumahAdat.putExtra("isiAdats", isiAdat.toString());
        keRumahAdat.putExtra("gambarAdats", R.drawable.rumah5);

        startActivity( keRumahAdat);
    }
    public void  rumahAdat6 (View view){
        Intent  keRumahAdat = new Intent(activity_rumahAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_rumahJambi);
        String asalAdat = getString(R.string.asal_rumahJambi);
        String isiAdat = getString(R.string.isi_rumahJambi);

        keRumahAdat.putExtra("judulAdats", judulAdat.toString());
        keRumahAdat.putExtra("asalAdats", asalAdat.toString());
        keRumahAdat.putExtra("isiAdats", isiAdat.toString());
        keRumahAdat.putExtra("gambarAdats", R.drawable.rumah6);

        startActivity( keRumahAdat);
    }
    public void  rumahAdat7 (View view){
        Intent  keRumahAdat = new Intent(activity_rumahAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_rumahBengkulu);
        String asalAdat = getString(R.string.asal_rumahBengkulu);
        String isiAdat = getString(R.string.isi_rumahBengkulu);

        keRumahAdat.putExtra("judulAdats", judulAdat.toString());
        keRumahAdat.putExtra("asalAdats", asalAdat.toString());
        keRumahAdat.putExtra("isiAdats", isiAdat.toString());
        keRumahAdat.putExtra("gambarAdats", R.drawable.rumah7);

        startActivity( keRumahAdat);
    }
    public void  rumahAdat8 (View view){
        Intent  keRumahAdat = new Intent(activity_rumahAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_rumahBangka);
        String asalAdat = getString(R.string.asal_rumahBangka);
        String isiAdat = getString(R.string.isi_rumahBangka);

        keRumahAdat.putExtra("judulAdats", judulAdat.toString());
        keRumahAdat.putExtra("asalAdats", asalAdat.toString());
        keRumahAdat.putExtra("isiAdats", isiAdat.toString());
        keRumahAdat.putExtra("gambarAdats", R.drawable.rumah8);

        startActivity( keRumahAdat);
    }

    public void rumahAdat9 (View view){
        Intent  keRumahAdat = new Intent(activity_rumahAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_rumahSumbar);
        String asalAdat = getString(R.string.asal_rumahSumBar);
        String isiAdat = getString(R.string.isi_rumahSumBar);

        keRumahAdat.putExtra("judulAdats", judulAdat.toString());
        keRumahAdat.putExtra("asalAdats", asalAdat.toString());
        keRumahAdat.putExtra("isiAdats", isiAdat.toString());
        keRumahAdat.putExtra("gambarAdats", R.drawable.rumah9);

        startActivity( keRumahAdat);
    }

    public void  rumahAdat10 (View view){
        Intent  keRumahAdat = new Intent(activity_rumahAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_rumahLampung);
        String asalAdat = getString(R.string.asal_rumahLampung);
        String isiAdat = getString(R.string.isi_rumahLampung);

        keRumahAdat.putExtra("judulAdats", judulAdat.toString());
        keRumahAdat.putExtra("asalAdats", asalAdat.toString());
        keRumahAdat.putExtra("isiAdats", isiAdat.toString());
        keRumahAdat.putExtra("gambarAdats", R.drawable.rumah10);

        startActivity( keRumahAdat);
    }

    public void  rumahAdat11 (View view){
        Intent  keRumahAdat = new Intent(activity_rumahAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_rumahBanten);
        String asalAdat = getString(R.string.asal_rumahBanten);
        String isiAdat = getString(R.string.isi_rumahBanten);

        keRumahAdat.putExtra("judulAdats", judulAdat.toString());
        keRumahAdat.putExtra("asalAdats", asalAdat.toString());
        keRumahAdat.putExtra("isiAdats", isiAdat.toString());
        keRumahAdat.putExtra("gambarAdats", R.drawable.rumah11);

        startActivity( keRumahAdat);
    }

    public void  rumahAdat12 (View view){
        Intent  keRumahAdat = new Intent(activity_rumahAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_rumahJabar);
        String asalAdat = getString(R.string.asal_rumahJabar);
        String isiAdat = getString(R.string.isi_rumahJabar);

        keRumahAdat.putExtra("judulAdats", judulAdat.toString());
        keRumahAdat.putExtra("asalAdats", asalAdat.toString());
        keRumahAdat.putExtra("isiAdats", isiAdat.toString());
        keRumahAdat.putExtra("gambarAdats", R.drawable.rumah12);

        startActivity( keRumahAdat);
    }
    public void  rumahAdat13 (View view){
        Intent  keRumahAdat = new Intent(activity_rumahAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_rumahJkt);
        String asalAdat = getString(R.string.asal_rumahJkt);
        String isiAdat = getString(R.string.isi_rumahJkt);

        keRumahAdat.putExtra("judulAdats", judulAdat.toString());
        keRumahAdat.putExtra("asalAdats", asalAdat.toString());
        keRumahAdat.putExtra("isiAdats", isiAdat.toString());
        keRumahAdat.putExtra("gambarAdats", R.drawable.rumah13);

        startActivity( keRumahAdat);
    }

    public void  rumahAdat14 (View view){
        Intent  keRumahAdat = new Intent(activity_rumahAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_rumahJateng);
        String asalAdat = getString(R.string.asal_rumahJateng);
        String isiAdat = getString(R.string.isi_rumahJateng);

        keRumahAdat.putExtra("judulAdats", judulAdat.toString());
        keRumahAdat.putExtra("asalAdats", asalAdat.toString());
        keRumahAdat.putExtra("isiAdats", isiAdat.toString());
        keRumahAdat.putExtra("gambarAdats", R.drawable.rumah14);

        startActivity( keRumahAdat);
    }

    public void  rumahAdat15 (View view){
        Intent  keRumahAdat = new Intent(activity_rumahAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_rumahJogja);
        String asalAdat = getString(R.string.asal_rumahJogja);
        String isiAdat = getString(R.string.isi_rumahJogja);

        keRumahAdat.putExtra("judulAdats", judulAdat.toString());
        keRumahAdat.putExtra("asalAdats", asalAdat.toString());
        keRumahAdat.putExtra("isiAdats", isiAdat.toString());
        keRumahAdat.putExtra("gambarAdats", R.drawable.rumah15);

        startActivity( keRumahAdat);
    }
    public void  rumahAdat16 (View view){
        Intent  keRumahAdat = new Intent(activity_rumahAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_rumahJatim);
        String asalAdat = getString(R.string.asal_rumahJatim);
        String isiAdat = getString(R.string.isi_rumahJatim);

        keRumahAdat.putExtra("judulAdats", judulAdat.toString());
        keRumahAdat.putExtra("asalAdats", asalAdat.toString());
        keRumahAdat.putExtra("isiAdats", isiAdat.toString());
        keRumahAdat.putExtra("gambarAdats", R.drawable.rumah16);

        startActivity( keRumahAdat);
    }
    public void  rumahAdat17 (View view){
        Intent  keRumahAdat = new Intent(activity_rumahAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_rumahBali);
        String asalAdat = getString(R.string.asal_rumahBali);
        String isiAdat = getString(R.string.isi_rumahBali);

        keRumahAdat.putExtra("judulAdats", judulAdat.toString());
        keRumahAdat.putExtra("asalAdats", asalAdat.toString());
        keRumahAdat.putExtra("isiAdats", isiAdat.toString());
        keRumahAdat.putExtra("gambarAdats", R.drawable.rumah17);

        startActivity( keRumahAdat);
    }

    public void  rumahAdat18 (View view){
        Intent  keRumahAdat = new Intent(activity_rumahAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_rumahNTT);
        String asalAdat = getString(R.string.asal_rumahNTT);
        String isiAdat = getString(R.string.isi_rumahNTT);

        keRumahAdat.putExtra("judulAdats", judulAdat.toString());
        keRumahAdat.putExtra("asalAdats", asalAdat.toString());
        keRumahAdat.putExtra("isiAdats", isiAdat.toString());
        keRumahAdat.putExtra("gambarAdats", R.drawable.rumah18);

        startActivity( keRumahAdat);
    }
    public void  rumahAdat19 (View view){
        Intent  keRumahAdat = new Intent(activity_rumahAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_rumahNTB);
        String asalAdat = getString(R.string.asal_rumahNTB);
        String isiAdat = getString(R.string.isi_rumahNTB);

        keRumahAdat.putExtra("judulAdats", judulAdat.toString());
        keRumahAdat.putExtra("asalAdats", asalAdat.toString());
        keRumahAdat.putExtra("isiAdats", isiAdat.toString());
        keRumahAdat.putExtra("gambarAdats", R.drawable.rumah19);

        startActivity( keRumahAdat);
    }

    public void  rumahAdat20 (View view){
        Intent  keRumahAdat = new Intent(activity_rumahAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_rumahKalut);
        String asalAdat = getString(R.string.asal_rumahKalut);
        String isiAdat = getString(R.string.isi_rumahKalut);

        keRumahAdat.putExtra("judulAdats", judulAdat.toString());
        keRumahAdat.putExtra("asalAdats", asalAdat.toString());
        keRumahAdat.putExtra("isiAdats", isiAdat.toString());
        keRumahAdat.putExtra("gambarAdats", R.drawable.rumah20);

        startActivity( keRumahAdat);
    }

    public void  rumahAdat21 (View view){
        Intent  keRumahAdat = new Intent(activity_rumahAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_rumahKalbar);
        String asalAdat = getString(R.string.asal_rumahKalbar);
        String isiAdat = getString(R.string.isi_rumahKalbar);

        keRumahAdat.putExtra("judulAdats", judulAdat.toString());
        keRumahAdat.putExtra("asalAdats", asalAdat.toString());
        keRumahAdat.putExtra("isiAdats", isiAdat.toString());
        keRumahAdat.putExtra("gambarAdats", R.drawable.rumah21);

        startActivity( keRumahAdat);
    }

    public void  rumahAdat22 (View view){
        Intent  keRumahAdat = new Intent(activity_rumahAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_rumahKalteng);
        String asalAdat = getString(R.string.asal_rumahKalteng);
        String isiAdat = getString(R.string.isi_rumahKalteng);

        keRumahAdat.putExtra("judulAdats", judulAdat.toString());
        keRumahAdat.putExtra("asalAdats", asalAdat.toString());
        keRumahAdat.putExtra("isiAdats", isiAdat.toString());
        keRumahAdat.putExtra("gambarAdats", R.drawable.rumah22);

        startActivity( keRumahAdat);
    }

    public void  rumahAdat23 (View view){
        Intent  keRumahAdat = new Intent(activity_rumahAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_rumahKaltim);
        String asalAdat = getString(R.string.asal_rumahKaltim);
        String isiAdat = getString(R.string.isi_rumahKaltim);

        keRumahAdat.putExtra("judulAdats", judulAdat.toString());
        keRumahAdat.putExtra("asalAdats", asalAdat.toString());
        keRumahAdat.putExtra("isiAdats", isiAdat.toString());
        keRumahAdat.putExtra("gambarAdats", R.drawable.rumah23);

        startActivity( keRumahAdat);
    }
    public void  rumahAdat24 (View view){
        Intent  keRumahAdat = new Intent(activity_rumahAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_rumahKalsel);
        String asalAdat = getString(R.string.asal_rumahKalsel);
        String isiAdat = getString(R.string.isi_rumahKalsel);

        keRumahAdat.putExtra("judulAdats", judulAdat.toString());
        keRumahAdat.putExtra("asalAdats", asalAdat.toString());
        keRumahAdat.putExtra("isiAdats", isiAdat.toString());
        keRumahAdat.putExtra("gambarAdats", R.drawable.rumah24);

        startActivity( keRumahAdat);
    }
    public void  rumahAdat25 (View view){
        Intent  keRumahAdat = new Intent(activity_rumahAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_rumahGorontalo);
        String asalAdat = getString(R.string.asal_rumahGorontalo);
        String isiAdat = getString(R.string.isi_rumahGorontalo);

        keRumahAdat.putExtra("judulAdats", judulAdat.toString());
        keRumahAdat.putExtra("asalAdats", asalAdat.toString());
        keRumahAdat.putExtra("isiAdats", isiAdat.toString());
        keRumahAdat.putExtra("gambarAdats", R.drawable.rumah25);

        startActivity( keRumahAdat);
    }

    public void  rumahAdat26 (View view){
        Intent  keRumahAdat = new Intent(activity_rumahAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_rumahSulut);
        String asalAdat = getString(R.string.asal_rumahSulut);
        String isiAdat = getString(R.string.isi_rumahSulut);

        keRumahAdat.putExtra("judulAdats", judulAdat.toString());
        keRumahAdat.putExtra("asalAdats", asalAdat.toString());
        keRumahAdat.putExtra("isiAdats", isiAdat.toString());
        keRumahAdat.putExtra("gambarAdats", R.drawable.rumah26);

        startActivity( keRumahAdat);
    }
    public void  rumahAdat27 (View view){
        Intent  keRumahAdat = new Intent(activity_rumahAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_rumahSulbar);
        String asalAdat = getString(R.string.asal_rumahSulbar);
        String isiAdat = getString(R.string.isi_rumahSulbar);

        keRumahAdat.putExtra("judulAdats", judulAdat.toString());
        keRumahAdat.putExtra("asalAdats", asalAdat.toString());
        keRumahAdat.putExtra("isiAdats", isiAdat.toString());
        keRumahAdat.putExtra("gambarAdats", R.drawable.rumah27);

        startActivity( keRumahAdat);
    }
    public void  rumahAdat28 (View view){
        Intent  keRumahAdat = new Intent(activity_rumahAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_rumahSultengah);
        String asalAdat = getString(R.string.asal_rumahSultengah);
        String isiAdat = getString(R.string.isi_rumahSultengah);

        keRumahAdat.putExtra("judulAdats", judulAdat.toString());
        keRumahAdat.putExtra("asalAdats", asalAdat.toString());
        keRumahAdat.putExtra("isiAdats", isiAdat.toString());
        keRumahAdat.putExtra("gambarAdats", R.drawable.rumah28);

        startActivity( keRumahAdat);
    }
    public void  rumahAdat29 (View view){
        Intent  keRumahAdat = new Intent(activity_rumahAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_rumahSulteng);
        String asalAdat = getString(R.string.asal_rumahSulteng);
        String isiAdat = getString(R.string.isi_rumahSulteng);

        keRumahAdat.putExtra("judulAdats", judulAdat.toString());
        keRumahAdat.putExtra("asalAdats", asalAdat.toString());
        keRumahAdat.putExtra("isiAdats", isiAdat.toString());
        keRumahAdat.putExtra("gambarAdats", R.drawable.rumah29);

        startActivity( keRumahAdat);
    }

    public void  rumahAdat30 (View view){
        Intent  keRumahAdat = new Intent(activity_rumahAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_rumahSulsel);
        String asalAdat = getString(R.string.asal_rumahSulsel);
        String isiAdat = getString(R.string.isi_rumahSulsel);

        keRumahAdat.putExtra("judulAdats", judulAdat.toString());
        keRumahAdat.putExtra("asalAdats", asalAdat.toString());
        keRumahAdat.putExtra("isiAdats", isiAdat.toString());
        keRumahAdat.putExtra("gambarAdats", R.drawable.rumah30);

        startActivity( keRumahAdat);
    }

    public void  rumahAdat31 (View view){
        Intent  keRumahAdat = new Intent(activity_rumahAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_rumahMalut);
        String asalAdat = getString(R.string.asal_rumahMalut);
        String isiAdat = getString(R.string.isi_rumahMalut);

        keRumahAdat.putExtra("judulAdats", judulAdat.toString());
        keRumahAdat.putExtra("asalAdats", asalAdat.toString());
        keRumahAdat.putExtra("isiAdats", isiAdat.toString());
        keRumahAdat.putExtra("gambarAdats", R.drawable.rumah31);

        startActivity( keRumahAdat);
    }

    public void  rumahAdat32 (View view){
        Intent  keRumahAdat = new Intent(activity_rumahAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_rumahMaluku);
        String asalAdat = getString(R.string.asal_rumahMaluku);
        String isiAdat = getString(R.string.isi_rumahMaluku);

        keRumahAdat.putExtra("judulAdats", judulAdat.toString());
        keRumahAdat.putExtra("asalAdats", asalAdat.toString());
        keRumahAdat.putExtra("isiAdats", isiAdat.toString());
        keRumahAdat.putExtra("gambarAdats", R.drawable.rumah32);

        startActivity( keRumahAdat);
    }
    public void  rumahAdat33 (View view){
        Intent  keRumahAdat = new Intent(activity_rumahAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_rumahPapua);
        String asalAdat = getString(R.string.asal_rumahPapua);
        String isiAdat = getString(R.string.isi_rumahPapua);

        keRumahAdat.putExtra("judulAdats", judulAdat.toString());
        keRumahAdat.putExtra("asalAdats", asalAdat.toString());
        keRumahAdat.putExtra("isiAdats", isiAdat.toString());
        keRumahAdat.putExtra("gambarAdats", R.drawable.rumah33);

        startActivity( keRumahAdat);
    }

    public void  rumahAdat34 (View view){
        Intent  keRumahAdat = new Intent(activity_rumahAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_rumahPabar);
        String asalAdat = getString(R.string.asal_rumahPabar);
        String isiAdat = getString(R.string.isi_rumahPabar);

        keRumahAdat.putExtra("judulAdats", judulAdat.toString());
        keRumahAdat.putExtra("asalAdats", asalAdat.toString());
        keRumahAdat.putExtra("isiAdats", isiAdat.toString());
        keRumahAdat.putExtra("gambarAdats", R.drawable.rumah34);

        startActivity( keRumahAdat);
    }
}
