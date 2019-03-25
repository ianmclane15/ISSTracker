package com.hfad.pokemonapi;

import com.google.android.gms.maps.model.LatLng;

public class ISS {
    private Double latitude;
    private Double longitude;


    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "ISS{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
