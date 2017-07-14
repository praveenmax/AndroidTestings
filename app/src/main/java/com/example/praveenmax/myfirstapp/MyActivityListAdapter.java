package com.example.praveenmax.myfirstapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.praveenmax.myfirstapp.activityswitcher.MainActivitySwitcher;
import com.example.praveenmax.myfirstapp.fragments.MainFragmentActivity;
import com.example.praveenmax.myfirstapp.recyclerviewtest.MainRecyclerViewTestActivity;
import com.example.praveenmax.myfirstapp.sharedpref.MainSharedPrefActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PraveenMax on 11-07-2017.
 */

public class MyActivityListAdapter extends RecyclerView.Adapter<MyActivityListAdapter.MyViewHolder>
{


    public List<ActivityListModel> activityList = new ArrayList<>();

    //Add new classes here
    public MyActivityListAdapter()
    {
        activityList.add(new ActivityListModel(MainFragmentActivity.class, "Fragment Test"));
        activityList.add(new ActivityListModel(MainActivitySwitcher.class, "ActivitySwitcher Test"));
        activityList.add(new ActivityListModel(MainRecyclerViewTestActivity.class, "RecyclerView Test"));
        activityList.add(new ActivityListModel(MainSharedPrefActivity.class, "SharedPref Test"));
    }

    //Custom viewholder class.
    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView tv_item;
        private Context context;

        public MyViewHolder(TextView v, Context c)
        {
            super(v);
            this.tv_item = v;
            this.context = c;
            tv_item.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

            Toast.makeText(this.context,"Item selected : "+ tv_item.getText(), Toast.LENGTH_SHORT).show();
            Log.d("Praveenmax", "Item selected : "+ tv_item.getText());

            String currentTextViewValue = ((TextView)v).getText().toString();

            for(ActivityListModel model :  activityList)
            {
                if( currentTextViewValue == model.getActivityName()) {
                    Intent intent = new Intent(this.context, model.getActivityClass());
                    this.context.startActivity(intent);

                    Log.d("PraveenMax", "New activity started: "+currentTextViewValue);
                    break;
                }

            }
        }
    }

    //Creates  a viewholder for a single item in the recyclerview list
    @Override
    public MyActivityListAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        TextView tv = (TextView) LayoutInflater.from(parent.getContext()).
                    inflate(R.layout.my_view_item,parent,false);

        MyViewHolder vh = new MyViewHolder(tv,parent.getContext());

        return vh;

    }

    @Override
    public void onBindViewHolder(MyActivityListAdapter.MyViewHolder holder, int position) {
        holder.tv_item.setText(activityList.get(position).getActivityName());
    }


    @Override
    public int getItemCount()
    {
        return activityList.size();
    }

}
