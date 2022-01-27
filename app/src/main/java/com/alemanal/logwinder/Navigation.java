package com.alemanal.logwinder;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.MenuItem;
import android.widget.Toast;

import com.alemanal.logwinder.ui.main.SectionsPagerAdapter;
import com.alemanal.logwinder.databinding.ActivityNavigation2Binding;

public class Navigation extends AppCompatActivity {

    private ActivityNavigation2Binding binding;
    private MenuItem prevMenuItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityNavigation2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(sectionsPagerAdapter);
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
        BottomNavigationView mybottomNavView = findViewById(R.id.bottom_navigation);

        // crear badges
        /*BottomNavigationMenuView bottomNavigationMenuView =
                (BottomNavigationMenuView) mybottomNavView.getChildAt(0);
        View v = bottomNavigationMenuView.getChildAt(2);
        BottomNavigationItemView itemView = (BottomNavigationItemView) v;

        LayoutInflater.from(this)
                .inflate(R.layout.layout_badge, itemView, true);*/


        mybottomNavView.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.heart:
                        item.setChecked(true);
                        Toast.makeText(Navigation.this, "Likes clicked.", Toast.LENGTH_SHORT).show();
//                        removeBadge(mybottomNavView,item.getItemId());
//                        viewPager.setCurrentItem(0);
                        break;
                    case R.id.search:
                        item.setChecked(true);
                        Toast.makeText(Navigation.this, "Add clicked.", Toast.LENGTH_SHORT).show();
//                        removeBadge(mybottomNavView,item.getItemId());
//                        viewPager.setCurrentItem(1);
                        break;
                    case R.id.browse:
                        item.setChecked(true);
                        Toast.makeText(Navigation.this, "Add clicked.", Toast.LENGTH_SHORT).show();
//                        removeBadge(mybottomNavView,item.getItemId());
//                        viewPager.setCurrentItem(2);

                        break;
                    case R.id.profile:
                        item.setChecked(true);
                        Toast.makeText(Navigation.this, "Add clicked.", Toast.LENGTH_SHORT).show();
//                        removeBadge(mybottomNavView,item.getItemId());
//                        viewPager.setCurrentItem(3);
                        break;
                }
                return false;
            }
        });


//        here we listen to viewpager moves and set navigations items checked or not

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (prevMenuItem != null)
                    prevMenuItem.setChecked(false);

                else
                    mybottomNavView.getMenu().getItem(0).setChecked(false);

                mybottomNavView.getMenu().getItem(position).setChecked(true);
                removeBadge(mybottomNavView,mybottomNavView.getMenu().getItem(position).getItemId());
                prevMenuItem = mybottomNavView.getMenu().getItem(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

    //removing badges
    public static void removeBadge(BottomNavigationView bottomNavigationView, @IdRes int itemId) {
        BottomNavigationItemView itemView = bottomNavigationView.findViewById(itemId);
        if (itemView.getChildCount() == 3) {
            itemView.removeViewAt(2);
        }
    }
}
