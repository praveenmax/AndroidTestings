package com.example.praveenmax.myfirstapp.fragments;

/**
 * Created by PraveenMax on 07-07-2017.
 */

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.praveenmax.myfirstapp.R;

public class MyFragmentOne extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle b)
    {

        return inflater.inflate(R.layout.my_fragment_one, container, false);

    }
}
