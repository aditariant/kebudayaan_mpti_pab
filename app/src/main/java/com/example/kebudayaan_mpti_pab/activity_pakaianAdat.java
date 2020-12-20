package com.example.kebudayaan_mpti_pab;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class activity_pakaianAdat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pakaian_adat);

        ImageView toolbarleftIcons = findViewById(R.id.leftIcon);
        toolbarleftIcons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
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

        String judulAdat = getString(R.string.judul_pakaianRiau);
        String asalAdat = getString(R.string.asal_pakaianRiau);
        String isiAdat = getString(R.string.isi_pakaianRiau);

        keBajuAdat.putExtra("judulAdats", judulAdat.toString());
        keBajuAdat.putExtra("asalAdats", asalAdat.toString());
        keBajuAdat.putExtra("isiAdats", isiAdat.toString());
        keBajuAdat.putExtra("gambarAdats", R.drawable.baju4);

        startActivity(keBajuAdat);
    }
    public void bajuAdat5 (View view){
        Intent keBajuAdat = new Intent(activity_pakaianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_pakaianKepri);
        String asalAdat = getString(R.string.asal_pakaianKepri);
        String isiAdat = getString(R.string.isi_pakaianKepri);

        keBajuAdat.putExtra("judulAdats", judulAdat.toString());
        keBajuAdat.putExtra("asalAdats", asalAdat.toString());
        keBajuAdat.putExtra("isiAdats", isiAdat.toString());
        keBajuAdat.putExtra("gambarAdats", R.drawable.baju5);

        startActivity(keBajuAdat);
    }
    public void bajuAdat6 (View view){
        Intent keBajuAdat = new Intent(activity_pakaianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_pakaianJambi);
        String asalAdat = getString(R.string.asal_pakaianJambi);
        String isiAdat = getString(R.string.isi_pakaianJambi);

        keBajuAdat.putExtra("judulAdats", judulAdat.toString());
        keBajuAdat.putExtra("asalAdats", asalAdat.toString());
        keBajuAdat.putExtra("isiAdats", isiAdat.toString());
        keBajuAdat.putExtra("gambarAdats", R.drawable.baju6);

        startActivity(keBajuAdat);
    }
    public void bajuAdat7 (View view){
        Intent keBajuAdat = new Intent(activity_pakaianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_pakaianBengkulu);
        String asalAdat = getString(R.string.asal_pakaianBengkulu);
        String isiAdat = getString(R.string.isi_pakaianBengkulu);

        keBajuAdat.putExtra("judulAdats", judulAdat.toString());
        keBajuAdat.putExtra("asalAdats", asalAdat.toString());
        keBajuAdat.putExtra("isiAdats", isiAdat.toString());
        keBajuAdat.putExtra("gambarAdats", R.drawable.baju7);

        startActivity(keBajuAdat);
    }
    public void bajuAdat8 (View view){
        Intent keBajuAdat = new Intent(activity_pakaianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_pakaianBangka);
        String asalAdat = getString(R.string.asal_pakaianBangka);
        String isiAdat = getString(R.string.isi_pakaianBangka);

        keBajuAdat.putExtra("judulAdats", judulAdat.toString());
        keBajuAdat.putExtra("asalAdats", asalAdat.toString());
        keBajuAdat.putExtra("isiAdats", isiAdat.toString());
        keBajuAdat.putExtra("gambarAdats", R.drawable.baju8);

        startActivity(keBajuAdat);
    }
    public void bajuAdat9 (View view){
        Intent keBajuAdat = new Intent(activity_pakaianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_pakaianSumsel);
        String asalAdat = getString(R.string.asal_pakaianSumsel);
        String isiAdat = getString(R.string.isi_pakaianSumsel);

        keBajuAdat.putExtra("judulAdats", judulAdat.toString());
        keBajuAdat.putExtra("asalAdats", asalAdat.toString());
        keBajuAdat.putExtra("isiAdats", isiAdat.toString());
        keBajuAdat.putExtra("gambarAdats", R.drawable.baju9);

        startActivity(keBajuAdat);
    }
    public void bajuAdat10 (View view){
        Intent keBajuAdat = new Intent(activity_pakaianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_pakaianLampung);
        String asalAdat = getString(R.string.asal_pakaianLampung);
        String isiAdat = getString(R.string.isi_pakaianLampung);

        keBajuAdat.putExtra("judulAdats", judulAdat.toString());
        keBajuAdat.putExtra("asalAdats", asalAdat.toString());
        keBajuAdat.putExtra("isiAdats", isiAdat.toString());
        keBajuAdat.putExtra("gambarAdats", R.drawable.baju10);

        startActivity(keBajuAdat);
    }
    public void bajuAdat11 (View view){
        Intent keBajuAdat = new Intent(activity_pakaianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_pakaianBanten);
        String asalAdat = getString(R.string.asal_pakaianBanten);
        String isiAdat = getString(R.string.isi_pakaianBanten);

        keBajuAdat.putExtra("judulAdats", judulAdat.toString());
        keBajuAdat.putExtra("asalAdats", asalAdat.toString());
        keBajuAdat.putExtra("isiAdats", isiAdat.toString());
        keBajuAdat.putExtra("gambarAdats", R.drawable.baju11);

        startActivity(keBajuAdat);
    }
    public void bajuAdat12 (View view){
        Intent keBajuAdat = new Intent(activity_pakaianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_pakaianJabar);
        String asalAdat = getString(R.string.asal_pakaianJabar);
        String isiAdat = getString(R.string.isi_pakaianJabar);

        keBajuAdat.putExtra("judulAdats", judulAdat.toString());
        keBajuAdat.putExtra("asalAdats", asalAdat.toString());
        keBajuAdat.putExtra("isiAdats", isiAdat.toString());
        keBajuAdat.putExtra("gambarAdats", R.drawable.baju12);

        startActivity(keBajuAdat);
    }
    public void bajuAdat13 (View view){
        Intent keBajuAdat = new Intent(activity_pakaianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_pakaianJkt);
        String asalAdat = getString(R.string.asal_pakaianJkt);
        String isiAdat = getString(R.string.isi_pakaianJkt);

        keBajuAdat.putExtra("judulAdats", judulAdat.toString());
        keBajuAdat.putExtra("asalAdats", asalAdat.toString());
        keBajuAdat.putExtra("isiAdats", isiAdat.toString());
        keBajuAdat.putExtra("gambarAdats", R.drawable.baju13);

        startActivity(keBajuAdat);
    }
    public void bajuAdat14 (View view){
        Intent keBajuAdat = new Intent(activity_pakaianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_pakaianJateng);
        String asalAdat = getString(R.string.asal_pakaianJateng);
        String isiAdat = getString(R.string.isi_pakaianJateng);

        keBajuAdat.putExtra("judulAdats", judulAdat.toString());
        keBajuAdat.putExtra("asalAdats", asalAdat.toString());
        keBajuAdat.putExtra("isiAdats", isiAdat.toString());
        keBajuAdat.putExtra("gambarAdats", R.drawable.baju14);

        startActivity(keBajuAdat);
    }
    public void bajuAdat15 (View view){
        Intent keBajuAdat = new Intent(activity_pakaianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_pakaianJogja);
        String asalAdat = getString(R.string.asal_pakaianJogja);
        String isiAdat = getString(R.string.isi_pakaianJogja);

        keBajuAdat.putExtra("judulAdats", judulAdat.toString());
        keBajuAdat.putExtra("asalAdats", asalAdat.toString());
        keBajuAdat.putExtra("isiAdats", isiAdat.toString());
        keBajuAdat.putExtra("gambarAdats", R.drawable.baju15);

        startActivity(keBajuAdat);
    }
    public void bajuAdat16 (View view){
        Intent keBajuAdat = new Intent(activity_pakaianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_pakaianJatim);
        String asalAdat = getString(R.string.asal_pakaianJatim);
        String isiAdat = getString(R.string.isi_pakaianJatim);

        keBajuAdat.putExtra("judulAdats", judulAdat.toString());
        keBajuAdat.putExtra("asalAdats", asalAdat.toString());
        keBajuAdat.putExtra("isiAdats", isiAdat.toString());
        keBajuAdat.putExtra("gambarAdats", R.drawable.baju16);

        startActivity(keBajuAdat);
    }
    public void bajuAdat17 (View view){
        Intent keBajuAdat = new Intent(activity_pakaianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_pakaianBali);
        String asalAdat = getString(R.string.asal_pakaianBali);
        String isiAdat = getString(R.string.isi_pakaianBali);

        keBajuAdat.putExtra("judulAdats", judulAdat.toString());
        keBajuAdat.putExtra("asalAdats", asalAdat.toString());
        keBajuAdat.putExtra("isiAdats", isiAdat.toString());
        keBajuAdat.putExtra("gambarAdats", R.drawable.baju17);

        startActivity(keBajuAdat);
    }
    public void bajuAdat18 (View view){
        Intent keBajuAdat = new Intent(activity_pakaianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_pakaianNTB);
        String asalAdat = getString(R.string.asal_pakaianNTB);
        String isiAdat = getString(R.string.isi_pakaianNTB);

        keBajuAdat.putExtra("judulAdats", judulAdat.toString());
        keBajuAdat.putExtra("asalAdats", asalAdat.toString());
        keBajuAdat.putExtra("isiAdats", isiAdat.toString());
        keBajuAdat.putExtra("gambarAdats", R.drawable.baju18);

        startActivity(keBajuAdat);
    }
    public void bajuAdat19 (View view){
        Intent keBajuAdat = new Intent(activity_pakaianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_pakaianNTT);
        String asalAdat = getString(R.string.asal_pakaianNTT);
        String isiAdat = getString(R.string.isi_pakaianNTT);

        keBajuAdat.putExtra("judulAdats", judulAdat.toString());
        keBajuAdat.putExtra("asalAdats", asalAdat.toString());
        keBajuAdat.putExtra("isiAdats", isiAdat.toString());
        keBajuAdat.putExtra("gambarAdats", R.drawable.baju19);

        startActivity(keBajuAdat);
    }
    public void bajuAdat20 (View view){
        Intent keBajuAdat = new Intent(activity_pakaianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_pakaianKalut);
        String asalAdat = getString(R.string.asal_pakaianKalut);
        String isiAdat = getString(R.string.isi_pakaianKalut);

        keBajuAdat.putExtra("judulAdats", judulAdat.toString());
        keBajuAdat.putExtra("asalAdats", asalAdat.toString());
        keBajuAdat.putExtra("isiAdats", isiAdat.toString());
        keBajuAdat.putExtra("gambarAdats", R.drawable.baju20);

        startActivity(keBajuAdat);
    }
    public void bajuAdat21 (View view){
        Intent keBajuAdat = new Intent(activity_pakaianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_pakaianKalbar);
        String asalAdat = getString(R.string.asal_pakaianKalbar);
        String isiAdat = getString(R.string.isi_pakaianKalbar);

        keBajuAdat.putExtra("judulAdats", judulAdat.toString());
        keBajuAdat.putExtra("asalAdats", asalAdat.toString());
        keBajuAdat.putExtra("isiAdats", isiAdat.toString());
        keBajuAdat.putExtra("gambarAdats", R.drawable.baju21);

        startActivity(keBajuAdat);
    }
    public void bajuAdat22 (View view){
        Intent keBajuAdat = new Intent(activity_pakaianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_pakaianKalteng);
        String asalAdat = getString(R.string.asal_pakaianKalteng);
        String isiAdat = getString(R.string.isi_pakaianKalteng);

        keBajuAdat.putExtra("judulAdats", judulAdat.toString());
        keBajuAdat.putExtra("asalAdats", asalAdat.toString());
        keBajuAdat.putExtra("isiAdats", isiAdat.toString());
        keBajuAdat.putExtra("gambarAdats", R.drawable.baju22);

        startActivity(keBajuAdat);
    }
    public void bajuAdat23 (View view){
        Intent keBajuAdat = new Intent(activity_pakaianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_pakaianKaltim);
        String asalAdat = getString(R.string.asal_pakaianKaltim);
        String isiAdat = getString(R.string.isi_pakaianKaltim);

        keBajuAdat.putExtra("judulAdats", judulAdat.toString());
        keBajuAdat.putExtra("asalAdats", asalAdat.toString());
        keBajuAdat.putExtra("isiAdats", isiAdat.toString());
        keBajuAdat.putExtra("gambarAdats", R.drawable.baju23);

        startActivity(keBajuAdat);
    }
    public void bajuAdat24 (View view){
        Intent keBajuAdat = new Intent(activity_pakaianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_pakaianKalsel);
        String asalAdat = getString(R.string.asal_pakaianKalsel);
        String isiAdat = getString(R.string.isi_pakaianKalsel);

        keBajuAdat.putExtra("judulAdats", judulAdat.toString());
        keBajuAdat.putExtra("asalAdats", asalAdat.toString());
        keBajuAdat.putExtra("isiAdats", isiAdat.toString());
        keBajuAdat.putExtra("gambarAdats", R.drawable.baju24);

        startActivity(keBajuAdat);
    }
    public void bajuAdat25 (View view){
        Intent keBajuAdat = new Intent(activity_pakaianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_pakaianGorontalo);
        String asalAdat = getString(R.string.asal_pakaianGorontalo);
        String isiAdat = getString(R.string.isi_pakaianGorontalo);

        keBajuAdat.putExtra("judulAdats", judulAdat.toString());
        keBajuAdat.putExtra("asalAdats", asalAdat.toString());
        keBajuAdat.putExtra("isiAdats", isiAdat.toString());
        keBajuAdat.putExtra("gambarAdats", R.drawable.baju25);

        startActivity(keBajuAdat);
    }
    public void bajuAdat26 (View view){
        Intent keBajuAdat = new Intent(activity_pakaianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_pakaianSulut);
        String asalAdat = getString(R.string.asal_pakaianSulut);
        String isiAdat = getString(R.string.isi_pakaianSulut);

        keBajuAdat.putExtra("judulAdats", judulAdat.toString());
        keBajuAdat.putExtra("asalAdats", asalAdat.toString());
        keBajuAdat.putExtra("isiAdats", isiAdat.toString());
        keBajuAdat.putExtra("gambarAdats", R.drawable.baju26);

        startActivity(keBajuAdat);
    }
    public void bajuAdat27 (View view){
        Intent keBajuAdat = new Intent(activity_pakaianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_pakaianSulbar);
        String asalAdat = getString(R.string.asal_pakaianSulbar);
        String isiAdat = getString(R.string.isi_pakaianSulbar);

        keBajuAdat.putExtra("judulAdats", judulAdat.toString());
        keBajuAdat.putExtra("asalAdats", asalAdat.toString());
        keBajuAdat.putExtra("isiAdats", isiAdat.toString());
        keBajuAdat.putExtra("gambarAdats", R.drawable.baju27);

        startActivity(keBajuAdat);
    }
    public void bajuAdat28 (View view){
        Intent keBajuAdat = new Intent(activity_pakaianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_pakaianSultengah);
        String asalAdat = getString(R.string.asal_pakaianSultengah);
        String isiAdat = getString(R.string.isi_pakaianSultengah);

        keBajuAdat.putExtra("judulAdats", judulAdat.toString());
        keBajuAdat.putExtra("asalAdats", asalAdat.toString());
        keBajuAdat.putExtra("isiAdats", isiAdat.toString());
        keBajuAdat.putExtra("gambarAdats", R.drawable.baju28);

        startActivity(keBajuAdat);
    }
    public void bajuAdat29 (View view){
        Intent keBajuAdat = new Intent(activity_pakaianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_pakaianSulteng);
        String asalAdat = getString(R.string.asal_pakaianSulteng);
        String isiAdat = getString(R.string.isi_pakaianSulteng);

        keBajuAdat.putExtra("judulAdats", judulAdat.toString());
        keBajuAdat.putExtra("asalAdats", asalAdat.toString());
        keBajuAdat.putExtra("isiAdats", isiAdat.toString());
        keBajuAdat.putExtra("gambarAdats", R.drawable.baju29);

        startActivity(keBajuAdat);
    }
    public void bajuAdat30 (View view){
        Intent keBajuAdat = new Intent(activity_pakaianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_pakaianSulsel);
        String asalAdat = getString(R.string.asal_pakaianSulsel);
        String isiAdat = getString(R.string.isi_pakaianSulsel);

        keBajuAdat.putExtra("judulAdats", judulAdat.toString());
        keBajuAdat.putExtra("asalAdats", asalAdat.toString());
        keBajuAdat.putExtra("isiAdats", isiAdat.toString());
        keBajuAdat.putExtra("gambarAdats", R.drawable.baju30);

        startActivity(keBajuAdat);
    }
    public void bajuAdat31 (View view){
        Intent keBajuAdat = new Intent(activity_pakaianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_pakaianMalut);
        String asalAdat = getString(R.string.asal_pakaianMalut);
        String isiAdat = getString(R.string.isi_pakaianMalut);

        keBajuAdat.putExtra("judulAdats", judulAdat.toString());
        keBajuAdat.putExtra("asalAdats", asalAdat.toString());
        keBajuAdat.putExtra("isiAdats", isiAdat.toString());
        keBajuAdat.putExtra("gambarAdats", R.drawable.baju31);

        startActivity(keBajuAdat);
    }
    public void bajuAdat32 (View view){
        Intent keBajuAdat = new Intent(activity_pakaianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_pakaianMaluku);
        String asalAdat = getString(R.string.asal_pakaianMaluku);
        String isiAdat = getString(R.string.isi_pakaianMaluku);

        keBajuAdat.putExtra("judulAdats", judulAdat.toString());
        keBajuAdat.putExtra("asalAdats", asalAdat.toString());
        keBajuAdat.putExtra("isiAdats", isiAdat.toString());
        keBajuAdat.putExtra("gambarAdats", R.drawable.baju32);

        startActivity(keBajuAdat);
    }
    public void bajuAdat33 (View view){
        Intent keBajuAdat = new Intent(activity_pakaianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_pakaianPapua);
        String asalAdat = getString(R.string.asal_pakaianPapua);
        String isiAdat = getString(R.string.isi_pakaianPapua);

        keBajuAdat.putExtra("judulAdats", judulAdat.toString());
        keBajuAdat.putExtra("asalAdats", asalAdat.toString());
        keBajuAdat.putExtra("isiAdats", isiAdat.toString());
        keBajuAdat.putExtra("gambarAdats", R.drawable.baju33);

        startActivity(keBajuAdat);
    }
    public void bajuAdat34 (View view){
        Intent keBajuAdat = new Intent(activity_pakaianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_pakaianPabar);
        String asalAdat = getString(R.string.asal_pakaianPabar);
        String isiAdat = getString(R.string.isi_pakaianPabar);

        keBajuAdat.putExtra("judulAdats", judulAdat.toString());
        keBajuAdat.putExtra("asalAdats", asalAdat.toString());
        keBajuAdat.putExtra("isiAdats", isiAdat.toString());
        keBajuAdat.putExtra("gambarAdats", R.drawable.baju34);

        startActivity(keBajuAdat);
    }
}
