package com.inducesmile.main_activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.inducesmile.adapter.NewAdapter;
import com.inducesmile.model.ApiObject;
import com.inducesmile.network.ApiUtil;
import com.inducesmile.retrofit2.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private final String TAG = MainActivity.class.getSimpleName();

    private RecyclerView recyclerView;
    private MainContract.presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new MainPresenterImpl(this,new GetNoticeIntractorImpl());
        presenter.requestDataFromServer();

    }
}

    /*
        recyclerView = (RecyclerView) findViewById(R.id.recycler_id);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        */
/*
        ApiUtil.getServiceClass().getAllPost().enqueue(new Callback<List<ApiObject>>() {
            @Override
            public void onResponse(Call<List<ApiObject>> call, Response<List<ApiObject>> response) {
                if(response.isSuccessful()){
                    List<ApiObject> postList = response.body();
                  Log.i(TAG, "R_count00 " + postList.size());
                  NewAdapter adapter = new NewAdapter(getApplicationContext(), postList);
                  recyclerView.setAdapter(adapter);
                }
            }
            @Override
            public void onFailure(Call<List<ApiObject>> call, Throwable t) {
                //showErrorMessage();
                 Log.d(TAG, "error loading from API");
            }
        });
        */