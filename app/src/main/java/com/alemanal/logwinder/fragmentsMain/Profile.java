package com.alemanal.logwinder.fragmentsMain;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.alemanal.logwinder.R;
import com.alemanal.logwinder.ViewPager;
import com.alemanal.logwinder.ViewPagerMain;

import java.util.HashMap;

public class Profile extends Fragment {
    View v;
    TextView dato1, dato2, dato3,dato4,dato5,dato6,dato7;
    private HashMap<String, Boolean> data = ViewPagerMain.getData();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_profile, container, false);
        dato1 = v.findViewById(R.id.dato1);
        dato2 = v.findViewById(R.id.dato2);
        dato3 = v.findViewById(R.id.dato3);
        dato4 = v.findViewById(R.id.dato4);
        dato5 = v.findViewById(R.id.dato5);
        dato6 = v.findViewById(R.id.dato6);
        dato7 = v.findViewById(R.id.dato7);

        if(data.get("R.id.frigo")) {
            if (data.get("R.id.frigoA3")) {
                dato1.setText("");
            } else if (data.get("R.id.frigoA2")) {
                dato1.setText("");
            } else if (data.get("R.id.frigoA1")) {
                dato1.setText("");
            }else if (data.get("R.id.frigoA")) {
                dato1.setText("");
            }else if (data.get("R.id.frigoB")) {
                dato1.setText("");
            }else if (data.get("R.id.frigoC")) {
                dato1.setText("1000 ~ 1100 kw/h");
            }
        } else dato1.setText("0kw/h");
        if(data.get("R.id.micro"))
            dato2.setText("");
        if(data.get("R.id.conge")) {
             if (data.get("R.id.congeA2")) {
                dato1.setText("");
            } else if (data.get("R.id.congeA1")) {
                dato1.setText("");
            }else if (data.get("R.id.congeA")) {
                dato1.setText("");
            }else if (data.get("R.id.congeB")) {
                dato1.setText("");
            }else if (data.get("R.id.congeC")) {
                dato1.setText("");
            }else if (data.get("R.id.congeD")) {
                 dato1.setText("");
             }
        } else dato1.setText("0kw/h");
        if(data.get("R.id.vitro")) {
            if (data.get("R.id.vitroRad")) {
                dato1.setText("");
            } else if (data.get("R.id.vitroEle")) {
                dato1.setText("");
            }else if (data.get("R.id.vitroInd")) {
                dato1.setText("");
            }
        } else dato1.setText("0kw/h");

        return v;
    }
}