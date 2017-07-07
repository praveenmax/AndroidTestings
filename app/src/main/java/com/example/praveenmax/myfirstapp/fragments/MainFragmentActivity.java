package com.example.praveenmax.myfirstapp.fragments;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.praveenmax.myfirstapp.R;

public class MainFragmentActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fragment);
    }

    /*
        On button click,
        This methods dynamically replaces the view container with new fragments
     */
    public void selectFragment(View view)
    {
        Fragment newFragmentInstance = null;

        if(view ==  findViewById(R.id.bt_1))
        {
            newFragmentInstance = new MyFragmentOne();
            Log.d("Praveenmax","Button 1 pressed");
        }

        if(view ==  findViewById(R.id.bt_2))
        {
            newFragmentInstance = new MyFragmentTwo();
            Log.d("Praveenmax","Button 2 pressed");
        }

        //Adding the new fragment using FragmentManager via FragmentTransaction
        if(newFragmentInstance!=null) {
            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_place, newFragmentInstance);
            fragmentTransaction.commit();
        }

    }
}
