package com.alemanal.logwinder;

import com.alemanal.logwinder.TopMenu;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity{
    String actionActivity;
    @Override
    //union rama
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView btNav = findViewById(R.id.bottom_navigation);
        btNav.setSelectedItemId(R.id.home);
        TopMenu.navegacion(btNav, MainActivity.this);
    }
}