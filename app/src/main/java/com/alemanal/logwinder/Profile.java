package com.alemanal.logwinder;

import androidx.appcompat.app.AppCompatActivity;
import com.alemanal.logwinder.ViewPager;
import android.os.Bundle;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ViewPager.data.get("cv1");
        ViewPager.data.get("cv2");
        ViewPager.data.get("cv3");
        ViewPager.data.get("cv4");
        ViewPager.data.get("cv5");
    }


}