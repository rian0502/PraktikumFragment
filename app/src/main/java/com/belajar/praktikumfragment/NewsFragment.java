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


public class NewsFragment extends Fragment{
    private View view;
    private ListView listView;
    private String[] judul = {
            "Kebakaran di Konoha",
            "Harga Krypto Naik",
            "Minyak Goreng Turun",
            "Ending One Piece 3 Tahun",
            "Harga Buronan Luffy Naik",
            "CP-0 Kesulitan menghadapi perinta gorosai",
            "Kepala Kades Konoha Liburan Ke bali",
            "Pengguna Android semakin Meningkat",
            "Kebakaran di Konoha",
            "Harga Krypto Naik",
            "Minyak Goreng Turun",
            "Ending One Piece 3 Tahun",
            "Harga Buronan Luffy Naik",
            "CP-0 Kesulitan menghadapi perinta gorosai",
            "Kepala Kades Konoha Liburan Ke bali",
            "Pengguna Android semakin Meningkat",
            "Kebakaran di Konoha",
            "Harga Krypto Naik",
            "Minyak Goreng Turun",
            "Ending One Piece 3 Tahun",
            "Harga Buronan Luffy Naik",
            "CP-0 Kesulitan menghadapi perinta gorosai",
            "Kepala Kades Konoha Liburan Ke bali",
            "Pengguna Android semakin Meningkat",
    };
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view =  inflater.inflate(R.layout.fragment_news, container, false);
        listView = view.findViewById(R.id.berita);
        ArrayAdapter< String > adapter = new ArrayAdapter<>(view.getContext(), android.R.layout.simple_list_item_1, judul);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView< ? > adapterView, View view, int i, long l) {
                Toast.makeText(view.getContext(), "Anda Memilih "+judul[i], Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }

}