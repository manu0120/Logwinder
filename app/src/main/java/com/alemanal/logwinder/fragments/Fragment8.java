package com.alemanal.logwinder.fragments;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.alemanal.logwinder.R;
import com.alemanal.logwinder.ViewPager;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class Fragment8 extends Fragment {
    private View v;
    private RadioButton secadoraA3, secadoraA2, secadoraA1, secadoraA, secadoraB, secadoraC;

    ArrayList<RadioButton> rad;
    RadioGroup grupoRadio;
    RadioButton botonRadio;
    public Fragment8() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v=inflater.inflate(R.layout.fragment_8, container, false);
        secadoraA3 = v.findViewById(R.id.secadoraA3);
        secadoraA2 = v.findViewById(R.id.secadoraA2);
        secadoraA1 = v.findViewById(R.id.secadoraA1);
        secadoraA = v.findViewById(R.id.secadoraA);
        secadoraB = v.findViewById(R.id.secadoraB);
        secadoraC = v.findViewById(R.id.secadoraC);
        rad=new ArrayList<RadioButton>();
        FloatingActionButton fab=v.findViewById(R.id.fab23);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAlertDialogButtonClicked();
            }
        });
        grupoRadio=v.findViewById(R.id.radioGroup23);
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

        rad=new ArrayList<RadioButton>();
        rad.add(secadoraA3);
        rad.add(secadoraA2);
        rad.add(secadoraA1);
        rad.add(secadoraA);
        rad.add(secadoraB);
        rad.add(secadoraC);
        ViewPager.compRadioButton(rad, getContext());
    }

    @Override
    public void onStart() {
        super.onStart();
        rad=new ArrayList<RadioButton>();
        rad.add(secadoraA3);
        rad.add(secadoraA2);
        rad.add(secadoraA1);
        rad.add(secadoraA);
        rad.add(secadoraB);
        rad.add(secadoraC);
        ViewPager.compRadioButton(rad, getContext());
    }
}