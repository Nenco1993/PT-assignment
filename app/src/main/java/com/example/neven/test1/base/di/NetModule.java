package com.example.neven.test1.base.di;

import com.example.neven.test1.base.RestAPI;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Neven on 4.9.2017..
 */
@Module
public class NetModule {

    @Provides
    @Singleton
    Retrofit provideRetrofit() {
        return new Retrofit.Builder()
                .baseUrl("http://nflarrest.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    @Provides
    @Singleton
    RestAPI provideApi(Retrofit retrofit) {
        return retrofit.create(RestAPI.class);
    }
}
