package com.example.kebudayaan_mpti_pab;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class activity_tarianAdat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarian_adat);

        ImageView toolbarleftIcons = findViewById(R.id.leftIcon);
        toolbarleftIcons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    public void tarianAdatAceh(View view) {
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_tariAceh);
        String asalAdat = getString(R.string.asal_tariAceh);
        String isiAdat = getString(R.string.isi_tariAceh);

        keTarianAdat.putExtra("judulAdats", judulAdat.toString());
        keTarianAdat.putExtra("asalAdats", asalAdat.toString());
        keTarianAdat.putExtra("isiAdats", isiAdat.toString());
        keTarianAdat.putExtra("gambarAdats", R.drawable.tari1);

        startActivity(keTarianAdat);
    }
    public void tarianAdatSumUt(View view) {
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_tariSumUt);
        String asalAdat = getString(R.string.asal_tariSumUt);
        String isiAdat = getString(R.string.isi_tariSumUt);

        keTarianAdat.putExtra("judulAdats", judulAdat.toString());
        keTarianAdat.putExtra("asalAdats", asalAdat.toString());
        keTarianAdat.putExtra("isiAdats", isiAdat.toString());
        keTarianAdat.putExtra("gambarAdats", R.drawable.tari2);

        startActivity(keTarianAdat);
    }
    public void tarianAdatSumBar(View view) {
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_tariSumBar);
        String asalAdat = getString(R.string.asal_tariSumBar);
        String isiAdat = getString(R.string.isi_tariSumBar);

        keTarianAdat.putExtra("judulAdats", judulAdat.toString());
        keTarianAdat.putExtra("asalAdats", asalAdat.toString());
        keTarianAdat.putExtra("isiAdats", isiAdat.toString());
        keTarianAdat.putExtra("gambarAdats", R.drawable.tari3);

        startActivity(keTarianAdat);
    }
    public void tarianAdatRiau(View view) {
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_tariRiau);
        String asalAdat = getString(R.string.asal_tariRiau);
        String isiAdat = getString(R.string.isi_tariRiau);

        keTarianAdat.putExtra("judulAdats", judulAdat.toString());
        keTarianAdat.putExtra("asalAdats", asalAdat.toString());
        keTarianAdat.putExtra("isiAdats", isiAdat.toString());
        keTarianAdat.putExtra("gambarAdats", R.drawable.tari4);

        startActivity(keTarianAdat);
    }
    public void tarianAdatKepri(View view) {
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_tariKepRi);
        String asalAdat = getString(R.string.asal_tariKepRi);
        String isiAdat = getString(R.string.isi_tariKepRi);

        keTarianAdat.putExtra("judulAdats", judulAdat.toString());
        keTarianAdat.putExtra("asalAdats", asalAdat.toString());
        keTarianAdat.putExtra("isiAdats", isiAdat.toString());
        keTarianAdat.putExtra("gambarAdats", R.drawable.tari5);

        startActivity(keTarianAdat);
    }
    public void tarianAdatJambi(View view) {
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_tariJambi);
        String asalAdat = getString(R.string.asal_tariJambi);
        String isiAdat = getString(R.string.isi_tariJambi);

        keTarianAdat.putExtra("judulAdats", judulAdat.toString());
        keTarianAdat.putExtra("asalAdats", asalAdat.toString());
        keTarianAdat.putExtra("isiAdats", isiAdat.toString());
        keTarianAdat.putExtra("gambarAdats", R.drawable.tari6);

        startActivity(keTarianAdat);
    }
    public void tarianAdatBengkulu(View view) {
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_tariBengkulu);
        String asalAdat = getString(R.string.asal_tariBengkulu);
        String isiAdat = getString(R.string.isi_tariBengkulu);

        keTarianAdat.putExtra("judulAdats", judulAdat.toString());
        keTarianAdat.putExtra("asalAdats", asalAdat.toString());
        keTarianAdat.putExtra("isiAdats", isiAdat.toString());
        keTarianAdat.putExtra("gambarAdats", R.drawable.tari7);

        startActivity(keTarianAdat);
    }
    public void tarianAdatBaBel(View view) {
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_tariBaBel);
        String asalAdat = getString(R.string.asal_tariBaBel);
        String isiAdat = getString(R.string.isi_tariBaBel);

        keTarianAdat.putExtra("judulAdats", judulAdat.toString());
        keTarianAdat.putExtra("asalAdats", asalAdat.toString());
        keTarianAdat.putExtra("isiAdats", isiAdat.toString());
        keTarianAdat.putExtra("gambarAdats", R.drawable.tari8);

        startActivity(keTarianAdat);
    }
    public void tarianAdatSumSel(View view) {
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_tariSumSel);
        String asalAdat = getString(R.string.asal_tariSumSel);
        String isiAdat = getString(R.string.isi_tariSumSel);

        keTarianAdat.putExtra("judulAdats", judulAdat.toString());
        keTarianAdat.putExtra("asalAdats", asalAdat.toString());
        keTarianAdat.putExtra("isiAdats", isiAdat.toString());
        keTarianAdat.putExtra("gambarAdats", R.drawable.tari9);

        startActivity(keTarianAdat);
    }
    public void tarianAdatLampung(View view) {
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_tariLampung);
        String asalAdat = getString(R.string.asal_tariLampung);
        String isiAdat = getString(R.string.isi_tariLampung);

        keTarianAdat.putExtra("judulAdats", judulAdat.toString());
        keTarianAdat.putExtra("asalAdats", asalAdat.toString());
        keTarianAdat.putExtra("isiAdats", isiAdat.toString());
        keTarianAdat.putExtra("gambarAdats", R.drawable.tari10);

        startActivity(keTarianAdat);
    }
    public void tarianAdatBanten(View view) {
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_tariBanten);
        String asalAdat = getString(R.string.asal_tariBanten);
        String isiAdat = getString(R.string.isi_tariBanten);

        keTarianAdat.putExtra("judulAdats", judulAdat.toString());
        keTarianAdat.putExtra("asalAdats", asalAdat.toString());
        keTarianAdat.putExtra("isiAdats", isiAdat.toString());
        keTarianAdat.putExtra("gambarAdats", R.drawable.tari11);

        startActivity(keTarianAdat);
    }
    public void tarianAdatJabar(View view) {
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_tariJaBar);
        String asalAdat = getString(R.string.asal_tariJaBar);
        String isiAdat = getString(R.string.isi_tariJaBar);

        keTarianAdat.putExtra("judulAdats", judulAdat.toString());
        keTarianAdat.putExtra("asalAdats", asalAdat.toString());
        keTarianAdat.putExtra("isiAdats", isiAdat.toString());
        keTarianAdat.putExtra("gambarAdats", R.drawable.tari12);

        startActivity(keTarianAdat);
    }
    public void tarianAdatJakarta(View view) {
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_tariJakarta);
        String asalAdat = getString(R.string.asal_tariJakarta);
        String isiAdat = getString(R.string.isi_tariJakarta);

        keTarianAdat.putExtra("judulAdats", judulAdat.toString());
        keTarianAdat.putExtra("asalAdats", asalAdat.toString());
        keTarianAdat.putExtra("isiAdats", isiAdat.toString());
        keTarianAdat.putExtra("gambarAdats", R.drawable.tari13);

        startActivity(keTarianAdat);
    }
    public void tarianAdatJateng(View view) {
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_tariJaTeng);
        String asalAdat = getString(R.string.asal_tariJaTeng);
        String isiAdat = getString(R.string.isi_tariJaTeng);

        keTarianAdat.putExtra("judulAdats", judulAdat.toString());
        keTarianAdat.putExtra("asalAdats", asalAdat.toString());
        keTarianAdat.putExtra("isiAdats", isiAdat.toString());
        keTarianAdat.putExtra("gambarAdats", R.drawable.tari14);

        startActivity(keTarianAdat);
    }
    public void tarianAdatYogyakarta(View view) {
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_tariYogyakarta);
        String asalAdat = getString(R.string.asal_tariYogyakarta);
        String isiAdat = getString(R.string.isi_tariYogyakarta);

        keTarianAdat.putExtra("judulAdats", judulAdat.toString());
        keTarianAdat.putExtra("asalAdats", asalAdat.toString());
        keTarianAdat.putExtra("isiAdats", isiAdat.toString());
        keTarianAdat.putExtra("gambarAdats", R.drawable.tari15);

        startActivity(keTarianAdat);
    }
    public void tarianAdatJaTim(View view) {
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_tariJaTim);
        String asalAdat = getString(R.string.asal_tariJaTim);
        String isiAdat = getString(R.string.isi_tariJaTim);

        keTarianAdat.putExtra("judulAdats", judulAdat.toString());
        keTarianAdat.putExtra("asalAdats", asalAdat.toString());
        keTarianAdat.putExtra("isiAdats", isiAdat.toString());
        keTarianAdat.putExtra("gambarAdats", R.drawable.tari16);

        startActivity(keTarianAdat);
    }
    public void tarianAdatBali(View view) {
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_tariBali);
        String asalAdat = getString(R.string.asal_tariBali);
        String isiAdat = getString(R.string.isi_tariBali);

        keTarianAdat.putExtra("judulAdats", judulAdat.toString());
        keTarianAdat.putExtra("asalAdats", asalAdat.toString());
        keTarianAdat.putExtra("isiAdats", isiAdat.toString());
        keTarianAdat.putExtra("gambarAdats", R.drawable.tari17);

        startActivity(keTarianAdat);
    }
    public void tarianAdatNTT(View view) {
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_tariNTT);
        String asalAdat = getString(R.string.asal_tariNTT);
        String isiAdat = getString(R.string.isi_tariNTT);

        keTarianAdat.putExtra("judulAdats", judulAdat.toString());
        keTarianAdat.putExtra("asalAdats", asalAdat.toString());
        keTarianAdat.putExtra("isiAdats", isiAdat.toString());
        keTarianAdat.putExtra("gambarAdats", R.drawable.tari18);

        startActivity(keTarianAdat);
    }
    public void tarianAdatNTB(View view) {
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_tariNTB);
        String asalAdat = getString(R.string.asal_tariNTB);
        String isiAdat = getString(R.string.isi_tariNTB);

        keTarianAdat.putExtra("judulAdats", judulAdat.toString());
        keTarianAdat.putExtra("asalAdats", asalAdat.toString());
        keTarianAdat.putExtra("isiAdats", isiAdat.toString());
        keTarianAdat.putExtra("gambarAdats", R.drawable.tari19);

        startActivity(keTarianAdat);
    }
    public void tarianAdatKalUt(View view) {
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_tariKalUt);
        String asalAdat = getString(R.string.asal_tariKalUt);
        String isiAdat = getString(R.string.isi_tariKalUt);

        keTarianAdat.putExtra("judulAdats", judulAdat.toString());
        keTarianAdat.putExtra("asalAdats", asalAdat.toString());
        keTarianAdat.putExtra("isiAdats", isiAdat.toString());
        keTarianAdat.putExtra("gambarAdats", R.drawable.tari20);

        startActivity(keTarianAdat);
    }
    public void tarianAdatKalBar(View view) {
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_tariKalBar);
        String asalAdat = getString(R.string.asal_tariKalBar);
        String isiAdat = getString(R.string.isi_tariKalBar);

        keTarianAdat.putExtra("judulAdats", judulAdat.toString());
        keTarianAdat.putExtra("asalAdats", asalAdat.toString());
        keTarianAdat.putExtra("isiAdats", isiAdat.toString());
        keTarianAdat.putExtra("gambarAdats", R.drawable.tari21);

        startActivity(keTarianAdat);
    }
    public void tarianAdatKalTengah(View view) {
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_tariKalTengah);
        String asalAdat = getString(R.string.asal_tariKalTeng);
        String isiAdat = getString(R.string.isi_tariKalTengah);

        keTarianAdat.putExtra("judulAdats", judulAdat.toString());
        keTarianAdat.putExtra("asalAdats", asalAdat.toString());
        keTarianAdat.putExtra("isiAdats", isiAdat.toString());
        keTarianAdat.putExtra("gambarAdats", R.drawable.tari22);

        startActivity(keTarianAdat);
    }
    public void tarianAdatKalTim(View view) {
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_tariKalTim);
        String asalAdat = getString(R.string.asal_tariKalTim);
        String isiAdat = getString(R.string.isi_tariKalTim);

        keTarianAdat.putExtra("judulAdats", judulAdat.toString());
        keTarianAdat.putExtra("asalAdats", asalAdat.toString());
        keTarianAdat.putExtra("isiAdats", isiAdat.toString());
        keTarianAdat.putExtra("gambarAdats", R.drawable.tari23);

        startActivity(keTarianAdat);
    }
    public void tarianAdatKalSel(View view) {
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_tariKalSel);
        String asalAdat = getString(R.string.asal_tariKalSel);
        String isiAdat = getString(R.string.isi_tariKalSel);

        keTarianAdat.putExtra("judulAdats", judulAdat.toString());
        keTarianAdat.putExtra("asalAdats", asalAdat.toString());
        keTarianAdat.putExtra("isiAdats", isiAdat.toString());
        keTarianAdat.putExtra("gambarAdats", R.drawable.tari24);

        startActivity(keTarianAdat);
    }
    public void tarianAdatGorontalo(View view) {
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_tariGorontalo);
        String asalAdat = getString(R.string.asal_tariGorontalo);
        String isiAdat = getString(R.string.isi_tariGorontalo);

        keTarianAdat.putExtra("judulAdats", judulAdat.toString());
        keTarianAdat.putExtra("asalAdats", asalAdat.toString());
        keTarianAdat.putExtra("isiAdats", isiAdat.toString());
        keTarianAdat.putExtra("gambarAdats", R.drawable.tari25);

        startActivity(keTarianAdat);
    }
    public void tarianAdatSulUt(View view) {
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_tariSulUt);
        String asalAdat = getString(R.string.asal_tariSulUt);
        String isiAdat = getString(R.string.isi_tariSulUt);

        keTarianAdat.putExtra("judulAdats", judulAdat.toString());
        keTarianAdat.putExtra("asalAdats", asalAdat.toString());
        keTarianAdat.putExtra("isiAdats", isiAdat.toString());
        keTarianAdat.putExtra("gambarAdats", R.drawable.tari26);

        startActivity(keTarianAdat);
    }
    public void tarianAdatSulBar(View view) {
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_tariSulBar);
        String asalAdat = getString(R.string.asal_tariSulBar);
        String isiAdat = getString(R.string.isi_tariSulBar);

        keTarianAdat.putExtra("judulAdats", judulAdat.toString());
        keTarianAdat.putExtra("asalAdats", asalAdat.toString());
        keTarianAdat.putExtra("isiAdats", isiAdat.toString());
        keTarianAdat.putExtra("gambarAdats", R.drawable.tari27);

        startActivity(keTarianAdat);
    }
    public void tarianAdatSulTengah(View view) {
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_tariSulTengah);
        String asalAdat = getString(R.string.asal_tariSulTengah);
        String isiAdat = getString(R.string.isi_tariSulTengah);

        keTarianAdat.putExtra("judulAdats", judulAdat.toString());
        keTarianAdat.putExtra("asalAdats", asalAdat.toString());
        keTarianAdat.putExtra("isiAdats", isiAdat.toString());
        keTarianAdat.putExtra("gambarAdats", R.drawable.tari28);

        startActivity(keTarianAdat);
    }
    public void tarianAdatSulTeng(View view) {
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_tariSulTeng);
        String asalAdat = getString(R.string.asal_tariSulTeng);
        String isiAdat = getString(R.string.isi_tariSulTeng);

        keTarianAdat.putExtra("judulAdats", judulAdat.toString());
        keTarianAdat.putExtra("asalAdats", asalAdat.toString());
        keTarianAdat.putExtra("isiAdats", isiAdat.toString());
        keTarianAdat.putExtra("gambarAdats", R.drawable.tari29);

        startActivity(keTarianAdat);
    }
    public void tarianAdatSulSel(View view) {
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_tariSulSel);
        String asalAdat = getString(R.string.asal_tariSulSel);
        String isiAdat = getString(R.string.isi_tariSulSel);

        keTarianAdat.putExtra("judulAdats", judulAdat.toString());
        keTarianAdat.putExtra("asalAdats", asalAdat.toString());
        keTarianAdat.putExtra("isiAdats", isiAdat.toString());
        keTarianAdat.putExtra("gambarAdats", R.drawable.tari30);

        startActivity(keTarianAdat);
    }
    public void tarianAdatMalukuUtara(View view) {
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_tariMalukuUtara);
        String asalAdat = getString(R.string.asal_tariMalukuUtara);
        String isiAdat = getString(R.string.isi_tariMalukuUtara);

        keTarianAdat.putExtra("judulAdats", judulAdat.toString());
        keTarianAdat.putExtra("asalAdats", asalAdat.toString());
        keTarianAdat.putExtra("isiAdats", isiAdat.toString());
        keTarianAdat.putExtra("gambarAdats", R.drawable.tari31);

        startActivity(keTarianAdat);
    }
    public void tarianAdatMaluku(View view) {
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_tariMaluku);
        String asalAdat = getString(R.string.asal_tariMaluku);
        String isiAdat = getString(R.string.isi_tariMaluku);

        keTarianAdat.putExtra("judulAdats", judulAdat.toString());
        keTarianAdat.putExtra("asalAdats", asalAdat.toString());
        keTarianAdat.putExtra("isiAdats", isiAdat.toString());
        keTarianAdat.putExtra("gambarAdats", R.drawable.tari32);

        startActivity(keTarianAdat);
    }
    public void tarianAdatPapua(View view) {
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_tariPapua);
        String asalAdat = getString(R.string.asal_tariPapua);
        String isiAdat = getString(R.string.isi_tariPapua);

        keTarianAdat.putExtra("judulAdats", judulAdat.toString());
        keTarianAdat.putExtra("asalAdats", asalAdat.toString());
        keTarianAdat.putExtra("isiAdats", isiAdat.toString());
        keTarianAdat.putExtra("gambarAdats", R.drawable.tari33);

        startActivity(keTarianAdat);
    }
    public void tarianAdatPapuaBarat(View view) {
        Intent keTarianAdat = new Intent(activity_tarianAdat.this, activity_deskripsiBudaya.class);

        String judulAdat = getString(R.string.judul_tariPapuaBarat);
        String asalAdat = getString(R.string.asal_tariPapuaBarat);
        String isiAdat = getString(R.string.isi_tariPapuaBarat);

        keTarianAdat.putExtra("judulAdats", judulAdat.toString());
        keTarianAdat.putExtra("asalAdats", asalAdat.toString());
        keTarianAdat.putExtra("isiAdats", isiAdat.toString());
        keTarianAdat.putExtra("gambarAdats", R.drawable.tari34);

        startActivity(keTarianAdat);
    }
}
