package dto;

import java.io.Serializable;

/**
 * Created by Timi on 4/5/2017.
 */
public class LocationInfo implements Serializable {

    /* --- Static members --- */

    private static final long serialVersionUID = -8929466977402019350L;

    /* --- Members --- */

    private double lat;
    private double lon;
    private String city;

    /* --- Constructor --- */

    public LocationInfo() {
    }

    public LocationInfo(double lat, double lon, String city) {
        this.lat = lat;
        this.lon = lon;
        this.city = city;
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
