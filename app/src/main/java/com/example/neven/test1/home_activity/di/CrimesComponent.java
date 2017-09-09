package com.example.neven.test1.home_activity.di;

import com.example.neven.test1.home_activity.view.MainActivity;
import com.example.neven.test1.home_activity.di.CrimesModule;
import com.example.neven.test1.base.scopes.ActivityScope;

import dagger.Subcomponent;

/**
 * Created by Neven on 4.9.2017..
 */
@ActivityScope
@Subcomponent(modules = CrimesModule.class)
public interface CrimesComponent {
    void inject(MainActivity activity);
}
