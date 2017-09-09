package com.example.neven.test1.base.base_activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.neven.test1.base.MyApplication;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((MyApplication)getApplication()).appComponent.inject(this);
    }
}
