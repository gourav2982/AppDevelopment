package com.example.assigne.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.assigne.fragment.Privacy;
import com.example.assigne.fragment.Protect;

public class ViewPagerAdapter extends FragmentStateAdapter {

    private String[] titles = new String[]{"Privacy","Protect"};
    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new Privacy();
            case 1:
                return new Protect();
        }
        return new Privacy();
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}
