package org.noche.model.places;

import org.noche.model.LiteAbstractEntity;

import javax.persistence.*;

/**
 * Created by Timi on 4/5/2017.
 */
@Entity(name = "Location")
@Table(name = "noche_location")
public class Location extends LiteAbstractEntity {

    /* --- Members --- */

    @Column(name = "lat")
    private double lat;

    @Column(name = "lon")
    private double lon;

    /* --- Constructor --- */

    public Location() {
    }

    public Location(double lat, double lon) {
        this.lat = lat;
        this.lon = lon;
    }

    /* --- Getters/Setters --- */

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }
}
