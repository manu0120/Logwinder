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

import java.util.ArrayList;
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
        ArrayList<String> arrTips= new ArrayList<String>();
        String s;
        try {
            if (data.get("frigo")) {
                if (data.get("frigoA")) {
                    arrTips.add("Deberías remplazar tu frigorífico por uno con una clase energética mejor, asi podrías ahorrar un poco de electricidad");
                } else if (data.get("frigoB")) {
                    arrTips.add("Deberías remplazar tu frigorífico por uno con una clase energética mejor, asi podrías ahorrar un poco de electricidad");
                } else if (data.get("frigoC")) {
                    arrTips.add("Deberías remplazar tu frigorífico por uno con una clase energética mejor, asi podrías ahorrar un poco de electricidad");
                }
            }
            if (data.get("conge")) {
                if (data.get("congeB")) {
                    arrTips.add("Deberías remplazar tu congelador por uno con una clase energética mejor, asi podrías ahorrar un poco de electricidad");
                } else if (data.get("congeC")) {
                    arrTips.add("Deberías remplazar tu congelador por uno con una clase energética mejor, asi podrías ahorrar un poco de electricidad");
                } else if (data.get("congeD")) {
                    arrTips.add("Deberías remplazar tu congelador por uno con una clase energética mejor, asi podrías ahorrar un poco de electricidad");
                }
            }
            if (data.get("lava")) {
                if (data.get("lavaB")) {
                    arrTips.add("Deberías remplazar tu lavadora por una con una clase energética mejor, asi podrías ahorrar un poco de electricidad");
                } else if (data.get("lavaC")) {
                    arrTips.add("Deberías remplazar tu lavadora por una con una clase energética mejor, asi podrías ahorrar un poco de electricidad");
                }
            }
            arrTips.add("Intenta usar los aparatos cuando la electricidad este mas baja, puesdes consultar los precios de hoy en la pestaña principal");
            arrTips.add("Intenta usar la lavadora y el lavavajillas cuando esten llenos");
            arrTips.add("Intenta usar bombillas de bajo consumo o bombillas LED, ¡consumen menos!");
            arrTips.add("Intenta no dejar luces encendidas si no vas a estar en esa sala, pero tampoco enciendas y apagues las luces todo el tiempo");
            arrTips.add("Apaga la vitrocerámica 5 minutos antes de que se termine de hacer la comida, con el calor residual se terminará igual");
            arrTips.add("Intenta no dejar mucho tiempo la nevera o el congelador abierto, sino tendrán que trabajar mas en recuperar la temperatura que han perdido");
            arrTips.add("Intenta desenchufar los aparatos electricos que no se usen para evitar que gasten electricidad de forma stand-by");
            arrTips.add("Intenta no descuidar los electrodomésticos, ¡uno limpio siempre va a trabajar mejor que uno que este sucio!");
            arrTips.add("Intenta elegir una tarifa con discriminación horaria ¡puedes ver en nuestra ventana home que horas son mas baratas!");
            int ran = (int) Math.floor(Math.random() * (12 + 1));
             s = arrTips.get(ran);
        } catch (IndexOutOfBoundsException e){
            s = arrTips.get(0);
        }
        return s;
    }
}