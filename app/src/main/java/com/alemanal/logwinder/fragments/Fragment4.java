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


public class Fragment4 extends Fragment {
    View v;
    RadioGroup grupoRadio;
    RadioButton botonRadio;

    private RadioButton congeA2, congeA1, congeA, congeB, congeC, congeD;
    ArrayList<RadioButton> rad;

    public Fragment4() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v=inflater.inflate(R.layout.fragment_4, container, false);


        congeA2 = v.findViewById(R.id.congeA2);
        congeA1 = v.findViewById(R.id.congeA1);
        congeA = v.findViewById(R.id.congeA);
        congeB = v.findViewById(R.id.congeB);
        congeC = v.findViewById(R.id.congeC);
        congeD = v.findViewById(R.id.congeD);
        rad=new ArrayList<RadioButton>();
        FloatingActionButton fab=v.findViewById(R.id.fab14);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAlertDialogButtonClicked();
            }
        });

        grupoRadio=v.findViewById(R.id.radioGroup14);
        return v;
    }

    private void showAlertDialogButtonClicked() {
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

        //COMPRUEBA QUE RADIOBUTTON ESTA MARCADO
        rad=new ArrayList<RadioButton>();

        rad.add(congeA2);
        rad.add(congeA1);
        rad.add(congeA);
        rad.add(congeB);
        rad.add(congeC);
        rad.add(congeD);
        ViewPager.compRadioButton(rad, getContext());

    }
    public void onStart() {
        super.onStart();
        rad=new ArrayList<RadioButton>();
        rad.add(congeA2);
        rad.add(congeA1);
        rad.add(congeA);
        rad.add(congeB);
        rad.add(congeC);
        rad.add(congeD);
        ViewPager.compRadioButton(rad, getContext());
    }
}