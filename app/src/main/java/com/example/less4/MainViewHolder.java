package com.example.less4;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainViewHolder extends RecyclerView.ViewHolder {
    TextView textView;
    IOnclickListener listener;
    public MainViewHolder(@NonNull final View itemView) {
        super(itemView);
        textView=itemView.findViewById(R.id.vh_textView);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("ololo","VH on click");
                listener.onClick(textView.getText().toString());
            }
        });
    }
}
