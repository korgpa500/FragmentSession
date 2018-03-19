package com.example.yousryelwrdany.fragmentsession;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabWidget;

public class tabActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    pagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        viewPager = findViewById(R.id.viewPager);

        tabLayout = findViewById(R.id.btnTabs);
        tabLayout.addTab(tabLayout.newTab().setText("Tab A"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab B"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab C"));

        adapter = new pagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(adapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}
