package com.application.admin.mycameraapplication;

import android.app.Application;
import android.content.Context;
import android.util.DisplayMetrics;

/**
 * Created by admin on 2017/9/20.
 */

public class App extends Application {
    public static int mScreenWidth = 0;
    public static int mScreenHeight = 0;

    public static App instance;
    private static Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        DisplayMetrics mDisplayMetrics = getApplicationContext().getResources()
                .getDisplayMetrics();
        App.mScreenWidth = mDisplayMetrics.widthPixels;
        App.mScreenHeight = mDisplayMetrics.heightPixels;

        context = getApplicationContext();
    }
    //获得全局context的方法
    public static Context getContext(){
        return context;
    }

}
