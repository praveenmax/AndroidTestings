package com.example.praveenmax.myfirstapp.recyclerviewtest;

/**
 * Created by PraveenMax on 04-07-2017.
 */
import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.praveenmax.myfirstapp.R;

public class MainRecyclerViewTestActivity extends Activity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter rvAdapter;
    private RecyclerView.LayoutManager rvLayoutManager;
    private String[] mydatasets={"praveen","1","2","3","4","5","6","7","8","9","10","11","12"};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.myrecyclerviewtestlayout);
        recyclerView = (RecyclerView)findViewById(R.id.rv_numbers);

        //set the layout manager
        rvLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(rvLayoutManager);

        //set the adapter for the recycler view
        rvAdapter = new TestAdapter(mydatasets);
        recyclerView.setAdapter(rvAdapter);

    }

}
