package com.example.assigne;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;

import com.example.assigne.adapter.CardAdapter;
import com.example.assigne.adapter.SlideViewPagerAdapter;
import com.example.assigne.adapter.ViewPagerAdapter;
import com.example.assigne.fragment.Privacy;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    Toolbar toolbar;

    ViewPagerAdapter viewPagerAdapter;
    TabLayout tabLayout;
    ViewPager2 viewPager2;


    SlideViewPagerAdapter SviewPagerAdapter;
    TabLayout StabLayout;
    ViewPager2 SviewPager2;
    private String[] Stitles = new String[]{"","",""};

    DotsIndicator dotLayout;


    androidx.appcompat.app.ActionBarDrawerToggle  mDrawerToggle;
    private String[] titles = new String[]{"Privacy","Protect"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setStatusBarColor(getResources().getColor(R.color.blue));

        mDrawerLayout = (DrawerLayout) findViewById(R.id.my_drawer_layout);

        toolbar = (Toolbar) findViewById(R.id.toolbar);


        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        mDrawerToggle = new androidx.appcompat.app.ActionBarDrawerToggle(this,mDrawerLayout,toolbar,R.string.app_name, R.string.app_name);
        mDrawerToggle.syncState();

        viewPager2 = findViewById(R.id.view_pager);
        tabLayout= findViewById(R.id.tab_layout);
        viewPagerAdapter = new ViewPagerAdapter(this);
        viewPager2.setAdapter(viewPagerAdapter);
        tabLayout.setTabRippleColor(null);
        new TabLayoutMediator(tabLayout,viewPager2,((tab, position) -> tab.setText(titles[position]))).attach();





        SviewPager2 = findViewById(R.id.Slide_view_pager);
        SviewPagerAdapter = new SlideViewPagerAdapter(this);
        SviewPager2.setAdapter(SviewPagerAdapter);
        SviewPager2 =findViewById(R.id.Slide_view_pager);
        dotLayout = findViewById(R.id.dot_indicator);
        SviewPager2.setAdapter(SviewPagerAdapter);

        dotLayout.attachTo(SviewPager2);



    }
    @Override
    public boolean onCreateOptionsMenu( Menu menu ) {

        getMenuInflater().inflate(R.menu.action_bar_icon, menu);
        return super.onCreateOptionsMenu(menu);
    }
}