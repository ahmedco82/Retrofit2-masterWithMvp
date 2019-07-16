package com.inducesmile.my_interface;


;

import com.inducesmile.model.ApiObject;
import com.inducesmile.model.NoticeList;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitInterface {
    @GET("v2/5a96abc232000057005e2ed7")
    public Call<List<NoticeList>> getAllPost();
}
