package com.example.neven.test1.home_activity.di;

import com.example.neven.test1.base.scopes.ActivityScope;
import com.example.neven.test1.home_activity.HomeContract;
import com.example.neven.test1.home_activity.adapter.CrimesAdapter;
import com.example.neven.test1.home_activity.models.PagerData;
import com.example.neven.test1.home_activity.models.PagerStuff;
import com.example.neven.test1.model.interactors.interactorsDafaq.crime_interactors.CrimesInteractor;
import com.example.neven.test1.model.interactors.interactorsDafaq.crime_interactors.CrimesInteractorImpl;
import com.example.neven.test1.home_activity.presenter.CrimesPresenterImpl;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Neven on 4.9.2017..
 */

@Module
public class CrimesModule {

    private HomeContract.View view;

    public CrimesModule(HomeContract.View view) {
        this.view = view;
    }

    @Provides
    @ActivityScope
    HomeContract.Presenter provideCrimesPresenter(CrimesPresenterImpl presenter) {
        return presenter;
    }

    @Provides
    @ActivityScope
    CrimesInteractor provideCrimesInteractor(CrimesInteractorImpl interactor) {
        return interactor;
    }

    @Provides
    @ActivityScope
    HomeContract.View provideView() {
        return view;
    }

    @Provides
    @ActivityScope
    CrimesAdapter provideAdapter() {
        return new CrimesAdapter();
    }

    @Provides
    @ActivityScope
    PagerData providePagerData(){

        return new PagerData();
    }

    @Provides
    @ActivityScope
    PagerStuff providePagerStuff(){

        return new PagerStuff();
    }
}
