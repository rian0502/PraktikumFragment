package com.belajar.praktikumfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class SettingFragment extends Fragment {

    private ListView listView;
    private View view;
    String[] setting = {
            "Akun",
            "Tema",
            "Suara",
            "Notifikasi",
    };
    public SettingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_setting, container, false);
        listView = view.findViewById(R.id.setting);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(view.getContext(), android.R.layout.simple_list_item_1, setting);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView< ? > adapterView, View view, int i, long l) {
                Toast.makeText(view.getContext(), "Anda Memilih "+setting[i], Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}