package com.omelchenkoaleks.habutel.utils.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.omelchenkoaleks.habutel.ui.fragment.EasyPayFragment;
import com.omelchenkoaleks.habutel.ui.fragment.StayConnectedFragment;
import com.omelchenkoaleks.habutel.ui.fragment.WorldwideFragment;

public class MainPageAdapter extends FragmentPagerAdapter {

    public MainPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new WorldwideFragment();
        } else if (position == 1) {
            return new EasyPayFragment();
        } else if (position == 2) {
            return new StayConnectedFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
