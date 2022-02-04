package com.alemanal.logwinder.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.alemanal.logwinder.R;

import java.util.ArrayList;

//Esto es un ejemplo de como seria un fragment
public class Prueba4 extends Fragment {
    ArrayList<CheckBox> preferencias;
    private CheckBox cb1, cb2, cb3, cb4, cb5;

    private CardView cv1, cv2, cv3, cv4, cv5;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //Infla el layout fragment_prueba1
        return (ViewGroup) inflater.inflate(R.layout.fragment_prueba4, container, false);

        //rellenamos el arrayList
//        preferencias.add(getView().findViewById(R.id.cb1));
    }

    public void onViewCreated(View view, Bundle savedInstanceState){
        cb1 =getView().findViewById(R.id.cb1);
        cb2 =getView().findViewById(R.id.cb2);
        cb3 =getView().findViewById(R.id.cb3);
        cb4 =getView().findViewById(R.id.cb4);
        cb5 =getView().findViewById(R.id.cb5);

        cv1 =getView().findViewById(R.id.cv1);
        cv2 =getView().findViewById(R.id.cv2);
        cv3 =getView().findViewById(R.id.cv3);
        cv4 =getView().findViewById(R.id.cv4);
        cv5 =getView().findViewById(R.id.cv5);

        preferencias.add(cb1);
        preferencias.add(cb2);
        preferencias.add(cb3);
        preferencias.add(cb4);
        preferencias.add(cb5);

        cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                cv1.setCardBackgroundColor(@color/secondaryColor);
                cv2.setCardBackgroundColor(R.color.secondaryColor);

            }
        });

    }
}