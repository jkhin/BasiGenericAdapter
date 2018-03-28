package com.example.joek.bindingproject.adapter;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.joek.bindingproject.adapter.view_holder.GenericViewHolder;
import com.example.joek.bindingproject.model.User;

import java.util.List;

/**
 * Created by joek
 * In Teravision Technologies
 */

public abstract class BaseAdapter
        extends RecyclerView.Adapter<GenericViewHolder> {
    protected List<User> items;

    @Override
    public GenericViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =
                LayoutInflater.from(parent.getContext());
        ViewDataBinding binding =
                DataBindingUtil.inflate(
                        layoutInflater, viewType, parent, false);
        return new GenericViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(GenericViewHolder holder, int position) {
        Object obj = getItemForPosition(position);
        holder.bind(obj);
    }

    @Override
    public int getItemCount() {
        return items != null ? items.size() : 0;
    }

    @Override
    public int getItemViewType(int position) {
        return getLayoutIdForPosition(position);
    }

    protected abstract Object getItemForPosition(int pos);

    protected abstract int getLayoutIdForPosition(int position);

    public void updateAllData(List<User> data) {
        items.clear();
        int initPos = items.size();
        items.addAll(data);
        notifyItemRangeChanged(initPos, items.size());
    }

    public void setData(List<User> data) {
        int initPos = items.size();
        items.addAll(data);
        notifyItemRangeChanged(initPos, items.size());
    }
}
