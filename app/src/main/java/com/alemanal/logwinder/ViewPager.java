package com.alemanal.logwinder;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.alemanal.logwinder.fragments.Prueba1;

public class ViewPager extends FragmentActivity {
    //Dicta el número de paginas
    private static final int NUM_PAGES = 2;
    //Pager widget, que otorga animacion y posibilidad de swipear lateralmente
    private ViewPager2 view_pager;
    //El adapter que provee las páginas al ViewPager
    private FragmentStateAdapter pagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        // Instanciacion del ViewPager2 y PagerAdapter.
        view_pager = findViewById(R.id.pager);
        pagerAdapter = new ScreenSlidePagerAdapter(this);
        view_pager.setAdapter(pagerAdapter);
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
            return new Prueba1();
        }

        @Override
        public int getItemCount() {
            return NUM_PAGES;
        }
    }
}