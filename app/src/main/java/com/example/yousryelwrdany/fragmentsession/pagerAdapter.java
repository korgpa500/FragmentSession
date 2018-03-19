package com.example.yousryelwrdany.fragmentsession;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Yousry Elwrdany on 19/03/2018.
 */

public class pagerAdapter extends FragmentPagerAdapter {
    public pagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return new FragA();
            case 1:
                return new FragB();
            case 2:
                return new FragC();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
