package com.example.joek.bindingproject;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.joek.bindingproject.adapter.UserAdapter;
import com.example.joek.bindingproject.databinding.ActivityMainBinding;
import com.example.joek.bindingproject.model.User;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        RecyclerView myRV = binding.myRecyclerView;
        LinearLayoutManager llm = new LinearLayoutManager(this);

        myRV.setLayoutManager(llm);
        myRV.setItemViewCacheSize(30);
        myRV.setDrawingCacheEnabled(true);
        myRV.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);

        UserAdapter adapter = new UserAdapter(R.layout.user_info);
        adapter.setData(getData());
        myRV.setAdapter(adapter);
    }

    private List<User> getData() {
        List<User> list = new ArrayList<>();
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        return list;
    }
}
