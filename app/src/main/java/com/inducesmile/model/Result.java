package com.inducesmile.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Result {


    @SerializedName("notice_list")
    private ArrayList<ApiObject> noticeList= null;


    public ArrayList<ApiObject>getNoticeArrayList(){
        return noticeList;
    }


    public void setNoticeArrayList(ArrayList<ApiObject> noticeArrayList){
        this.noticeList = noticeArrayList;
    }
}
