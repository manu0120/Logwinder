package com.alemanal.logwinder;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import com.alemanal.logwinder.fragments.Prueba2;
import com.alemanal.logwinder.fragmentsMain.Home;
import com.alemanal.logwinder.fragmentsMain.Profile;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class ViewPagerMain extends FragmentActivity {
    //Dicta el número de paginas
    private static final int NUM_PAGES = 4;
    //Pager widget, que otorga animacion y posibilidad de swipear lateralmente
    private ViewPager2 view_pager;
    //El adapter que provee las páginas al ViewPager
    private FragmentStateAdapter pagerAdapter;
    BottomNavigationView btNav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager_main);

        // Instanciacion del ViewPager2 y PagerAdapter.
        view_pager = findViewById(R.id.pager);
        pagerAdapter = new ScreenSlidePagerAdapter(this);
        view_pager.setAdapter(pagerAdapter);
        btNav = findViewById(R.id.bottom_navigation);
        btNav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                Intent in;
                switch (id){
                    case R.id.home:
                        item.setChecked(true);
                        view_pager.setCurrentItem(0);
                        break;
                    case R.id.tips:
                        item.setChecked(true);
                        view_pager.setCurrentItem(1);
                        break;
                    case R.id.profile:
                        item.setChecked(true);
                        view_pager.setCurrentItem(2);
                        break;
                    case R.id.settings:
                        item.setChecked(true);
                        view_pager.setCurrentItem(3);
                        break;
                }
                return false;
            }
        });

        view_pager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                btNav.getMenu().getItem(0).setChecked(false);
                btNav.getMenu().getItem(position).setChecked(true);
                MenuItem prevMenuItem = btNav.getMenu().getItem(position);
                super.onPageSelected(position);

            }
        });
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
                    return new Home();
                case 1:
                    return new Prueba2();
                case 2:
                    return new Profile();
                case 3:
                default:
                    return new Home();
            }
        }
        @Override
        public int getItemCount() {
            return NUM_PAGES;
        }
    }
}











