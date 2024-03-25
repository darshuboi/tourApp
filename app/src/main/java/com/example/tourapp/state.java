package com.example.tourapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class state extends AppCompatActivity implements selectListener {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state);

        recyclerView = findViewById(R.id.recyclerview);

        List<itemState> items = new ArrayList<itemState>();

        String[] state = getResources().getStringArray(R.array.state);

        for (int i = 0; i < state.length; i++) {
            items.add(new itemState(String.valueOf(i),state[i], R.drawable.img));
        }

        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recyclerView.setAdapter(new adapterState(getApplicationContext(),items,this));
    }

    @Override
    public void onItemClicked(itemState itemState) {
        startActivity(new Intent(getApplicationContext(),place.class).putExtra("stateName",itemState.getName()).putExtra("stateID",itemState.getStateID()));
        Toast.makeText(this, "StateID:"+itemState.getStateID(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onItemClicked(itemPlace itemPlace) {

    }
};