package com.coolweather.android.util;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePalApplication;
import org.litepal.util.Const;

/**
 * Created by man on 5/11/2017.
 */
public class MyApplication extends Application {

    private static Context mcontext;

    @Override
    public void onCreate() {
        super.onCreate();//教材上没有这句
        mcontext=getApplicationContext();
        LitePalApplication.initialize(mcontext);
    }

    public static Context getComtext(){
        return mcontext;
    }
}


