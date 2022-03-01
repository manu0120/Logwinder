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

public class Fragment7 extends Fragment {
    private View v;

    private RadioButton lavavajillasA3, lavavajillasA2, lavavajillasA1, lavavajillasA, lavavajillasB, lavavajillasC;

    ArrayList<RadioButton> rad;
    RadioGroup grupoRadio;
    RadioButton botonRadio;
    public Fragment7() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v=inflater.inflate(R.layout.fragment_7, container, false);
        lavavajillasA3 = v.findViewById(R.id.vajiA3);
        lavavajillasA2 = v.findViewById(R.id.vajiA2);
        lavavajillasA1 = v.findViewById(R.id.vajiA1);
        lavavajillasA = v.findViewById(R.id.vajiA);
        lavavajillasB = v.findViewById(R.id.vajiB);
        lavavajillasC = v.findViewById(R.id.vajiC);
        rad=new ArrayList<RadioButton>();

        FloatingActionButton fab=v.findViewById(R.id.fab22);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAlertDialogButtonClicked();
            }
        });
        grupoRadio=v.findViewById(R.id.radioGroup22);
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
        rad.add(lavavajillasA3);
        rad.add(lavavajillasA2);
        rad.add(lavavajillasA1);
        rad.add(lavavajillasA);
        rad.add(lavavajillasB);
        rad.add(lavavajillasC);
        ViewPager.compRadioButton(rad, getContext());
    }

    @Override
    public void onStart() {
        super.onStart();
        rad=new ArrayList<RadioButton>();
        rad.add(lavavajillasA3);
        rad.add(lavavajillasA2);
        rad.add(lavavajillasA1);
        rad.add(lavavajillasA);
        rad.add(lavavajillasB);
        rad.add(lavavajillasC);
        ViewPager.compRadioButton(rad, getContext());
    }
}