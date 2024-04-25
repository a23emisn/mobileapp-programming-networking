package com.example.networking;

import com.google.gson.annotations.SerializedName;

public class Mountain {
    private String ID;
    private String name;
    @SerializedName("cost")
    private int feet;
    @SerializedName("size")
    private int meter;

    public Mountain(String ID, String name, int feet, int meter) {
        this.ID = ID;
        this.name = name;
        this.feet = feet;
        this.meter = meter;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getFeet() {
        return feet;
    }

    public int getMeter() {
        return meter;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public void setMeter(int meter) {
        this.meter = meter;
    }
}
