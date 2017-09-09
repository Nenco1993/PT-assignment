package com.example.neven.test1.model.interactors.interactorsDafaq.listener;

import com.example.neven.test1.base.base_listener.BaseListener;
import com.example.neven.test1.model.data_models.Crimes;

import java.util.List;

/**
 * Created by Neven on 4.9.2017..
 */

public interface CrimesListener extends BaseListener {

    void onSuccess(List<Crimes> listCrimes);
}
