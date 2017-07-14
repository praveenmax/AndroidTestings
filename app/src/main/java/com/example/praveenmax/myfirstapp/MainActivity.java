package com.example.praveenmax.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * This activity displays all the demos in this app
 */

public class MainActivity extends AppCompatActivity
{
    private RecyclerView rv_ActivityList;
    private RecyclerView.Adapter rvAdapter;

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);

        setContentView(R.layout.main_recyclerviewtest);

        rv_ActivityList = (RecyclerView)findViewById(R.id.rv_activity_items);

        //set the layout manager
        rv_ActivityList.setLayoutManager(new LinearLayoutManager(this));

        //set the adapter
        rv_ActivityList.setAdapter(new MyActivityListAdapter());

    }

}

