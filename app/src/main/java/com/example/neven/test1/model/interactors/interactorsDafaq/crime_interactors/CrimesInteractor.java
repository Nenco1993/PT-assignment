package com.example.neven.test1.model.interactors.interactorsDafaq.crime_interactors;

import com.example.neven.test1.base.base_interactor.BaseIteractor;
import com.example.neven.test1.model.interactors.interactorsDafaq.listener.CrimesListener;

/**
 * Created by Neven on 4.9.2017..
 */

public interface CrimesInteractor extends BaseIteractor{
    void downloadCrimes(CrimesListener listener);
}
