package com.example.kebudayaan_mpti_pab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    private Object view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
    //public void menu(View view) {
       //Log.d(LOG_TAG, "button clicked");
        //Intent intent = new Intent(this,MainActivity.class);
        //startActivity(intent);
