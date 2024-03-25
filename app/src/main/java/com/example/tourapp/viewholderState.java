package com.example.tourapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
public class viewholderState extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView nameview, stateID;
    public viewholderState(@NonNull View itemView) {
        super(itemView);

        imageView = itemView.findViewById(R.id.imageview);
        nameview = itemView.findViewById(R.id.text);
        stateID = itemView.findViewById(R.id.stateID);
    }

}