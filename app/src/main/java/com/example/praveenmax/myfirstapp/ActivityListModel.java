package com.example.praveenmax.myfirstapp;

/**
 * Created by PraveenMax on 12-07-2017.
 */


public class ActivityListModel
{
    private Class<?> activityClass;
    private String activityName;

    ActivityListModel(Class<?> activityClass, String activityName)
    {
        this.activityClass=activityClass;
        this.activityName=activityName;
    }

    public String getActivityName()
    {
        return this.activityName;
    }

    public Class<?> getActivityClass()
    {
        return this.activityClass;
    }
}
