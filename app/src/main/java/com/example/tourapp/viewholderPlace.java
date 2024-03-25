package com.example.tourapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class viewholderPlace extends RecyclerView.ViewHolder {
    TextView id,name;
    ImageView img;

    public viewholderPlace(@NonNull View itemView) {
        super(itemView);
        id = itemView.findViewById(R.id.placeID);
        name = itemView.findViewById(R.id.text);
        img = itemView.findViewById(R.id.imageview);
    }
}
