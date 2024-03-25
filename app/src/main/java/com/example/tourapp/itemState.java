package com.example.tourapp;

public class itemState {
    String stateID;
    String name;
//    String email;
    int img;

    public itemState(String stateID, String name, int img) {
        this.name = name;
        this.stateID = stateID;
        this.img = img;
    }

    public String getStateID() {
        return stateID;
    }

    public void setStateID(String stateID) {
        this.stateID = stateID;
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

