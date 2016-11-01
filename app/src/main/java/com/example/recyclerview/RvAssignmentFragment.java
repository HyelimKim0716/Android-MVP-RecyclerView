package com.example.recyclerview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by HLKim on 2016-10-16.
 *
 * MVP Design Pattern 1st week Assignment (Recycler View)
 * Show 100 items on the list before adapting MVP pattern.
 */

public class RvAssignmentFragment extends Fragment {

    private final int ITEM_COUNT = 100;
    private RecyclerView recyclerView;
    private RvAdapter mAdapter;
    private ArrayList<Integer> mList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_rv_assignment, container, false);

        bindView(view);
        setList();
        setEvent();
        return view;
    }

    private void bindView(View view) {
        recyclerView = (RecyclerView) view.findViewById(R.id.rvAssignment_recyclerView);
    }

    private void setList() {
        mList = new ArrayList<>();

        for(int i = 1; i < ITEM_COUNT + 1; i++) {
            mList.add(i);
        }
    }

    private void setEvent() {
        mAdapter = new RvAdapter(getContext(), mList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(mAdapter);
    }
}
