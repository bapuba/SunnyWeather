package com.sunnyweather.android;

import android.app.Application;
import android.content.Context;


public class SunnyWeatherApplication extends Application {
    public static Context context;
    @Override
    public void onCreate() {
        super.onCreate();
    }
    public static Context getContext(){
        return context;
    }
    public static final String TOKEN="IDGvYnBDeCIJLWk8";
}
