package com.example.neven.test1.base.di;

import com.example.neven.test1.base.base_activity.BaseActivity;
import com.example.neven.test1.home_activity.di.CrimesComponent;
import com.example.neven.test1.home_activity.di.CrimesModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Neven on 4.9.2017..
 */
@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface AppComponent {
    void inject(BaseActivity activity);

    CrimesComponent newCrimesSubComponent(CrimesModule module);

}
