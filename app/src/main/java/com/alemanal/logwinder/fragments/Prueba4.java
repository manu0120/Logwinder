package com.alemanal.logwinder.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import com.alemanal.logwinder.ViewPager;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.alemanal.logwinder.R;

import java.util.ArrayList;

//Esto es un ejemplo de como seria un fragment
public class Prueba4 extends Fragment {
    private CheckBox checkFrigo,cb2,cb3,cb4,cb5;
    private View v;
    private CardView cardFrigo,cv2,cv3,cv4,cv5;
    private ArrayList<CheckBox> arch;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_prueba4, container, false);

        checkFrigo = v.findViewById(R.id.checkFrigo);
        cb2 = v.findViewById(R.id.cb2);
        cb3 = v.findViewById(R.id.cb3);
        cb4 = v.findViewById(R.id.cb4);
        cb5 = v.findViewById(R.id.cb5);
        cardFrigo = v.findViewById(R.id.cv1);
        cv2 = v.findViewById(R.id.cv2);
        cv3 = v.findViewById(R.id.cv3);
        cv4 = v.findViewById(R.id.cv4);
        cv5 = v.findViewById(R.id.cv5);
        arch = new ArrayList<CheckBox>();
        arch.add(checkFrigo);
        arch.add(cb2);
        arch.add(cb3);
        arch.add(cb4);
        arch.add(cb5);
        cardFrigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ViewPager.compColorCV(cardFrigo,checkFrigo,getContext());
            }
        });
        ((View)checkFrigo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ViewPager.compColorCB(cardFrigo,checkFrigo,getContext());
                ViewPager.onCheckboxClicked(view);
            }
        });

        //Infla el layout fragment_prueba1
        return v;
    }

    @Override
    public void onPause() {
        super.onPause();

    }

    @Override
    public void onStart() {
        super.onStart();
        arch = new ArrayList<CheckBox>();
        arch.add(checkFrigo);
        arch.add(cb2);
        arch.add(cb3);
        arch.add(cb4);
        arch.add(cb5);
        ViewPager.chekealos(arch, getContext());
    }
}