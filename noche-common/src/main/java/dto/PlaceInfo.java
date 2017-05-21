package dto;

import java.io.Serializable;

/**
 * Created by Timi on 4/5/2017.
 */
public class  PlaceInfo implements Serializable {

    /* --- Static members --- */

    private static final long serialVersionUID = -3432153588775124430L;

    /* --- Members --- */

    private String name;
    private LocationInfo locationInfo;
    private String url;
    private String phone;
    private String openingHours;

    /* --- Constructor --- */

    public PlaceInfo() {
    }

    public PlaceInfo(String name, LocationInfo locationInfo, String url, String phone, String openingHours) {
        this.name = name;
        this.locationInfo = locationInfo;
        this.url = url;
        this.phone = phone;
        this.openingHours = openingHours;
    }

    /* --- Getters/Setters --- */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocationInfo getLocationInfo() {
        return locationInfo;
    }

    public void setLocationInfo(LocationInfo locationInfo) {
        this.locationInfo = locationInfo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }
}
