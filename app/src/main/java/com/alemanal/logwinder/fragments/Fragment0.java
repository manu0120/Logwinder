package com.alemanal.logwinder.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alemanal.logwinder.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment0#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment0 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment0() {
        // Required empty public constructor
    }

    /*public static Fragment0 newInstance(String param1, String param2) {
        Fragment0 fragment = new Fragment0();
        Bundle args = new Bundle();

        return fragment;
    }*/

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_0, container, false);
    }
}