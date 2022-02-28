package com.alemanal.logwinder.fragmentsMain;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.alemanal.logwinder.R;
import com.alemanal.logwinder.ViewPagerMain;

import java.util.HashMap;

public class FragmentTips extends Fragment {
    View v;
    Button btTips;
    TextView tvTips;
    int cont = 0;
    private HashMap<String, Boolean> data = ViewPagerMain.getData();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_tips, container, false);
        tvTips = v.findViewById(R.id.tvTips);
        btTips = v.findViewById(R.id.btTips);
        btTips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvTips.setText(getTip());
            }
        });

        return v;
    }
    public String getTip(){
        String s="";
        if(data.get("R.id.frigo") && cont == 0) {
            if (data.get("R.id.frigoA")) {
                s = "Deberías remplazar tu frigorífico por uno con una clase energética mejor, asi podrías ahorrar un poco de electricidad";
            } else if (data.get("R.id.frigoB")) {
                s = "Deberías remplazar tu frigorífico por uno con una clase energética mejor, asi podrías ahorrar un poco de electricidad";
            } else if (data.get("R.id.frigoC")) {
                s = "Deberías remplazar tu frigorífico por uno con una clase energética mejor, asi podrías ahorrar un poco de electricidad";
            }
            cont++;
            return s;
        }
        if(data.get("R.id.conge") && cont == 1) {
            if (data.get("R.id.congeB")) {
                s = "Deberías remplazar tu congelador por uno con una clase energética mejor, asi podrías ahorrar un poco de electricidad";
            } else if (data.get("R.id.congeC")) {
                s = "Deberías remplazar tu congelador por uno con una clase energética mejor, asi podrías ahorrar un poco de electricidad";
            } else if (data.get("R.id.congeD")) {
                s = "Deberías remplazar tu congelador por uno con una clase energética mejor, asi podrías ahorrar un poco de electricidad";
            }
            cont++;
            return s;
        }
        if(data.get("R.id.lavadora") && cont == 2) {
            if (data.get("R.id.lavadoraB")) {
                s = "Deberías remplazar tu lavadora por una con una clase energética mejor, asi podrías ahorrar un poco de electricidad";
            } else if (data.get("R.id.lavadoraC")) {
                s = "Deberías remplazar tu lavadora por una con una clase energética mejor, asi podrías ahorrar un poco de electricidad";
            }
            cont++;
            return s;
        }
        if(cont==3){
            s="Intenta usar los aparatos cuando la electricidad este mas baja, puesdes consultar los precios de hoy en la pestaña principal";
        }
        if(cont==4){
            s="Intenta usar la lavadora y el lavavajillas cuando esten llenos";
        }
        if(cont==5){
            s="Intenta usar bombillas de bajo consumo o bombillas LED, ¡consumen menos!";
        }
        if(cont==6){
            s="Intenta no dejar luces encendidas si no vas a estar en esa sala, pero tampoco enciendas y apagues las luces todo el tiempo";
        }
        if (cont < 6)
            cont=0;
        cont++;
        return s;
    }
}