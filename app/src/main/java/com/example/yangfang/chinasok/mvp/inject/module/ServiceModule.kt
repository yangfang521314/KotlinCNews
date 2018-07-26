package com.example.yangfang.chinasok.mvp.inject.module

import com.example.yangfang.chinasok.mvp.http.CommonRetrofit
import com.example.yangfang.chinasok.mvp.http.RequestApi
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * created by yf on 2018/7/25.
 */
@Module
class ServiceModule {

    @Singleton
    @Provides
    fun providerRequestApi(baseRetrofit: CommonRetrofit): RequestApi {
        return baseRetrofit.retrofit.create(RequestApi::class.java)
    }
}