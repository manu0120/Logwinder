package com.alemanal.logwinder.fragmentsMain;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alemanal.logwinder.R;
import com.alemanal.logwinder.ViewPager;

public class Profile extends Fragment {
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