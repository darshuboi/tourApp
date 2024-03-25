package com.example.tourapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class place extends AppCompatActivity implements selectListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<itemPlace> items = new ArrayList<itemPlace>();

        Intent intent = getIntent();
        String stateName = intent.getStringExtra("stateName");

        Toast.makeText(this, stateName, Toast.LENGTH_SHORT).show();
        String[] place = getResources().getStringArray(R.array.Keral);;

        if(Objects.equals(stateName, "Gujarat")){
            place = getResources().getStringArray(R.array.Gujarat);
        }
        else if (Objects.equals(stateName, "Mahrastra")) {
            place = getResources().getStringArray(R.array.Mahrastra);
        }
        else if (Objects.equals(stateName, "Mumbai")) {
            place = getResources().getStringArray(R.array.Mumbai);
        }


        for (int i = 0; i < place.length ; i++) {
            items.add(new itemPlace(String.valueOf(i),place[i], R.drawable.img));
        }

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new adapterPlace(getApplicationContext(),items,this));
    }

    @Override
    public void onItemClicked(itemState itemState) {

    }

    @Override
    public void onItemClicked(itemPlace itemPlace) {
        startActivity(new Intent(getApplicationContext(),info.class).putExtra("stateName",itemPlace.getName()).putExtra("stateID",itemPlace.getPlaceID()));
        Toast.makeText(this, "PlaceID:"+itemPlace.getPlaceID(), Toast.LENGTH_SHORT).show();
    }
}