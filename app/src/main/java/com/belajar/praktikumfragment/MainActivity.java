package com.belajar.praktikumfragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,CallbackFragment{
    private Fragment home_fragment, news_fragment, setting_fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).hide();
        ImageButton home = findViewById(R.id.homeButton);
        ImageButton news = findViewById(R.id.newsButton);
        ImageButton setting = findViewById(R.id.settingButton);
        home_fragment = new HomeFragment();
        news_fragment = new NewsFragment();
        setting_fragment = new SettingFragment();
        changeFragment(home_fragment);
        home.setOnClickListener(this);
        news.setOnClickListener(this);
        setting.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.homeButton:
                changeFragment(home_fragment);
               break;
            case R.id.newsButton:
                changeFragment(news_fragment);
                break;
            case R.id.settingButton:
                changeFragment(setting_fragment);
                break;
        }
    }
    @Override
    public void changeFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_fragment, fragment);
        fragmentTransaction.commit();
    }

}