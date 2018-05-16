package com.example.android.quakereport;

import java.util.Date;

/**
 * Created by hudson on 16/05/18.
 */

public class Earthquake {
    float magnitude;

    String location;

    Date date;

    public Earthquake(float magnitude, String location, Date date) {
        this.magnitude = magnitude;
        this.location = location;
        this.date = date;
    }

    public float getMagnitude() {
        return magnitude;
    }

    public String getLocation() {
        return location;
    }

    public Date getDate() {
        return date;
    }
}
