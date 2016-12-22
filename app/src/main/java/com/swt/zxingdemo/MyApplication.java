package com.swt.zxingdemo;
/**
 * Created by huangzhao on 2016/12/22.
 */
import android.app.Application;

public class MyApplication extends Application {
    private static MyApplication INSTANCE = null;

    public static int widthPixels = 540;// 屏幕宽度
    public static int heightPixels = 888;// 屏幕高度



    public static MyApplication getInstance() {
        return INSTANCE;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        INSTANCE = this;

    }

}
