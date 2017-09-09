package com.example.neven.test1.home_activity.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.neven.test1.R;

import java.util.ArrayList;
import java.util.List;

public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerViewHolder> {


    private List<String> listItems = new ArrayList<>();


    @Override
    public MyRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.child_crime, parent, false);
        return new MyRecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyRecyclerViewHolder holder, int position) {
        holder.setText(listItems.get(position));
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public void setData(List<String> data) {
        if (data != null && !data.isEmpty()) {
            listItems.clear();
            listItems.addAll(data);
            notifyDataSetChanged();

        }
    }


}
