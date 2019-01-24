package com.omelchenkoaleks.habutel.ui.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.omelchenkoaleks.habutel.ui.fragment.main_fragments.EasyPayFragment;
import com.omelchenkoaleks.habutel.ui.fragment.main_fragments.StayConnectedFragment;
import com.omelchenkoaleks.habutel.ui.fragment.main_fragments.WorldwideFragment;

public class MainPageAdapter extends FragmentPagerAdapter {
    private static final int PAGE_WORLDWIDE_FRAGMENT = 0;
    private static final int PAGE_EASY_PAY_FRAGMENT = 1;
    private static final int PAGE_STAY_CONNECTED_FRAGMENT = 2;

    public MainPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case PAGE_WORLDWIDE_FRAGMENT:
                return WorldwideFragment.createWorldwideFragment();
            case PAGE_EASY_PAY_FRAGMENT:
                return EasyPayFragment.createEasyPayFragment();
            case PAGE_STAY_CONNECTED_FRAGMENT:
                return StayConnectedFragment.createStayConnectedFragment();

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
