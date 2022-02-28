package com.alemanal.logwinder.fragments;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.alemanal.logwinder.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Fragment5 extends Fragment {
    private View v;

    RadioGroup grupoRadio;
    RadioButton botonRadio;
    public Fragment5() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v=inflater.inflate(R.layout.fragment_5, container, false);
        FloatingActionButton fab=v.findViewById(R.id.fab15);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAlertDialogButtonClicked();
            }
        });
        grupoRadio=v.findViewById(R.id.radioGroup15);
        return v;
    }

    private void showAlertDialogButtonClicked() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle("Información");
        builder.setMessage("Las vitrocerámicas de toda la vida son las llamadas “radiantes”. Y no, no es porque " +
                "reluzcan, es porque irradian calor a todo lo que se encuentra a su alrededor. Funcionan con una " +
                "resistencia que produce un aumento de temperatura." +
                "\n" +
                "Las vitrocerámicas de inducción funcionan de una forma totalmente distinta. En su interior hay bobinas " +
                "que no generan calor, sino campos electromagnéticos. Por eso, solo calientan los recipientes " +
                "especialmente diseñados para ellas, hechos de material ferromagnético.");
        builder.setCancelable(false);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogo1, int id) {
                dialogo1.dismiss();
            }
        });

        builder.show();
    }

    public void onPause() {

        super.onPause();

        //COMPRUEBA QUE RADIOBUTTON ESTA MARCADO

        int idSeleccionado = grupoRadio.getCheckedRadioButtonId();
        if (idSeleccionado != -1) {
            botonRadio= v.findViewById(idSeleccionado);

        }
    }
}