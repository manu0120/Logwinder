package com.alemanal.logwinder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.alemanal.logwinder.api.Pvpc;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

class Home extends Fragment {
    View v;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.activity_profile, container, false);
        ViewPager.data.get("cv1");
        ViewPager.data.get("cv2");
        ViewPager.data.get("cv3");
        ViewPager.data.get("cv4");
        ViewPager.data.get("cv5");

        return v;
    }


}