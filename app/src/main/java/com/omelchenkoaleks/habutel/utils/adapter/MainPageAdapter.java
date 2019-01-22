package com.omelchenkoaleks.habutel.utils.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.omelchenkoaleks.habutel.ui.fragment.WorldwideFragment;

public class MainPageAdapter extends FragmentPagerAdapter {

    public MainPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = new WorldwideFragment();
        return fragment;
    }

    @Override
    public int getCount() {
        return 1;
    }
}
