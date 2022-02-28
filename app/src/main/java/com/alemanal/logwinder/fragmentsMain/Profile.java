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

        if(data.get("frigo")) {
            if (data.get("frigoA3")) {
                dato1.setText("175kw/h");
            } else if (data.get("frigoA2")) {
                dato1.setText("284kw/h");
            } else if (data.get("frigoA1")) {
                dato1.setText("322kw/h");
            }else if (data.get("frigoA")) {
                dato1.setText("374kw/h");
            }else if (data.get("frigoB")) {
                dato1.setText("507kw/h");
            }else if (data.get("frigoC")) {
                dato1.setText("1000 ~ 1100 kw/h");
            } else dato1.setText("300 ~ 500 kw/h");
        }else dato1.setText("0kw/h");

        if(data.get("micro"))
            dato2.setText("90 ~ 1000 kw/h");
        else dato2.setText("0kw/h");
        if(data.get("conge")) {
             if (data.get("congeA2")) {
                dato3.setText("131kw/h");
            } else if (data.get("congeA1")) {
                dato3.setText("151kw/h");
            }else if (data.get("congeA")) {
                dato3.setText("163kw/h");
            }else if (data.get("congeB")) {
                dato3.setText("171kw/h");
            }else if (data.get("congeC")) {
                dato3.setText("195kw/h");
            }else if (data.get("congeD")) {
                 dato3.setText("234kw/h");
             } else dato3.setText("300 ~ 500 kw/h");
        } else dato3.setText("0kw/h");
        if(data.get("vitro")) {
            if (data.get("vitroRad")) {
                dato4.setText("1200 ~ 2500kw/h");
            } else if (data.get("vitroEle")) {
                dato4.setText("500kw/h");
            }else if (data.get("vitroInd")) {
                dato4.setText("438 ~ 900 kw/h");
            }else dato4.setText("300 ~ 500 kw/h");
        } else dato4.setText("0kw/h");

        if(data.get("lavadora")) {
            if (data.get("lavadoraA2")) {
                dato4.setText("125kw/h");
            } else if (data.get("lavadoraA1")) {
                dato5.setText("151kw/h");
            }else if (data.get("lavadoraA")) {
                dato5.setText("193kw/h");
            }else if (data.get("lavadoraB")) {
                dato5.setText("352kw/h");
            }else if (data.get("lavadoraC")) {
                dato5.setText("425kw/h");
            }else if (data.get("lavadoraD")) {
                dato5.setText("450kw/h");
            } else dato5.setText("300 ~ 500 kw/h");
        } else dato5.setText("0kw/h");

        if(data.get("lavavajillas")) {
            if (data.get("lavavajillasA2")) {
                dato6.setText("131kw/h");
            } else if (data.get("lavavajillasA1")) {
                dato6.setText("147kw/h");
            }else if (data.get("lavavajillasA")) {
                dato6.setText("158kw/h");
            }else if (data.get("lavavajillasB")) {
                dato6.setText("173kw/h");
            }else if (data.get("lavavajillasC")) {
                dato6.setText("183kw/h");
            }else if (data.get("lavavajillasD")) {
                dato6.setText("246kw/h");
            }else dato6.setText("300 ~ 500 kw/h");
        } else dato6.setText("0kw/h");

        if(data.get("secadora")) {
            if (data.get("secadoraA2")) {
                dato7.setText("145kw/h");
            } else if (data.get("secadoraA1")) {
                dato7.setText("152kw/h");
            }else if (data.get(".secadoraA")) {
                dato7.setText("163kw/h");
            }else if (data.get("secadoraB")) {
                dato7.setText("184kw/h");
            }else if (data.get("secadoraC")) {
                dato7.setText("197kw/h");
            }else if (data.get("secadoraD")) {
                dato7.setText("234kw/h");
            }else dato7.setText("300 ~ 500 kw/h");
        } else dato7.setText("0kw/h");

        return v;
    }
}