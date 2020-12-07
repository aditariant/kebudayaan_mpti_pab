package com.example.kebudayaan_mpti_pab;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class TableControllerCatatan extends QuizDbHelper {
    public TableControllerCatatan(Context context) { super(context); }

    public boolean create(CatatanData catatanData){
        ContentValues values = new ContentValues();
        values.put("name", catatanData.name);
        values.put("kategori", catatanData.kategori);
        values.put("nilai", catatanData.nilai);

        SQLiteDatabase db = this.getWritableDatabase();

        boolean createSuccessful = db.insert("students", null, values) > 0;
        db.close();

        return createSuccessful;
    }

    public int count() {
        SQLiteDatabase db = this.getWritableDatabase();

        String sql = "SELECT * FROM students";
        int recordCount = db.rawQuery(sql, null).getCount();
        db.close();

        return recordCount;
    }

    public List<CatatanData> read(){
        List<CatatanData> recordsList = new ArrayList<CatatanData>();

        String sql = "SELECT * FROM students ORDER BY id DESC";

        SQLiteDatabase db = this.getWritableDatabase();

        Cursor cursor = db.rawQuery(sql, null);

        if(cursor.moveToFirst()){
            do{
                int id = Integer.parseInt(cursor.getString(cursor.getColumnIndex("id")));

                String studentName = cursor.getString(cursor.getColumnIndex("name"));
                String studentKategori = cursor.getString(cursor.getColumnIndex("kategori"));
                String studentNilai = cursor.getString(cursor.getColumnIndex("nilai"));

                CatatanData catatanData = new CatatanData();

                catatanData.id = id;
                catatanData.name=studentName;
                catatanData.kategori=studentKategori;
                catatanData.nilai=studentNilai;

                recordsList.add(catatanData);
            }while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return recordsList;
    }

    public CatatanData readSingleRecord(int catatanId){
        CatatanData catatanData = null;



        String sql = "SELECT * FROM students WHERE id = " + catatanId;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(sql, null);

        if(cursor.moveToFirst()){
            int id = Integer.parseInt(cursor.getString(cursor.getColumnIndex("id")));
            String name = cursor.getString(cursor.getColumnIndex("name"));
            String kategori = cursor.getString(cursor.getColumnIndex("kategori"));
            String nilai = cursor.getString(cursor.getColumnIndex("nilai"));

            catatanData = new CatatanData();
            catatanData.id = id;
            catatanData.name = name;
            catatanData.kategori = kategori;
            catatanData.nilai = nilai;

        }
        cursor.close();
        db.close();

        return catatanData;
    }

    public boolean update(CatatanData catatanData){
        ContentValues values = new ContentValues();

        values.put("name",catatanData.name);
        values.put("kategori", catatanData.kategori);
        values.put("nilai", catatanData.nilai);

        String where = "id = ?";
        String[] whereArgs = {Integer.toString(catatanData.id)};

        SQLiteDatabase db = this.getWritableDatabase();
        boolean updateSuccessful = db.update("students", values, where, whereArgs) > 0;

        db.close();
        return updateSuccessful;
    }

    public boolean delete(int id){
        boolean deleteSuccessful = false;

        SQLiteDatabase db = this.getWritableDatabase();
        deleteSuccessful = db.delete("students", "id ='" + id + "'", null) > 0;
        db.close();

        return deleteSuccessful;
    }

}

