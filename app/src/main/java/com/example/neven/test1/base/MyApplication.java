package com.example.neven.test1.base;

import android.app.Application;
import com.example.neven.test1.base.di.AppComponent;
import com.example.neven.test1.base.di.AppModule;
import com.example.neven.test1.base.di.DaggerAppComponent;


/**
 * Created by Neven on 4.9.2017..
 */

public class MyApplication extends Application {

    public AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(getBaseContext()))
                .build();
    }
}
