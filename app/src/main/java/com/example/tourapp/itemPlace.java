package com.example.tourapp;

public class itemPlace {
    String placeID,name;
    int img;

    public itemPlace(String placeID, String name, int img) {
        this.placeID = placeID;
        this.name = name;
        this.img = img;
    }

    public String getPlaceID() {
        return placeID;
    }

    public void setPlaceID(String placeID) {
        this.placeID = placeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
