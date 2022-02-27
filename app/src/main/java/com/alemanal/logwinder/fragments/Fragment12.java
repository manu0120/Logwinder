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

public class Fragment12 extends Fragment {
    private View v;
    private CardView cv6,cv7,cv8,cv9;
    private ArrayList<CardView> arch;

    ViewPager vp=new ViewPager();
    public Fragment12() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v=inflater.inflate(R.layout.fragment_12, container, false);

        cv6 = v.findViewById(R.id.cv6);
        cv7 = v.findViewById(R.id.cv7);
        cv8 = v.findViewById(R.id.cv8);
        cv9 = v.findViewById(R.id.cv9);

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
        cv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ViewPager.compColor(cv9,getContext());
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
        arch.add(cv9);

        System.out.println("Llamada onPause");
        /*ViewPager.chekealos(arch, getContext());
        ViewPager.conectarFragments();*/

        //ESTO DE ABAJO DABA ERROR:
        vp.chekealos(arch, getContext());
        vp.conectarFragments();

    }

    @Override
    public void onStart() {
        super.onStart();
//        arch = new ArrayList<CardView>();
//        arch.add(cv6);
//        arch.add(cv7);
//        arch.add(cv8);
//        arch.add(cv9);
//
//        //ViewPager.chekealos(arch, getContext());
//
//        vp.chekealos(arch, getContext());
    }

    /*public void onStop() {

        super.onStop();
        System.out.println("LLamada onStop");
        ViewPager.chekealos(arch, getContext());
        ViewPager.conectarFragments();

    }*/
}