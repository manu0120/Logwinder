package com.alemanal.logwinder;

import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.alemanal.logwinder.Utilidades.Utilidades;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SplashActivity extends AppCompatActivity {
    ImageView logo_splash,logo_thunder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //SIRVE PARA HACER LA TRANSICION ENTRE EL SPLASH Y EL ACTIVITY DE NAVIGATION
        openNavigation(true);
        //ANIMACION LOGO
        logo_splash = (ImageView) findViewById(R.id.giro);
        Animation splash = AnimationUtils.loadAnimation(this,R.anim.splash_anim);
        logo_thunder = (ImageView) findViewById(R.id.rayo);
        Animation thunder = AnimationUtils.loadAnimation(this,R.anim.thunder_anim);
        logo_splash.startAnimation(splash);
        logo_thunder.startAnimation(thunder);
    }
    //SIRVE PARA HACER LA TRANSICION ENTRE EL SPLASH Y EL ACTIVITY DE NAVIGATION
    public void openNavigation(boolean locationPermission){
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
//                try {
//                    SQLite sq = new SQLite(getApplicationContext(), Utilidades.TABLA_FRIGORIFICO, null, 1);
//                    SQLiteDatabase db = sq.getReadableDatabase();
//                    Cursor cursor = db.rawQuery("SELECT * FROM " + Utilidades.TABLA_FRIGORIFICO, null);
//                    if(cursor.moveToFirst())
//                        if(!cursor.isNull(0)) {
//                            String s = cursor.getString(1);
//                            String s1 = cursor.getString(2);
//                        }
//                    System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
//                    Intent intent = new Intent(SplashActivity.this, ViewPagerMain.class);
//                    startActivity(intent);
//                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
//                } catch (IndexOutOfBoundsException e){
                    Intent intent = new Intent(SplashActivity.this, ViewPager.class);
                    startActivity(intent);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
//                }catch (NullPointerException e){
//                    System.out.println("ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
//                    Intent intent = new Intent(SplashActivity.this, ViewPager.class);
//                    startActivity(intent);
//                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
//                }
            }
        }, 4000);
    }
}
