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
                dato1.setText("175kw/h");
            } else if (data.get("R.id.frigoA2")) {
                dato1.setText("284kw/h");
            } else if (data.get("R.id.frigoA1")) {
                dato1.setText("322kw/h");
            }else if (data.get("R.id.frigoA")) {
                dato1.setText("374kw/h");
            }else if (data.get("R.id.frigoB")) {
                dato1.setText("507kw/h");
            }else if (data.get("R.id.frigoC")) {
                dato1.setText("1000 ~ 1100 kw/h");
            }
        } else dato1.setText("0kw/h");
        if(data.get("R.id.micro"))
            dato2.setText("90 ~ 1000 kw/h");
        if(data.get("R.id.conge")) {
             if (data.get("R.id.congeA2")) {
                dato1.setText("131kw/h");
            } else if (data.get("R.id.congeA1")) {
                dato1.setText("151kw/h");
            }else if (data.get("R.id.congeA")) {
                dato1.setText("163kw/h");
            }else if (data.get("R.id.congeB")) {
                dato1.setText("171kw/h");
            }else if (data.get("R.id.congeC")) {
                dato1.setText("195kw/h");
            }else if (data.get("R.id.congeD")) {
                 dato1.setText("234kw/h");
             }
        } else dato1.setText("0kw/h");
        if(data.get("R.id.vitro")) {
            if (data.get("R.id.vitroRad")) {
                dato1.setText("1200 ~ 2500kw/h");
            } else if (data.get("R.id.vitroEle")) {
                dato1.setText("500kw/h");
            }else if (data.get("R.id.vitroInd")) {
                dato1.setText("438 ~ 900 kw/h");
            }
        } else dato1.setText("0kw/h");

        if(data.get("R.id.lavadora")) {
            if (data.get("R.id.lavadoraA2")) {
                dato1.setText("125kw/h");
            } else if (data.get("R.id.lavadoraA1")) {
                dato1.setText("151kw/h");
            }else if (data.get("R.id.lavadoraA")) {
                dato1.setText("193kw/h");
            }else if (data.get("R.id.lavadoraB")) {
                dato1.setText("352kw/h");
            }else if (data.get("R.id.lavadoraC")) {
                dato1.setText("425kw/h");
            }else if (data.get("R.id.lavadoraD")) {
                dato1.setText("450kw/h");
            }
        } else dato1.setText("0kw/h");

        if(data.get("R.id.lavavajillas")) {
            if (data.get("R.id.lavavajillasA2")) {
                dato1.setText("131kw/h");
            } else if (data.get("R.id.lavavajillasA1")) {
                dato1.setText("147kw/h");
            }else if (data.get("R.id.lavavajillasA")) {
                dato1.setText("158kw/h");
            }else if (data.get("R.id.lavavajillasB")) {
                dato1.setText("173kw/h");
            }else if (data.get("R.id.lavavajillasC")) {
                dato1.setText("183kw/h");
            }else if (data.get("R.id.lavavajillasD")) {
                dato1.setText("246kw/h");
            }
        } else dato1.setText("0kw/h");

        if(data.get("R.id.secadora")) {
            if (data.get("R.id.secadoraA2")) {
                dato1.setText("145kw/h");
            } else if (data.get("R.id.secadoraA1")) {
                dato1.setText("152kw/h");
            }else if (data.get("R.id.secadoraA")) {
                dato1.setText("163kw/h");
            }else if (data.get("R.id.secadoraB")) {
                dato1.setText("184kw/h");
            }else if (data.get("R.id.secadoraC")) {
                dato1.setText("197kw/h");
            }else if (data.get("R.id.secadoraD")) {
                dato1.setText("234kw/h");
            }
        } else dato1.setText("0kw/h");

        return v;
    }
}