package com.inducesmile.network;

import com.inducesmile.my_interface.RetrofitInterface;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

public class ApiUtil {

    private static final String BASE_URL = "http://www.mocky.io/";





    public static RetrofitInterface getServiceClass(){
        return RetrofitAPI.getRetrofit(BASE_URL).create(RetrofitInterface.class);
    }
}
