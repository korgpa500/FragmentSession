package com.example.yousryelwrdany.fragmentsession;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yousryelwrdany.fragmentsession.R;

/**
 * Created by Yousry Elwrdany on 19/03/2018.
 */

public class FragA extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.frag_a,container,false);
    }
}
