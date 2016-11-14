package com.example.recyclerview.presenter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

import com.example.recyclerview.RvAdapter;
import com.example.recyclerview.view.MainView;

import java.util.ArrayList;

/**
 * Created by 혜림 on 2016-10-16.
 *
 */

public class MainPresenter {
    private Context mContext;
    private MainView mView;
    private RvAdapter mAdapter;
    private ArrayList<Integer> mList;

    private final int ITEM_COUNT = 100;

    public MainPresenter (Context context, MainView view) {
        mContext = context;
        mView = view;
        mView.setPresenter(this);
    }

    public RvAdapter getAdapter() {
        if (mAdapter == null)
            mAdapter = new RvAdapter(mContext, mList);

        return mAdapter;
    }

    public void setData() {
        mList = new ArrayList<>();

        for (int i = 1; i < ITEM_COUNT + 1; i++) {
            mList.add(i);
        }

        mAdapter.notifyDataSetChanged();
    }

    public RecyclerView.OnItemTouchListener getOnItemTouchListener() {
        RecyclerView.OnItemTouchListener itemTouchListener = new RecyclerView.OnItemTouchListener() {
            @Override
            public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
                return false;
            }

            @Override
            public void onTouchEvent(RecyclerView rv, MotionEvent e) {
                mView.makeToast("Item touched");
            }

            @Override
            public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

            }
        };

        return itemTouchListener;
    }
}
