package com.alemanal.logwinder.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import com.alemanal.logwinder.R;

import java.util.ArrayList;

//Esto es un ejemplo de como seria un fragment
public class Prueba4 extends Fragment {
    private CheckBox cb1;
    private View v;
    private CardView cv1;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_prueba4, container, false);

        cb1 = v.findViewById(R.id.cb1);
        cv1 = v.findViewById(R.id.cv1);
        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compColorCV();
            }
        });
        cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                compColorCB();
            }
        });


        //Infla el layout fragment_prueba1
        return v;
    }
    private void compColorCV() {
        String currentColor =  Integer.toHexString(cv1.getCardBackgroundColor().getDefaultColor());
        String secondaryColor = Integer.toHexString(ContextCompat.getColor(getContext(), R.color.secondaryColor));
        if(currentColor.equalsIgnoreCase(secondaryColor)) {
            cv1.setCardBackgroundColor(getResources().getColor(R.color.white));
            cb1.setChecked(false);

        }
        else {
            cv1.setCardBackgroundColor(getResources().getColor(R.color.secondaryColor));
            cb1.setChecked(true);
        }
    }
    private void compColorCB() {
        if(cb1.isChecked())
            cv1.setCardBackgroundColor(getResources().getColor(R.color.secondaryColor));
        else
            cv1.setCardBackgroundColor(getResources().getColor(R.color.white));
    }

}