package com.example.recyclerview;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.recyclerview.presenter.MainPresenter;
import com.example.recyclerview.view.BaseFragment;
import com.example.recyclerview.view.BaseView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by HLKim on 2016-10-16.
 * <p>
 * MVP Design Pattern 1st week Assignment (Recycler View)
 * Show 100 items on the list before adapting MVP pattern.
 */

public class RvAssignmentFragment extends BaseFragment implements BaseView {

    private final int ITEM_COUNT = 100;
    @Bind(R.id.rvAssignment_recyclerView)
    RecyclerView recyclerView;

//    private RecyclerView recyclerView;
    private RvAdapter mAdapter;
    private ArrayList<Integer> mList;

    private MainPresenter mPresenter;
    @Override

    protected int getLayoutRes() {
        return R.layout.fragment_rv_assignment;
    }

    @Override
    protected void onCreateView() {
        mPresenter = new MainPresenter(getContext(), this);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        setAdapter();

    }

    private void setAdapter() {
        if (mAdapter == null) {
            mAdapter = new RvAdapter(getContext(), mList);
            recyclerView.setAdapter(mAdapter);
        }

        mList = new ArrayList<>();

        for (int i = 1; i < ITEM_COUNT + 1; i++) {
            mList.add(i);
        }
    }


    @Override
    public void setPresenter(Object presenter) {

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
