package com.example.less4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> {
    ArrayList<String> data=new ArrayList<String>(){{
        add("Test 1");
        add("Test 2");
        add("Test 3");
        add("Test 1");
        add("Test 2");
        add("Test 3");
        add("Test 1");
        add("Test 2");
        add("Test 3");
    }};
    IOnclickListener listener;
    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View v=layoutInflater.inflate(R.layout.viewholder_main,parent,false);
MainViewHolder vh=new MainViewHolder(v);
vh.listener=listener;
        return new MainViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.textView.setText(data.get(position));

    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
