package com.example.kebudayaan_mpti_pab;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class OnLongClickListenerCatatanData implements View.OnLongClickListener {

    Context context;
    String id;

    @Override
    public boolean onLongClick(View v){
        context = v.getContext();
        id = v.getTag().toString();

        final CharSequence[] items = {"Edit", "Hapus"};

        new AlertDialog.Builder(context)
                .setTitle("Data Nilai")
                .setItems(items, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if(which == 0){
                            editRecord(Integer.parseInt(id));
                        }else if(which == 1){
                            boolean deleteSuccessful = new TableControllerCatatan(context).delete(Integer.parseInt(id));

                            if(deleteSuccessful){
                                Toast.makeText(context, "Data berhasil dihapus", Toast.LENGTH_SHORT).show();
                            }else{
                                Toast.makeText(context, "Tidak dapat menghapus data", Toast.LENGTH_SHORT).show();
                            }
                            ((Catatan_Data) context).countRecords();
                            ((Catatan_Data) context).readRecords();
                        }
                        dialog.dismiss();
                    }
                }).show();

        return false;
    }

    public void editRecord(final int catatanId) {
        final TableControllerCatatan tableControllerCatatan = new TableControllerCatatan(context);

        CatatanData catatanData = tableControllerCatatan.readSingleRecord(catatanId);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View formElementView = inflater.inflate(R.layout.data_input_form, null, false);

        final EditText edtName = (EditText) formElementView.findViewById(R.id.edtName);
        final EditText edtKategori = (EditText) formElementView.findViewById(R.id.edtKategori);
        final EditText edtNilai = (EditText) formElementView.findViewById(R.id.edtNilai);

        edtName.setText(catatanData.name);
        edtKategori.setText(catatanData.kategori);
        edtNilai.setText(catatanData.nilai);

        new AlertDialog.Builder(context)
                .setView(formElementView)
                .setTitle("Edit data")
                .setPositiveButton("Simpan",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                CatatanData catatanData = new CatatanData();

                                catatanData.id = catatanId;
                                catatanData.name = edtName.getText().toString();
                                catatanData.kategori = edtKategori.getText().toString();
                                catatanData.nilai = edtNilai.getText().toString();

                                boolean updateSuccessful = tableControllerCatatan.update(catatanData);
                                if(updateSuccessful){
                                    Toast.makeText(context, "Data berhasil diperbarui", Toast.LENGTH_SHORT).show();
                                }else{
                                    Toast.makeText(context, "Tidak dapat memperbarui data", Toast.LENGTH_SHORT).show();
                                }

                                ((Catatan_Data) context).countRecords();
                                ((Catatan_Data) context).readRecords();

                                dialog.cancel();
                            }
                        }).show();
    }


}
