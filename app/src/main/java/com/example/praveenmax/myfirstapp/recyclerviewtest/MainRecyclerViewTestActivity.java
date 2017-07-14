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
    private String[] mydatasets=new String[100];

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


        for(int i=0;i<100;i++)
        {
            mydatasets[i]=" Data : "+i;
        }
    }

}
