package com.alemanal.logwinder.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.alemanal.logwinder.R;
import com.alemanal.logwinder.ViewPager;
import com.alemanal.logwinder.ViewPagerMain;

import java.io.IOException;

//Esto es un ejemplo de como seria un fragment
public class Fragment9 extends Fragment {
    View v;
    Button btToHome;
    TextView tvEnd;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.fragment_9, container, false);
        tvEnd = v.findViewById(R.id.tvEnd);
        tvEnd.setText("Ya hemos terminado!!");
        btToHome = v.findViewById(R.id.btToHome);
        btToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ViewPagerMain.guardarDatos(ViewPager.data, getContext());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Intent in = new Intent(getContext(), ViewPagerMain.class);
                startActivity(in);
            }
        });
        return v;
    }
}