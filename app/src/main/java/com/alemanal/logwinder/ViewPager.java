package com.alemanal.logwinder;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.alemanal.logwinder.fragments.*;
import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationMenuView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarView;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator;

import java.util.ArrayList;
import java.util.HashMap;

public class ViewPager extends FragmentActivity {
    //Dicta el número de paginas
    private static final int NUM_PAGES = 4;
    //Pager widget, que otorga animacion y posibilidad de swipear lateralmente
    private ViewPager2 view_pager;
    //El adapter que provee las páginas al ViewPager
    private FragmentStateAdapter pagerAdapter;
    WormDotsIndicator dotsIndicator;
    public static HashMap<String,Boolean> data = new HashMap<String,Boolean>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        // Instanciacion del ViewPager2 y PagerAdapter.
        view_pager = findViewById(R.id.pager);
        pagerAdapter = new ScreenSlidePagerAdapter(this);
        view_pager.setAdapter(pagerAdapter);
        dotsIndicator = (WormDotsIndicator) findViewById(R.id.worm_dots_indicator);
        dotsIndicator.setViewPager2(view_pager);
//        BottomNavigationView myBottomNavView = findViewById(R.id.bottom_navigation2);
//        BottomNavigationMenuView bottomNavigationMenuView = (BottomNavigationMenuView) myBottomNavView.getChildAt(0);
//        View v = bottomNavigationMenuView.getChildAt(2);
//        BottomNavigationItemView itemView = (BottomNavigationItemView) v;
//        NavigationBarView.OnItemSelectedListener()
    }
    @Override
    public void onBackPressed() {
        if (view_pager.getCurrentItem() == 0) {
            // Si el usuario esta en el primer paso, le da la posibilidad de volver.
            // lo cual llama al metodo finish() el cual sale de la aplicacion
            super.onBackPressed();
        } else {
            // Sino vuelve a la página anterior
            view_pager.setCurrentItem(view_pager.getCurrentItem() - 1);
        }
    }
    //Un simple adaptador el cual representa NUM_PAGES objetos de pagina en secuencia.
    private class ScreenSlidePagerAdapter extends FragmentStateAdapter {
        public ScreenSlidePagerAdapter(FragmentActivity fa) {
            super(fa);
        }

        @Override
        public Fragment createFragment(int position) {
            switch(position){
                case 0:
                    return new Prueba1();
                case 1:
                    return new Prueba2();
                case 2:
                    return new Prueba4();
                case 3:
                    Intent in = new Intent(ViewPager.this, MainActivity.class);
                    startActivity(in);
                default:
                    return new Prueba1();
            }
        }
        @Override
        public int getItemCount() {
            return NUM_PAGES;
        }
    }
    public static void compColor(CardView cv, Context con) {
        String currentColor =  Integer.toHexString(cv.getCardBackgroundColor().getDefaultColor());
        String secondaryColor = Integer.toHexString(ContextCompat.getColor(con,R.color.secondaryColor));
        String id = con.getResources().getResourceEntryName(((View)cv).getId());
        if(currentColor.equalsIgnoreCase(secondaryColor)) {
            cv.setCardBackgroundColor(con.getResources().getColor(R.color.white));
            data.put(id, false);
        }
        else {
            cv.setCardBackgroundColor(con.getResources().getColor(R.color.secondaryColor));
            data.put(id, true);
        }
    }
    public static void chekealos(ArrayList<CardView> ach, Context con){
        for(CardView cv : ach){
            String currentColor =  Integer.toHexString(cv.getCardBackgroundColor().getDefaultColor());
            String secondaryColor = Integer.toHexString(ContextCompat.getColor(con,R.color.secondaryColor));
            String id = con.getResources().getResourceEntryName(((View)cv).getId());
            if(currentColor.equalsIgnoreCase(secondaryColor)) {
                data.put(id, true);
                System.out.println(id+" "+data.get(id));
            }
            else {
                data.put(id, false);
                System.out.println(id+" "+data.get(id));
            }
        }
    }
    public HashMap<String,Boolean> getData(){
        return data;
    }
}











