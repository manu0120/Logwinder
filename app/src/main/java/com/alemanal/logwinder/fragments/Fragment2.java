package com.alemanal.logwinder.fragments;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alemanal.logwinder.R;
import com.alemanal.logwinder.ViewPager;

import java.util.ArrayList;

public class Fragment2 extends Fragment {
    private View v;
    private CardView cv6,cv7,cv8;
    private ArrayList<CardView> arch;


    public Fragment2() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v=inflater.inflate(R.layout.fragment_2, container, false);

        cv6 = v.findViewById(R.id.lavadora);
        cv7 = v.findViewById(R.id.lavavajillas);
        cv8 = v.findViewById(R.id.secadora);


        arch = new ArrayList<CardView>();

        /*  cada vez que se pulse un cardview se comprueba el color de fondo que tiene
        y se le "actualiza" el valor del HashMap */
        cv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ViewPager.compColor(cv6,getContext());
            }
        });
        cv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ViewPager.compColor(cv7,getContext());
            }
        });
        cv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ViewPager.compColor(cv8,getContext());
            }
        });

        return v;
    }

    @Override
    public void onPause() {
        super.onPause();
        arch = new ArrayList<CardView>();
        arch.add(cv6);
        arch.add(cv7);
        arch.add(cv8);

        ViewPager.chekealos(arch, getContext());



    }

    @Override
    public void onStart() {
        super.onStart();
        arch = new ArrayList<CardView>();
        arch.add(cv6);
        arch.add(cv7);
        arch.add(cv8);


        ViewPager.chekealos(arch, getContext());

    }

    /*public void onStop() {

        super.onStop();
        System.out.println("LLamada onStop");
        ViewPager.chekealos(arch, getContext());
        ViewPager.conectarFragments();

    }*/
}