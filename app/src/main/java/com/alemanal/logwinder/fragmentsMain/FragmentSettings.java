package com.alemanal.logwinder.fragmentsMain;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.preference.PreferenceManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.alemanal.logwinder.Preferencias;
import com.alemanal.logwinder.R;
import com.alemanal.logwinder.SettingsActivity;


public class FragmentSettings extends Fragment {

    TextView tvEmail, tvCasa, tvEle;
    Button btPref;
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_settings, container, false);
        tvEmail = view.findViewById(R.id.tvEmail);
        tvCasa = view.findViewById(R.id.tvCasa);
        tvEle = view.findViewById(R.id.tvEle);
        btPref = view.findViewById(R.id.btPrefe);
        PreferenceManager.setDefaultValues(getContext(),R.xml.root_preferences, false);

        SharedPreferences preferences=PreferenceManager.getDefaultSharedPreferences(getContext());
        Preferencias.obtenerPreferencias(preferences,this);
        tvEmail.setText(Preferencias.email);
        tvCasa.setText(Preferencias.casa);



        btPref.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), SettingsActivity.class);
                startActivity(intent);
            }
        });

        return view;

    }
}