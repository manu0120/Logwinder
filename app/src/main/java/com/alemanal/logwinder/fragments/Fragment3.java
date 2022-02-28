package com.alemanal.logwinder.fragments;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
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


public class Fragment3 extends Fragment {
    private View v;

    private RadioButton frigoA3, frigoA2, frigoA1, frigoA, frigoB, frigoC;

    ArrayList<RadioButton> rad;
    RadioGroup grupoRadio;
    RadioButton botonRadio;
    public Fragment3() {

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

        v=inflater.inflate(R.layout.fragment_3, container, false);
        frigoA3 = v.findViewById(R.id.frigoA3);
        frigoA2 = v.findViewById(R.id.frigoA2);
        frigoA1 = v.findViewById(R.id.frigoA1);
        frigoA = v.findViewById(R.id.frigoA);
        frigoB = v.findViewById(R.id.frigoB);
        frigoC = v.findViewById(R.id.frigoC);
        rad=new ArrayList<RadioButton>();

        FloatingActionButton fab=v.findViewById(R.id.fab11);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAlertDialogButtonClicked();
            }
        });
        grupoRadio=v.findViewById(R.id.radioGroup11);
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
        rad.add(frigoA3);
        rad.add(frigoA2);
        rad.add(frigoA1);
        rad.add(frigoA);
        rad.add(frigoB);
        rad.add(frigoC);
        ViewPager.compRadioButton(rad, getContext());
    }

    @Override
    public void onStart() {
        super.onStart();
        rad=new ArrayList<RadioButton>();
        rad.add(frigoA3);
        rad.add(frigoA2);
        rad.add(frigoA1);
        rad.add(frigoA);
        rad.add(frigoB);
        rad.add(frigoC);
        ViewPager.compRadioButton(rad, getContext());
    }
}