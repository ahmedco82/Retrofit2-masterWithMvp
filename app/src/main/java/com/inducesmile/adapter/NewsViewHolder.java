package com.inducesmile.adapter;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.inducesmile.retrofit2.R;

public class NewsViewHolder extends RecyclerView.ViewHolder {

    public TextView title;
    public TextView description;

    public NewsViewHolder(View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.post_title);
        description = (TextView) itemView.findViewById(R.id.post_description);
    }
}
