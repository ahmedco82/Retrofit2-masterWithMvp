package com.inducesmile.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class NoticeList {

    @SerializedName("notice_list")
    public Object noticeList;

    public Object getNoticeArrayList() {
        return noticeList;
    }

    public void setNoticeArrayList(Object noticeArrayList) {
        this.noticeList = noticeArrayList;
    }

}