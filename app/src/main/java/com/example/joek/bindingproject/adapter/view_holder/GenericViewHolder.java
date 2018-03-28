package com.example.joek.bindingproject.adapter.view_holder;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;

import com.example.joek.bindingproject.BR;

/**
 * Created by joek
 * In Teravision Technologies
 */

public class GenericViewHolder extends RecyclerView.ViewHolder {
    private ViewDataBinding binding;
    public GenericViewHolder(ViewDataBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind(Object obj) {
        binding.setVariable(BR.user, obj);
        binding.executePendingBindings();
    }
}
