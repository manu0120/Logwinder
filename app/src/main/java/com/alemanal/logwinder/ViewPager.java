package com.alemanal.logwinder;

import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import com.alemanal.logwinder.fragments.*;
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
    Fragment111 f111= new Fragment111();

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
                    return new Fragment0();
                case 1:
                    return new Fragment11();
                case 2:
                    return new Fragment12();
                case 3:
                    return new Fragment111();
                case 4:
                    return new Fragment112();
                default:
                    return new Prueba21();
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
    //SI EL METODO NO ES STATIC DABA ERROR (si es static no puedes usar el metodo getSupportFragmentManager():
    public void conectarFragments(){
        System.out.println("Llamada a conectarFragments desde el metodo onPause");
//        System.out.println("Llamada onStop");
        //Iterando el HashMap sobre las keys
        for (String key: data.keySet()){
            boolean valor=data.get(key);
            if (valor==true){
                if(key.equals("cv1")){
                    FragmentManager fragmentManager=getSupportFragmentManager();
                    FragmentTransaction transaction = fragmentManager.beginTransaction();

                    // Replace whatever is in the fragment_container view with this fragment,
                    // and add the transaction to the back stack
                    transaction.replace(R.id.pager, f111);
                    transaction.addToBackStack(null);

                    // Commit the transaction
                    transaction.commit();
                }else if(key.equals("cv2")){

                }else if(key.equals("cv5")){

                }
            }
            //System.out.println("Clave: "+key+", Valor: "+valor);
        }
    }
}











