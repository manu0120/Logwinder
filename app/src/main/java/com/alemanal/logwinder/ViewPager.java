package com.alemanal.logwinder;

import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import com.alemanal.logwinder.fragments.*;
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator;

import java.util.ArrayList;
import java.util.HashMap;

public class ViewPager extends FragmentActivity {
    //Dicta el número de paginas
    private static final int NUM_PAGES = 10;
    //Pager widget, que otorga animacion y posibilidad de swipear lateralmente
    private ViewPager2 view_pager;
    //El adapter que provee las páginas al ViewPager
    private FragmentStateAdapter pagerAdapter;
    WormDotsIndicator dotsIndicator;
    public static HashMap<String,Boolean> data = new HashMap<String,Boolean>();
    Fragment3 f111= new Fragment3();

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
//            getPosition(position);
            switch(position){
                case 0:
                    return new Fragment0();
                case 1:
                    return new Fragment1();
                case 2:
                    return new Fragment3();
                case 3:
                    return new Fragment4();
                case 4:
                    return new Fragment5();
                case 5:
                    return new Fragment2();
                case 6:
                    return new Fragment6();
                case 7:
                    return new Fragment7();
                case 8:
                    return new Fragment8();
                case 9:
                    return new Fragment9();
            }
            return new Fragment0();
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

    public static void compRadioButton(ArrayList<RadioButton> rad, Context con){

        for(RadioButton rb: rad){
            String id=con.getResources().getResourceEntryName(((View)rb).getId());
            if (rb.isChecked()){
                data.put(id, true);
                System.out.println(id+" "+data.get(id));
            }else{
                data.put(id, false);
                System.out.println(id+" "+data.get(id));
            }
        }
    }
}
/*
* 0 -> fragmento base
* 1:
*   frigo -> 11:
*               frigoA3
*               frigoA2
*               frigoA1
*               frigoA
*               frigoB
*               frigoC
*  micro
 * cange -> 14:
 *               congeA2
 *               congeA1
 *               congeA
 *               congeB
 *               congeC
 *               conged
 * vitro -> 15
 *              vitroRad
 *              VitroEle
 *              vitroInd
 *
* 2: (lavanderia)
*   lavadora -> 21
*                lavadoraA3
 *               lavadoraA2
 *               lavadoraA1
 *               lavadoraA
 *               lavadoraB
 *               lavadoraC
*
*   lavavajillas ->22
*                lavavajillasA3
 *               lavavajillasA2
 *               lavavajillasA1
 *               lavavajillasA
 *               lavavajillasB
 *               lavavajillasC
*
*   secadora -> 23:
*                secadoraA3
 *               secadoraA2
 *               secadoraA1
 *               secadoraA
 *               secadoraB
 *               secadoraC
*
*
*
*
*
* */










