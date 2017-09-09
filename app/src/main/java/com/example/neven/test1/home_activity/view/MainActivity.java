package com.example.neven.test1.home_activity.view;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.Toast;

import com.example.neven.test1.base.MyApplication;
import com.example.neven.test1.R;
import com.example.neven.test1.home_activity.adapter.MyPagerAdapter;
import com.example.neven.test1.home_activity.di.CrimesModule;
import com.example.neven.test1.home_activity.HomeContract;
import com.example.neven.test1.base.base_view.BaseView;
import com.example.neven.test1.home_activity.models.PagerStuff;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

import java.util.List;

public class MainActivity extends AppCompatActivity implements BaseView, HomeContract.View {

    @BindView(R.id.viewPager)
    ViewPager viewPager;

    @BindView(R.id.tabs)
    TabLayout tabLayout;

    @Inject
    HomeContract.Presenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        ((MyApplication) getApplication()).appComponent.newCrimesSubComponent(new CrimesModule(this)).inject(this);
    }


    @Override
    protected void onStart() {
        super.onStart();
        presenter.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
        presenter.onStop();
    }

    @Override
    public void showMyData(List<PagerStuff> listPagerStuff) {

        MyPagerAdapter pagerAdapter = new MyPagerAdapter(getSupportFragmentManager(), listPagerStuff);
        viewPager.setAdapter(pagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

    }

    @Override
    public void showErrorMessage() {
        Toast.makeText(this, getString(R.string.retrofit_error_message), Toast.LENGTH_SHORT).show();
    }


}
