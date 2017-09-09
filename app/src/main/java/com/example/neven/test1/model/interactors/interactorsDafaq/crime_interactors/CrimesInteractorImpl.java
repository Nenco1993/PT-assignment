package com.example.neven.test1.model.interactors.interactorsDafaq.crime_interactors;

import com.example.neven.test1.base.base_interactor.BaseInteractorImpl;
import com.example.neven.test1.model.interactors.interactorsDafaq.listener.CrimesListener;
import com.example.neven.test1.base.RestAPI;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Neven on 4.9.2017..
 */

public class CrimesInteractorImpl extends BaseInteractorImpl implements CrimesInteractor {

    private RestAPI api;

    @Inject
    public CrimesInteractorImpl(RestAPI api) {
        this.api = api;
    }

    @Override
    public void downloadCrimes(CrimesListener listener) {

        addObserver(api.getCrimes().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        listener::onSuccess,
                        throwable -> {
                            throwable.printStackTrace();
                            listener.onFailure();
                        }
                ));
    }
}
