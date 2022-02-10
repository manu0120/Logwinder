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
    public static HashMap<String,Boolean> data;
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
                    return new Prueba21();
                default:
                    return new Prueba1();
            }
        }

        @Override
        public int getItemCount() {
            return NUM_PAGES;
        }
    }

    public static void compColorCV(CardView cv1, CheckBox cb1, Context con) {
        String currentColor =  Integer.toHexString(cv1.getCardBackgroundColor().getDefaultColor());
        String secondaryColor = Integer.toHexString(ContextCompat.getColor(con,R.color.secondaryColor));
        if(currentColor.equalsIgnoreCase(secondaryColor)) {
            cv1.setCardBackgroundColor(con.getResources().getColor(R.color.white));
            cb1.setChecked(false);

        }
        else {
            cv1.setCardBackgroundColor(con.getResources().getColor(R.color.secondaryColor));
            cb1.setChecked(true);
        }
    }
    public static void compColorCB(CardView cv1,CheckBox cb1,Context con) {
        if(cb1.isChecked()) {
            cv1.setCardBackgroundColor(con.getResources().getColor(R.color.secondaryColor));
        }
        else
            cv1.setCardBackgroundColor(con.getResources().getColor(R.color.white));
    }
    public static void chekealos(ArrayList<CheckBox> ach, Context con){
        for(CheckBox ch : ach){
//            if (ch.isChecked())
//                data.put(((View)ch).getId(),true);
//            else data.put(((View)ch).getId(),false);
            String id = con.getResources().getResourceEntryName(((View)ch).getId());
            data.put(id,false);
        }
    }
    public static void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkFrigo:
                if (checked) {
                    data.put("checkFrigo", true);
                    System.out.println(data.get("checkFrigo"));
                }
              else
                    System.out.println("frigo no cheked");
                break;
            case R.id.cb2:
                if (checked)
                    System.out.println("opcion 2 cheked");
                else
                    System.out.println("option 2 no cheked");
                break;
        }
    }

}











