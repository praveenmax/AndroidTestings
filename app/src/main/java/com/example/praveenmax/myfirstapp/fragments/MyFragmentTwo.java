package com.example.praveenmax.myfirstapp.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.praveenmax.myfirstapp.R;

/**
 * Created by PraveenMax on 07-07-2017.
 */

public class MyFragmentTwo extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle b)
    {
        return inflater.inflate(R.layout.my_fragment_two, container, false);
    }
}
