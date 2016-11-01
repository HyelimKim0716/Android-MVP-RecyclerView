package com.example.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 혜림 on 2016-10-16.
 *
 */

public class RvAdapter extends RecyclerView.Adapter<RvAdapter.ViewHolder> {

    LayoutInflater mInflater;
    ArrayList<Integer> mItemList;

    public RvAdapter(Context context, ArrayList<Integer> itemList) {
        this.mItemList = itemList;

        mInflater = LayoutInflater.from(context);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.rv_assignment_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String item = "item : " + mItemList.get(position);
        holder.tvItem.setText(item);
    }

    @Override
    public int getItemCount() {
        return mItemList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvItem;

        public ViewHolder(View itemView) {
            super(itemView);
            tvItem = (TextView) itemView.findViewById(R.id.rvAssignmentRvItem_tvItem);
        }
    }
}
