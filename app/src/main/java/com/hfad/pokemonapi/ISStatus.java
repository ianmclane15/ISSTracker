package com.hfad.pokemonapi;

import com.google.android.gms.maps.model.LatLng;

import java.util.List;

public class ISStatus {
    private String message;
    private int timestamp;
    private ISS iss_position;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public ISS getIss_position() {
        return iss_position;
    }

    public void setIss_position(ISS iss_position) {
        this.iss_position = iss_position;
    }
}
