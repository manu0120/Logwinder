package com.alemanal.logwinder.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.alemanal.logwinder.R;

//Esto es un ejemplo de como seria un fragment
public class Prueba21 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //Infla el layout fragment_prueba1
        return (ViewGroup) inflater.inflate(R.layout.fragment_prueba3, container, false);
    }
}