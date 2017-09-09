package com.example.neven.test1.home_activity.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.neven.test1.home_activity.fragments.CrimeFragment;
import com.example.neven.test1.home_activity.models.PagerStuff;

import java.util.List;

/**
 * Created by Neven on 5.9.2017..
 */

public class MyPagerAdapter extends FragmentStatePagerAdapter {

    private List<PagerStuff> listPagerStuff;


    public MyPagerAdapter(FragmentManager fm, List<PagerStuff> listPagerStuff) {
        super(fm);
        this.listPagerStuff = listPagerStuff;
    }

    @Override
    public Fragment getItem(int position) {
        return CrimeFragment.newInstance(listPagerStuff.get(position).listItems);
    }

    @Override
    public int getCount() {
        return listPagerStuff.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return listPagerStuff.get(position).title;
    }


}
