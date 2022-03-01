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

public class Fragment6 extends Fragment {
    private View v;

    private RadioButton lavadoraA3, lavadoraA2, lavadoraA1, lavadoraA, lavadoraB, lavadoraC;

    ArrayList<RadioButton> rad;
    RadioGroup grupoRadio;
    RadioButton botonRadio;
    public Fragment6() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v=inflater.inflate(R.layout.fragment_6, container, false);
        lavadoraA3 = v.findViewById(R.id.lavaA3);
        lavadoraA2 = v.findViewById(R.id.lavaA2);
        lavadoraA1 = v.findViewById(R.id.lavaA1);
        lavadoraA = v.findViewById(R.id.lavaA);
        lavadoraB = v.findViewById(R.id.lavaB);
        lavadoraC = v.findViewById(R.id.lavaC);
        rad=new ArrayList<RadioButton>();
        FloatingActionButton fab=v.findViewById(R.id.fab21);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAlertDialogButtonClicked();
            }
        });
        grupoRadio=v.findViewById(R.id.radioGroup21);
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
        rad.add(lavadoraA3);
        rad.add(lavadoraA2);
        rad.add(lavadoraA1);
        rad.add(lavadoraA);
        rad.add(lavadoraB);
        rad.add(lavadoraC);
        ViewPager.compRadioButton(rad, getContext());
    }

    @Override
    public void onStart() {
        super.onStart();
        rad=new ArrayList<RadioButton>();
        rad.add(lavadoraA3);
        rad.add(lavadoraA2);
        rad.add(lavadoraA1);
        rad.add(lavadoraA);
        rad.add(lavadoraB);
        rad.add(lavadoraC);
        ViewPager.compRadioButton(rad, getContext());
    }
}