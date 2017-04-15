package org.noche.model.places;

import dto.LocationInfo;
import org.noche.model.LiteAbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Created by Timi on 4/5/2017.
 */
@Entity(name = "Location")
@Table(name = "noche_location", uniqueConstraints = @UniqueConstraint(columnNames = {"lat", "lon"}))
public class Location extends LiteAbstractEntity {

    /* --- Static members --- */

    private static final long serialVersionUID = -214344520439449855L;

    /* --- Members --- */

    @Column(name = "lat")
    private double lat;

    @Column(name = "lon")
    private double lon;

    @Column(name = "city")
    private String city;

    /* --- Constructor --- */

    public Location() {
    }

    public Location(double lat, double lon, String city) {
        this.lat = lat;
        this.lon = lon;
        this.city = city;
    }

    /* --- Public methods --- */

    public LocationInfo getInfo() {
        LocationInfo info = new LocationInfo();
        info.setCity(city);
        info.setLat(lat);
        info.setLon(lon);
        return info;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
