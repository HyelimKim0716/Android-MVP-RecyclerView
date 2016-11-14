package com.example.recyclerview.presenter;

import android.content.Context;

import com.example.recyclerview.view.BaseView;

/**
 * Created by 혜림 on 2016-10-16.
 *
 */

public class MainPresenter {
    private Context mContext;
    private BaseView mView;

    public MainPresenter (Context context, BaseView view) {
        mContext = context;
        mView = view;
        mView.setPresenter(this);
    }

    
}
