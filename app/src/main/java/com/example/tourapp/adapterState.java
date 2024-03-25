package com.example.tourapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class adapterState extends RecyclerView.Adapter<viewholderState> {

    Context context;
    List<itemState> itemStates;
    selectListener listenerState;

    public adapterState(Context context, List<itemState> itemStates, selectListener listenerState) {
        this.context = context;
        this.itemStates = itemStates;
        this.listenerState = listenerState;
    }

    @NonNull
    @Override
    public viewholderState onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new viewholderState(LayoutInflater.from(context).inflate(R.layout.itemviewstate,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull viewholderState holder, @SuppressLint("RecyclerView") int position) {
        holder.nameview.setText(itemStates.get(position).getName());
        holder.imageView.setImageResource(itemStates.get(position).getImg());
        holder.stateID.setText(itemStates.get(position).getStateID());
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listenerState.onItemClicked(itemStates.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemStates.size();
    }
}