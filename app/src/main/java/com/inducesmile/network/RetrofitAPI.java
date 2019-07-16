package com.inducesmile.network;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitAPI {

    private static OkHttpClient getOkHttpClient(){
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.NONE);
        OkHttpClient okClient = new OkHttpClient.Builder()
                .addInterceptor(logging)
                .build();
        return okClient;
    }


    public static Retrofit getRetrofit(String url) {
        Gson gson = new GsonBuilder().setLenient().create();




        return new Retrofit.Builder()
                .baseUrl(url).client(getOkHttpClient())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
    }

}
