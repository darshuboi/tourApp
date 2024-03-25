package com.example.tourapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class adapterPlace extends RecyclerView.Adapter<viewholderPlace> {
    Context context;
    List<itemPlace> itemPlaces;

    selectListener listener;

    public adapterPlace(Context context, List<itemPlace> itemPlaces, selectListener listener) {
        this.context = context;
        this.itemPlaces = itemPlaces;
        this.listener = listener;
    }

    @NonNull
    @Override
    public viewholderPlace onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new viewholderPlace(LayoutInflater.from(context).inflate(R.layout.itemviewplace,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull viewholderPlace holder, @SuppressLint("RecyclerView") int position) {
        holder.name.setText(itemPlaces.get(position).getName());
        holder.id.setText(itemPlaces.get(position).getPlaceID());
        holder.img.setImageResource(itemPlaces.get(position).getImg());
        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onItemClicked(itemPlaces.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemPlaces.size();
    }
}
