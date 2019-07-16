package com.inducesmile.main_activity;

import android.content.Context;
import android.util.Log;

import com.inducesmile.adapter.NewAdapter;
import com.inducesmile.model.ApiObject;
import com.inducesmile.model.NoticeList;
import com.inducesmile.network.ApiUtil;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static android.content.ContentValues.TAG;

public class GetNoticeIntractorImpl implements MainContract.GetNoticeIntractor {
    List<ApiObject> list = new ArrayList<>();
    @Override
    public void getNoticeArrayList(final OnFinishedListener onFinishedListener) {
        ApiUtil.getServiceClass().getAllPost().enqueue(new Callback<List<NoticeList>>() {
            @Override
            public void onResponse(Call<List<NoticeList>> call, Response<List<NoticeList>> response) {
                if(response.isSuccessful()){
                // onFinishedListener.onFinished(response.body().get(0).getNoticeArrayList());
               onFinishedListener.onFinished(response.body().get(0).getNoticeArrayList());
                //Log.i("oppp", "API"+response.body().get(0).getNoticeArrayList());

              }
            }
            @Override
            public void onFailure(Call<List<NoticeList>> call , Throwable t) {
                //showErrorMessage();
                Log.d(TAG, "error loading from API");
            }
        });
    }

}



        /** Create handle for the RetrofitInstance interface*/
        //  RetrofitInterface apiCall = ApiUtil.getServiceClass();
        /*
        RetrofitInterface apiCall = ApiClient.getInterface();
        Call<NoticeList> call = apiCall.getAllPost();
        call.enqueue(new Callback<NoticeList>(){
            @Override
            public void onResponse(Call<NoticeList> call, Response<NoticeList>response) {
                if(response.isSuccessful()){
                 // onFinishedListener.onFinished(response.body().getNoticeArrayList());
                }
            }
            @Override
            public void onFailure(Call<NoticeList> call,Throwable t){
                Log.i("TAGTS00:", "R"+t.getMessage());
             }
         });
     }
     */


  //----------------------------------------------------------------- // ------------------
        /*
        ApiUtil.getServiceClass().getAllPost().enqueue(new Callback<List<NoticeList>>() {
            @Override
            public void onResponse(Call<List<NoticeList>> call, Response<List<NoticeList>> response) {
                // response.body().get(0).getNoticeArrayList().toString();
                if (response.isSuccessful()) {
                    List<NoticeList> postList = response.body();
                    Log.i("TAGT-:", "Returned count " + postList.size());
                    // NewAdapter adapter = new NewAdapter(getApplicationContext(), postList);
                    onFinishedListener.onFinished(response.body()));
                    //recyclerView.setAdapter(adapter);
                }
            }
            @Override
            public void onFailure(Call<List<NoticeList>> call, Throwable t) {
                //showErrorMessage();
                Log.i("TAG :", "error loading from API");
                //onFinishedListener.onFinished(response.body().get(0).getTitle().trim().toString());
            }
        });
    }
}
*/
