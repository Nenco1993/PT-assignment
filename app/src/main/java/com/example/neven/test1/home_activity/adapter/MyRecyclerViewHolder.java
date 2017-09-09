package com.example.neven.test1.home_activity.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.neven.test1.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Neven on 5.9.2017..
 */

public class MyRecyclerViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.tv_alphabet_letter)
    TextView tvText;


    public MyRecyclerViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void setText(String text) {
        tvText.setText(text);
    }
}
