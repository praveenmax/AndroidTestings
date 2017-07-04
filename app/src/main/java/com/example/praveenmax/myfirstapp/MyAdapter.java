package com.example.praveenmax.myfirstapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by PraveenMax on 04-07-2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>
{
    private String[] datasets;

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        TextView v = (TextView) LayoutInflater.from(parent.getContext()).
                        inflate(R.layout.my_view_item,parent,false);

        MyViewHolder vh=new MyViewHolder(v);

        return vh;
    }

    //Replaces the content of the view
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tv.setText(datasets[position]);
    }

    //returns the size of the datasets
    @Override
    public int getItemCount() {
        return datasets.length;
    }

    //Provides a reference to the views
    public static class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView tv;

        public MyViewHolder(TextView v)
        {
            super(v);
            tv=v;
        }
    }

    public MyAdapter(String[] datasets)
    {
        this.datasets = datasets;
    }


}
