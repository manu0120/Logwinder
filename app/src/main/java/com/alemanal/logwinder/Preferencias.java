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
    public static String elec;

    public static void obtenerPreferencias(SharedPreferences preferences, FragmentSettings context){

        email= preferences.getString(EMAIL,"Configure las preferencias");

        casa = preferences.getString(CASA,"Configure las preferencias");

        elec = preferences.getString(ELECTRODOMESTICOS,"Configure las preferencias");

        //Radio button tipo de casa
        if (casa.equals("Chalet")){
            casa = "Chalet";
        } else if (casa.equals("Piso")){
            casa="Piso";
        } else if (casa.equals("Oficina")){
            casa="Oficina";
        }

        //Radio button electrodomestico
        switch (elec){
            case "Nevera": elec="Nevera";
                break;
            case "Lavadora": elec="Lavadora";
                break;
            case "Lavavajillas": elec="Lavavajillas";
                break;
            case "Secadora": elec="Secadora";
                break;
            case "Vitroceramica": elec="Vitroceramica";
                break;
            case "Microondas": elec="Microondas";
                break;
            default: elec="Congelador";
                break;
        }

    }

}
