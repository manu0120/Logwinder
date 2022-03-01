package com.alemanal.logwinder;

import android.content.Context;
import android.content.SharedPreferences;

import com.alemanal.logwinder.fragmentsMain.FragmentSettings;

public class Preferencias {

    public static final String EMAIL = "email";
    public static final String CASA = "casa";
    public static final String ELECTRODOMESTICOS = "electrodomesticos";

    public static String email;
    public static String casa;
    public static String electrodomestico;

    public static void obtenerPreferencias(SharedPreferences preferences, FragmentSettings context){
        String Error ="ok";

        email= preferences.getString(EMAIL,"example@gmial.com");

        casa = preferences.getString(CASA,"Piso");

        electrodomestico = preferences.getString(ELECTRODOMESTICOS,"Configure las preferencias");

        if (casa.equals("Chalet")){
            casa = "Chalet";
        } else if (casa.equals("Piso")){
            casa="Piso";
        } else if (casa.equals("Oficina")){
            casa="Oficina";
        }




    }

}
