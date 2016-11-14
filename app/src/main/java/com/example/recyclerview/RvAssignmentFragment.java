package com.example.recyclerview;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.recyclerview.base.BaseFragment;
import com.example.recyclerview.presenter.MainPresenter;
import com.example.recyclerview.view.MainView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by HLKim on 2016-10-16.
 * <p>
 * MVP Design Pattern 1st week Assignment (Recycler View)
 * Show 100 items on the list before adapting MVP pattern.
 */

public class RvAssignmentFragment extends BaseFragment implements MainView {

    @Bind(R.id.rvAssignment_recyclerView)
    RecyclerView recyclerView;

    private MainPresenter mPresenter;

    @Override
    protected int getLayoutRes() {
        return R.layout.fragment_rv_assignment;
    }

    @Override
    protected void onCreateView() {
        mPresenter = new MainPresenter(getContext(), this);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(mPresenter.getAdapter());
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @Override
    public void makeToast(String message) {
        Toast.makeText(getContext(), message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setPresenter(MainPresenter presenter) {
        mPresenter.setData();
        recyclerView.addOnItemTouchListener(mPresenter.getOnItemTouchListener());
    }
}
