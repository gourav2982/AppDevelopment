package com.example.assigne.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.assigne.R;
import com.example.assigne.adapter.CardAdapter;
import com.example.assigne.adapter.SlideViewPagerAdapter;
import com.example.assigne.adapter.ViewPagerAdapter;
import com.example.assigne.model;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;

import java.util.ArrayList;
import java.util.List;


public class Privacy extends Fragment {


    public Privacy() {
    }
    RecyclerView recyclerview ;
    List<model> items;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_privacy,container,false);
        items =  new ArrayList<model>();
        recyclerview = view.findViewById(R.id.recyclerView);

        items.add(new model("Settings","Prevent uninstalling of force-stop application",R.drawable.setting__1_));
        items.add(new model("Private Notification","Protect notification of locked apps",R.drawable.bell));
        items.add(new model("Google Play Store","Prevent installing or uninstalling application",R.drawable.play_store));
        items.add(new model("Chrome UI","Prevent watch recent apps",R.drawable.chrome));
        items.add(new model("Contacts","System application",R.drawable.contact));
        items.add(new model("Gmail","System application",R.drawable.gmail));
        items.add(new model("Private Notification","Protect notification of locked apps",R.drawable.bell));
        items.add(new model("Settings","Prevent uninstalling of force-stop application",R.drawable.setting__1_));
        items.add(new model("Settings","Prevent uninstalling of force-stop application",R.drawable.setting__1_));
        items.add(new model("Private Notification","Protect notification of locked apps",R.drawable.bell));
        items.add(new model("Google Play Store","Prevent installing or uninstalling application",R.drawable.play_store));
        items.add(new model("Chrome UI","Prevent watch recent apps",R.drawable.chrome));
        items.add(new model("Contacts","System application",R.drawable.contact));
        items.add(new model("Gmail","System application",R.drawable.gmail));
        items.add(new model("Private Notification","Protect notification of locked apps",R.drawable.bell));
        items.add(new model("Settings","Prevent uninstalling of force-stop application",R.drawable.setting__1_));

        recyclerview.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerview.setAdapter(new CardAdapter(getContext(),items));




        return view;

    }




    }

