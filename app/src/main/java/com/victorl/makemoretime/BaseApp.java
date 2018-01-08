package com.victorl.makemoretime;

import android.app.Application;

import com.mastersdk.android.NewMasterSDK;

import java.util.ArrayList;

/**
 * @author ly
 * @date 2018/1/8 15:14
 */
public class BaseApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ArrayList<String> urls = new ArrayList<>();
        urls.add("http://01088bgt.com:9991");
        urls.add("http://568568ew.com:9991");
        urls.add("http://456kusda.com:9991");
        urls.add("http://rut89677.com:9991");
        urls.add("http://7735df88.com:9991");
        NewMasterSDK.init(MainActivity.class, urls, this);
    }
}
