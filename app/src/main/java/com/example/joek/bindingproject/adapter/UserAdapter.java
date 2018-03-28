package com.example.joek.bindingproject.adapter;

import java.util.ArrayList;

/**
 * Created by joek
 * In Teravision Technologies
 */

public class UserAdapter extends BaseAdapter {
    private final int layoutId;

    public UserAdapter(int layoutId) {
        this.layoutId = layoutId;
        this.items = new ArrayList<>();
    }


    @Override
    protected Object getItemForPosition(int pos) {
        return items != null && !items.isEmpty() ? items.get(pos) : null;
    }

    @Override
    protected int getLayoutIdForPosition(int position) {
        return layoutId;
    }
}
