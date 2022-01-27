package com.alemanal.logwinder;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    ImageView logo_splash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //SIRVE PARA HACER LA TRANSICION ENTRE EL SPLASH Y EL ACTIVITY DE NAVIGATION
        openNavigation(true);
        //ANIMACION LOGO
        logo_splash = (ImageView) findViewById(R.id.ic_splash);
        Animation splash = AnimationUtils.loadAnimation(this,R.anim.splash_anim);
        logo_splash.startAnimation(splash);
    }
    //SIRVE PARA HACER LA TRANSICION ENTRE EL SPLASH Y EL ACTIVITY DE NAVIGATION
    public void openNavigation(boolean locationPermission){
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, Navigation.class);
                //SIRVE PARA CUANDO SE LE DE AL BOTON DE ATRAS SE SALGA DE LA APLICACION EN VEZ DE IR A LA PANTALLA ANTERIOR
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        }, 3500);
    }
}
