package com.example.neven.test1.home_activity.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.neven.test1.R;
import com.example.neven.test1.home_activity.adapter.MyRecyclerAdapter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class CrimeFragment extends Fragment {

    @BindView(R.id.recyclerViewCrimes)
    RecyclerView recyclerView;


    public CrimeFragment() {
        // Required empty public constructor
    }

    public static CrimeFragment newInstance(ArrayList<String> listItems) {
        CrimeFragment fragment = new CrimeFragment();
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("listItems", listItems);
        fragment.setArguments(bundle);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_crime, container, false);
        ButterKnife.bind(this, view);

        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(manager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        MyRecyclerAdapter adapter = new MyRecyclerAdapter();

        if (getArguments() != null) {
            ArrayList<String> listItems = getArguments().getStringArrayList("listItems");
            adapter.setData(listItems);
            recyclerView.setAdapter(adapter);
        }


        return view;
    }

}
