package com.alemanal.logwinder;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.alemanal.logwinder.databinding.ActivityNavigationBinding;
import com.alemanal.logwinder.main.SectionsPagerAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Navigation extends AppCompatActivity {

    private ActivityNavigationBinding binding;
    private MenuItem prevMenuItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        ActionBar ab = getSupportActionBar();
//        ab.setDisplayHomeAsUpEnabled(true);
        binding = ActivityNavigationBinding.inflate(getLayoutInflater());
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
        BottomNavigationView myBottomNavView = findViewById(R.id.bottom_navigation2);
//
//        BottomNavigationMenuView bottomNavigationMenuView = (BottomNavigationMenuView) myBottomNavView.getChildAt(0);
//        View v = bottomNavigationMenuView.getChildAt(2);
//        BottomNavigationItemView itemView = (BottomNavigationItemView) v;
//
//        LayoutInflater.from(this).inflate(R.layout.layot_badge, itemView, true);

        myBottomNavView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.heart:
                        item.setChecked(true);
                        Toast.makeText(Navigation.this, "Heart clicked", Toast.LENGTH_SHORT).show();
//                        removeBadge(mybottomNavView,item.getItemId());
                        viewPager.setCurrentItem(0);
                        break;
                    case R.id.search:
                        item.setChecked(true);
                        Toast.makeText(Navigation.this, "Browse clicked", Toast.LENGTH_SHORT).show();
//                        removeBadge(mybottomNavView,item.getItemId());
                        viewPager.setCurrentItem(1);
                        break;
                    case R.id.browse:
                        item.setChecked(true);
                        Toast.makeText(Navigation.this, "Search clicked", Toast.LENGTH_SHORT).show();
//                        removeBadge(mybottomNavView,item.getItemId());
                        viewPager.setCurrentItem(2);
                        break;
                    case R.id.profile:
                        item.setChecked(true);
                        Toast.makeText(Navigation.this, "Profile clicked", Toast.LENGTH_SHORT).show();
//                        removeBadge(mybottomNavView,item.getItemId());
                        viewPager.setCurrentItem(3);
                        break;
                }
                return false;
            }
        });
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (prevMenuItem != null)
                    prevMenuItem.setChecked(false);
                else myBottomNavView.getMenu().getItem(0).setChecked(false);
                myBottomNavView.getMenu().getItem(position).setChecked(true);
//                removeBadge(mybottomNavView,mybottomNavView.getMenu().getItem(position).getItemId());
                prevMenuItem = myBottomNavView.getMenu().getItem(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
    public static void removeBadge(BottomNavigationView bottomNavigationView, @IdRes int itemId){
        BottomNavigationItemView itemView = bottomNavigationView.findViewById(itemId);
        if (itemView.getChildCount() == 3) {
            itemView.removeViewAt(2);
        }
    }
}