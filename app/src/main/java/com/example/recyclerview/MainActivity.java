package com.example.recyclerview;

import android.widget.RelativeLayout;

import com.example.recyclerview.base.BaseActivity;

import butterknife.Bind;

public class MainActivity extends BaseActivity {

    @Bind(R.id.activityMain_container)
    RelativeLayout mainContainer;

    @Override
    protected int getLayoutRes() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate() {
        addFragment(R.id.activityMain_container, new RvAssignmentFragment());
    }
}
