package org.noche.model.places;

import org.noche.model.trends.RestaurantType;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 * Created by Timi on 4/5/2017.
 */
public class Restaurant extends Place {

    /* --- Members --- */

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private RestaurantType type;

    @Column(name = "isKosher")
    private boolean isKosher; // bit

    /* --- Constructor --- */

    public Restaurant() {

    }

    public Restaurant(RestaurantType type, boolean isKosher) {
        this.type = type;
        this.isKosher = isKosher;
    }

    /* --- Getters/Setters --- */

    public RestaurantType getType() {
        return type;
    }

    public void setType(RestaurantType type) {
        this.type = type;
    }

    public boolean isKosher() {
        return isKosher;
    }

    public void setKosher(boolean kosher) {
        isKosher = kosher;
    }
}


