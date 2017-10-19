package com.example.netpos.tablayoutviewpager.classes;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.netpos.tablayoutviewpager.fragments.FragmentA;
import com.example.netpos.tablayoutviewpager.fragments.FragmentB;
import com.example.netpos.tablayoutviewpager.fragments.FragmentC;

/**
 * Created by NetPOS on 11/10/2017.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {

    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                FragmentA tab1 = new FragmentA();
                return tab1;
            case 1:
                FragmentB tab2 = new FragmentB();
                return tab2;
            case 2:
                FragmentC tab3 = new FragmentC();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
