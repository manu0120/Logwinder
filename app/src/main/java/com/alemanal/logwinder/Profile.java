package com.alemanal.logwinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        BottomNavigationView btNav = findViewById(R.id.bottom_navigation);
        btNav.setSelectedItemId(R.id.profile);
        TopMenu.navegacion(btNav, Profile.this);
        ViewPager.data.get("cv1");
        ViewPager.data.get("cv2");
        ViewPager.data.get("cv3");
        ViewPager.data.get("cv4");
        ViewPager.data.get("cv5");
    }


}