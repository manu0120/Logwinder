package com.alemanal.logwinder;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.navigation.NavigationBarView;

public class TopMenu {
    public static void navegacion(NavigationBarView btNav, Context cont){

        btNav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                Intent in;
                switch (id){
                    case R.id.home:
                        item.setChecked(true);
                        in = new Intent(cont,MainActivity.class);
                        in.
                        cont.startActivity(in);
                        break;
                    case R.id.tips:
                        item.setChecked(true);
                        break;
                    case R.id.profile:
                        item.setChecked(true);
                        in = new Intent(cont,Profile.class);
                        cont.startActivity(in);
                        break;
                    case R.id.settings:
                        item.setChecked(true);
                        in = new Intent(cont,Profile.class);
                        cont.startActivity(in);
                        break;
                }
                return false;
            }
        });
    }
}
