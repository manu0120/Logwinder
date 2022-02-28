package com.alemanal.logwinder;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import com.alemanal.logwinder.fragments.Fragment9;
import com.alemanal.logwinder.fragmentsMain.FragmentTips;
import com.alemanal.logwinder.fragmentsMain.Home;
import com.alemanal.logwinder.fragmentsMain.Profile;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

public class ViewPagerMain extends FragmentActivity {
    //Dicta el número de paginas
    private static final int NUM_PAGES = 4;
    //Pager widget, que otorga animacion y posibilidad de swipear lateralmente
    private ViewPager2 view_pager;
    //El adapter que provee las páginas al ViewPager
    private FragmentStateAdapter pagerAdapter;
    BottomNavigationView btNav;
    HashMap data = ViewPager.data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager_main);

        try {
            getData();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Instanciacion del ViewPager2 y PagerAdapter.
        view_pager = findViewById(R.id.pager);
        pagerAdapter = new ScreenSlidePagerAdapter(this);
        view_pager.setAdapter(pagerAdapter);
        btNav = findViewById(R.id.bottom_navigation);
        btNav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
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

//        Gson gson = new Gson();
//        JsonObject json = gson.toJsonTree(data).getAsJsonObject();
//        try {
//            FileOutputStream fos = getApplicationContext().openFileOutput("json.json",Context.MODE_PRIVATE);
//            fos.write(data.toString().getBytes(),0,data.toString().length());
//            fos.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    private void getData() throws IOException, ClassNotFoundException {
        FileInputStream fo = new FileInputStream("data.ext");
        ObjectInputStream os = new ObjectInputStream(fo);
        data = (HashMap) os.readObject();
//        Gson gson = new Gson();
//        try{
//            FileInputStream is = openFileInput("json.json");
//            String aaa = is.toString();
//            System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
//            System.out.println(aaa);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//
//        }
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        System.out.println(data.toString());

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
                    return new FragmentTips();
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

    @Override
    protected void onPause() {
        try {
            guardarDatos();
        } catch (IOException e) {
            e.printStackTrace();
        }
        super.onPause();
    }

    @Override
    protected void onDestroy() {
//        try{
//            FileOutputStream fos = openFileOutput("datos.txt", Context.MODE_PRIVATE);
//
//        } catch(java.io.IOException e){
//
//        }

//        Gson gson = new Gson();
//        JsonObject json = gson.toJsonTree(data).getAsJsonObject();
//        try {
//            FileOutputStream fos = getApplicationContext().openFileOutput("json.txt",Context.MODE_PRIVATE);
//            fos.write(json.toString().getBytes(),0,json.toString().length());
//            fos.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        super.onDestroy();
    }
    public void guardarDatos() throws IOException {
        FileOutputStream fo = openFileOutput("data.ext", Context.MODE_PRIVATE);
        ObjectOutputStream os = new ObjectOutputStream(fo);
        os.writeObject(data);
    }
}











