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
             if (data.get("congA2")) {
                dato3.setText("131kw/h");
            } else if (data.get("congA1")) {
                dato3.setText("151kw/h");
            }else if (data.get("congA")) {
                dato3.setText("163kw/h");
            }else if (data.get("congB")) {
                dato3.setText("171kw/h");
            }else if (data.get("congC")) {
                dato3.setText("195kw/h");
            }else if (data.get("congD")) {
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

        if(data.get("lava")) {
            if (data.get("lavaA2")) {
                dato4.setText("125kw/h");
            } else if (data.get("lavaA1")) {
                dato5.setText("151kw/h");
            }else if (data.get("lavaA")) {
                dato5.setText("193kw/h");
            }else if (data.get("lavaB")) {
                dato5.setText("352kw/h");
            }else if (data.get("lavaC")) {
                dato5.setText("425kw/h");
            }else if (data.get("lavaD")) {
                dato5.setText("450kw/h");
            } else dato5.setText("300 ~ 500 kw/h");
        } else dato5.setText("0kw/h");

        if(data.get("vaji")) {
            if (data.get("vajiA2")) {
                dato6.setText("131kw/h");
            } else if (data.get("vajiA1")) {
                dato6.setText("147kw/h");
            }else if (data.get("vajiA")) {
                dato6.setText("158kw/h");
            }else if (data.get("vajiB")) {
                dato6.setText("173kw/h");
            }else if (data.get("vajiC")) {
                dato6.setText("183kw/h");
            }else if (data.get("vajiD")) {
                dato6.setText("246kw/h");
            }else dato6.setText("300 ~ 500 kw/h");
        } else dato6.setText("0kw/h");

        if(data.get("seca")) {
            if (data.get("secaA2")) {
                dato7.setText("145kw/h");
            } else if (data.get("secaA1")) {
                dato7.setText("152kw/h");
            }else if (data.get(".secaA")) {
                dato7.setText("163kw/h");
            }else if (data.get("secaB")) {
                dato7.setText("184kw/h");
            }else if (data.get("secaC")) {
                dato7.setText("197kw/h");
            }else if (data.get("secaD")) {
                dato7.setText("234kw/h");
            }else dato7.setText("300 ~ 500 kw/h");
        } else dato7.setText("0kw/h");

        return v;
    }
}