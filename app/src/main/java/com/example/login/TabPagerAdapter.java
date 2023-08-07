package com.example.login;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabPagerAdapter extends FragmentPagerAdapter {

    public TabPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new signFragment();
            case 1:
                return new loginFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2; // Number of tabs
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Set tab titles (optional)
        switch (position) {
            case 0:
                return "Log in";
            case 1:
                return "Sign up";
            default:
                return null;
        }
    }
}
