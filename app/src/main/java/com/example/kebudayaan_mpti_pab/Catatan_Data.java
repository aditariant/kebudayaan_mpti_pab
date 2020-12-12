package com.example.kebudayaan_mpti_pab;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class Catatan_Data extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catatan__data);

        countRecords();
        readRecords();
    }

    public void countRecords(){
        int recordCount = new TableControllerCatatan(this).count();

        TextView tvRecordCount = (TextView) findViewById(R.id.tvRecordCount);

        tvRecordCount.setText(recordCount + " data tersimpan");
        tvRecordCount.setTextSize(25);
        tvRecordCount.setTextColor(Color.parseColor("#FF000000"));
    }

    public void readRecords(){
        LinearLayout lnRecords = (LinearLayout) findViewById(R.id.lnRecords);

        lnRecords.removeAllViews();

        List<CatatanData> catatan = new TableControllerCatatan(this).read();

        if(catatan.size() > 0){
            for(CatatanData obj : catatan){
                int id = obj.id;
                String name = obj.name;
                String kategori = obj.kategori;
                String nilai = obj.nilai;
                String tvContents = "Nama = " + name + "  " +"Kategori = "+ kategori +"  "+"Nilai = "+ nilai ;

                TextView tvStudentItem = new TextView(this);
                tvStudentItem.setPadding(0,10,0,10);
                tvStudentItem.setTextSize(20);
                tvStudentItem.setTextColor(Color.parseColor("#FF000000"));
                tvStudentItem.setText(tvContents);
                tvStudentItem.setTag(Integer.toString(id));
                tvStudentItem.setOnLongClickListener(new OnLongClickListenerCatatanData());

                lnRecords.addView(tvStudentItem);
            }
        }else{
            TextView locationItem = new TextView(this);
            locationItem.setPadding(8,8,8,8);
            locationItem.setText("Belum ada data tersimpan");
            lnRecords.addView(locationItem);
        }
    }
}
