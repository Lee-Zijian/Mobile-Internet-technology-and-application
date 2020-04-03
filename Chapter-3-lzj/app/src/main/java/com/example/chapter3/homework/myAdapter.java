package com.example.chapter3.homework;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class myAdapter extends RecyclerView.Adapter<myAdapter.MyViewHolder> {
    private final int ItemNum=10;

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item,viewGroup,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.bind(i);
    }

    @Override
    public int getItemCount() {
        return ItemNum;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private final TextView my_tv;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            my_tv=itemView.findViewById(R.id.tv);
        }

        public void bind(int position){
            my_tv.setText("Item "+(position+1));
        }

    }
}