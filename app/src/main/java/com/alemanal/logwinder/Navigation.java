package com.alemanal.logwinder;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationBarView;

public class Navigation extends AppCompatActivity {

    private MenuItem prevMenuItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
//        ViewPager viewPager = binding.viewPager;
//        viewPager.setAdapter(sectionsPagerAdapter);
//        TabLayout tabs = binding.tabs;
//        tabs.setupWithViewPager(viewPager);
//        FloatingActionButton fab = binding.fab;
//
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override

//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        // cast al xml


        BottomAppBar mybottomNavView2 = findViewById(R.id.bottom_navigation2);
        mybottomNavView2.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.heart:
                        //item.setChecked(true);
                        Toast.makeText(Navigation.this, "Likes clicked.", Toast.LENGTH_SHORT).show();
//                        removeBadge(mybottomNavView,item.getItemId());
//                        viewPager.setCurrentItem(0);
                        break;
                    case R.id.search:
                        //item.setChecked(true);
                        Toast.makeText(Navigation.this, "Add clicked.", Toast.LENGTH_SHORT).show();
//                        removeBadge(mybottomNavView,item.getItemId());
//                        viewPager.setCurrentItem(1);
                        break;
                    case R.id.browse:
                        //item.setChecked(true);
                        Toast.makeText(Navigation.this, "Add clicked.", Toast.LENGTH_SHORT).show();
//                        removeBadge(mybottomNavView,item.getItemId());
//                        viewPager.setCurrentItem(2);

                        break;
                    case R.id.profile:
                        //item.setChecked(true);
                        Toast.makeText(Navigation.this, "Add clicked.", Toast.LENGTH_SHORT).show();
//                        Intent intent = new Intent(Navigation.this, Profile.class);
//                        startActivity(intent);



//                        removeBadge(mybottomNavView,item.getItemId());
//                        viewPager.setCurrentItem(3);
                        break;
                }
                return false;
            }
        });

//        BottomNavigationView mybottomNavView = findViewById(R.id.bottom_navigation2);
//        mybottomNavView.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//
//                switch (item.getItemId()) {
//                    case R.id.heart:
//                        item.setChecked(true);
//                        Toast.makeText(Navigation.this, "Likes clicked.", Toast.LENGTH_SHORT).show();
////                        removeBadge(mybottomNavView,item.getItemId());
////                        viewPager.setCurrentItem(0);
//                        break;
//                    case R.id.search:
//                        item.setChecked(true);
//                        Toast.makeText(Navigation.this, "Add clicked.", Toast.LENGTH_SHORT).show();
////                        removeBadge(mybottomNavView,item.getItemId());
////                        viewPager.setCurrentItem(1);
//                        break;
//                    case R.id.browse:
//                        item.setChecked(true);
//                        Toast.makeText(Navigation.this, "Add clicked.", Toast.LENGTH_SHORT).show();
////                        removeBadge(mybottomNavView,item.getItemId());
////                        viewPager.setCurrentItem(2);
//
//                        break;
//                    case R.id.profile:
//                        item.setChecked(true);
//                        Toast.makeText(Navigation.this, "Add clicked.", Toast.LENGTH_SHORT).show();
//                        Intent intent = new Intent(getApplicationContext(), Profile.class);
//                        startActivity(intent);
//
//
////                        removeBadge(mybottomNavView,item.getItemId());
////                        viewPager.setCurrentItem(3);
//                        break;
//                }
//                return false;
//            }
//        });


//        here we listen to viewpager moves and set navigations items checked or not

//        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
//            @Override
//            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//
//            }
//
//            @Override
//            public void onPageSelected(int position) {
//                if (prevMenuItem != null)
//                    prevMenuItem.setChecked(false);
//
//                else
//                    mybottomNavView.getMenu().getItem(0).setChecked(false);
//
//                mybottomNavView.getMenu().getItem(position).setChecked(true);
//                removeBadge(mybottomNavView,mybottomNavView.getMenu().getItem(position).getItemId());
//                prevMenuItem = mybottomNavView.getMenu().getItem(position);
//            }
//
//            @Override
//            public void onPageScrollStateChanged(int state) {
//
//            }
//        });
//
//    }

//    //removing badges
//    public static void removeBadge(BottomNavigationView bottomNavigationView, @IdRes int itemId) {
//        BottomNavigationItemView itemView = bottomNavigationView.findViewById(itemId);
//        if (itemView.getChildCount() == 3) {
//            itemView.removeViewAt(2);
//        }
    }

}
