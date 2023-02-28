package com.example.assigne.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.assigne.fragment.Privacy;
import com.example.assigne.fragment.Slide1;
import com.example.assigne.fragment.Slide2;
import com.example.assigne.fragment.Slide3;

public class SlideViewPagerAdapter extends FragmentStateAdapter {


    private String[] Stitles = new String[]{"hi","bye","why"};

    public SlideViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new Slide1();
            case 1:
                return new Slide2();
            case 2:
                return new Slide3();
        }
        return new Slide1();

    }

    @Override
    public int getItemCount() {
        return Stitles.length;
    }
}
