package com.tex.texandroid;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Tavish on 02-Oct-16.
 */
public class MyFragmentPagerAdapter extends FragmentPagerAdapter {
    private String tabTitles[]= new String[]{"Buy", "Sell"};
    private Context context;
    public MyFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0)
            return new BuyFragment();
        else if(position==1)
            return new SellFragment();
        else
            return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }

    @Override
    public int getCount() {
        return 2;
    }
}
