package com.example.neven.test1.base.base_interactor;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * Created by Neven on 5.9.2017..
 */

public class BaseInteractorImpl {

    private CompositeDisposable compositeDisposable;

    public void addObserver(Disposable disposable) {
        if (compositeDisposable == null || compositeDisposable.isDisposed())
            compositeDisposable = new CompositeDisposable();
        compositeDisposable.add(disposable);
    }

    public void dispose() {
        compositeDisposable.dispose();
    }
}
