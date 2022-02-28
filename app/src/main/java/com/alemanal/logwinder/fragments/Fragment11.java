package com.alemanal.logwinder.fragments;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alemanal.logwinder.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class Fragment11 extends Fragment {
    private View v;
    public Fragment11() {

    }

    /*public static Fragment111 newInstance(String param1, String param2) {
        Fragment111 fragment = new Fragment111();
        Bundle args = new Bundle();

        return fragment;
    }*/

    /*@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        }
    }*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        v=inflater.inflate(R.layout.fragment_11, container, false);


        FloatingActionButton fab=v.findViewById(R.id.fab1);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAlertDialogButtonClicked();
            }
        });
        return v;
    }

    public void showAlertDialogButtonClicked(){
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle("Información");
        builder.setMessage("Las etiquetas energéticas indican a los consumidores cuáles son los " +
                "electrodomésticos que gastan más o menos electricidad. Estas etiquetas se hallan, " +
                "a modo de pegatina, en cada aparato para promover el ahorro energético. A partir " +
                "del pasado 1 de marzo, contamos ya con una nueva clasificación energética de los " +
                "electrodomésticos.\n" +
                "\n" +
                "Las nuevas etiquetas energéticas están reguladas a partir de la normativa europea. " +
                "Es por esto por lo que todos los electrodomésticos de la Unión deben llevar de forma " +
                "obligatoria esta nueva identificación. Es una manera rápida y segura de saber cuáles " +
                "son los electrodomésticos más eficientes del mercado.");
        builder.setCancelable(false);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogo1, int id) {
                dialogo1.dismiss();
            }
        });

        builder.show();
    }

    public void onPause() {

        super.onPause();
    }
}