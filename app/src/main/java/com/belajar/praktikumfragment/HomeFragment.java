package com.belajar.praktikumfragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import androidx.fragment.app.Fragment;


public class HomeFragment extends Fragment implements View.OnClickListener {
    private TextView tvHasil;
    private EditText berat,tinggi;
    double bmi;
    public HomeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        Button hitung = v.findViewById(R.id.btHitung);
        Button clear = v.findViewById(R.id.btClear);
        tvHasil = v.findViewById(R.id.Hasil);
        berat = v.findViewById(R.id.tfBerat);
        tinggi = v.findViewById(R.id.tfTinggi);
        clear.setOnClickListener(this);
        hitung.setOnClickListener(this);
        return v;
    }
    @SuppressLint({"SetTextI18n", "NonConstantResourceId"})
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btHitung:
                if (berat.getText().toString().trim().equals("")){
                    berat.setError("Berat Badan Harus di Isi");
                }else if(tinggi.getText().toString().trim().equals("")){
                    tinggi.setError("Tinggi Badan Harus di Isi");
                }else{
                    double tile = Double.parseDouble(tinggi.getText().toString()) / 100;
                    bmi = Double.parseDouble(berat.getText().toString()) / Math.pow(tile, 2);
                    tvHasil.setText("BMI : "+bmi);
                }
                break;
            case R.id.btClear:
                berat.getText().clear();
                tinggi.getText().clear();
                tvHasil.setText("");
                break;
        }
    }

}