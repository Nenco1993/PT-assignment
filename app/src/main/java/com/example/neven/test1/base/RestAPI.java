package com.example.neven.test1.base;

import com.example.neven.test1.model.data_models.Crimes;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by Neven on 4.9.2017..
 */

public interface RestAPI {

    @GET("v1/crime")
    Observable<List<Crimes>> getCrimes();

}
