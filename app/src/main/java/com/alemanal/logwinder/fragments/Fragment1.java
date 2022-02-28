package com.alemanal.logwinder.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alemanal.logwinder.ViewPager;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.alemanal.logwinder.R;

import java.util.ArrayList;

//Esto es un ejemplo de como seria un fragment
public class Fragment1 extends Fragment {
    private View v;
    private CardView cv1,cv2,cv3,cv4,cv5;
    private ArrayList<CardView> arch;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_1, container, false);
        cv1 = v.findViewById(R.id.frigo);
        cv2 = v.findViewById(R.id.horno);
        cv3 = v.findViewById(R.id.micro);
        cv4 = v.findViewById(R.id.conge);
        cv5 = v.findViewById(R.id.vitro);
        arch = new ArrayList<CardView>();

        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ViewPager.compColor(cv1,getContext());
            }
        });
        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ViewPager.compColor(cv2,getContext());
            }
        });
        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ViewPager.compColor(cv3,getContext());
            }
        });
        cv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ViewPager.compColor(cv4,getContext());
            }
        });
        cv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ViewPager.compColor(cv5,getContext());
            }
        });
        //Infla el layout fragment_prueba1
        return v;
    }

    @Override
    public void onPause() {
        super.onPause();
        arch = new ArrayList<CardView>();
        arch.add(cv1);
        arch.add(cv2);
        arch.add(cv3);
        arch.add(cv4);
        arch.add(cv5);
        ViewPager.chekealos(arch, getContext());
    }

    @Override
    public void onStart() {
        super.onStart();
        arch = new ArrayList<CardView>();
        arch.add(cv1);
        arch.add(cv2);
        arch.add(cv3);
        arch.add(cv4);
        arch.add(cv5);
        ViewPager.chekealos(arch, getContext());
    }
}