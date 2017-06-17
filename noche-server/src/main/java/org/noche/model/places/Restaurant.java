package org.noche.model.places;

import dto.Rank;
import dto.RestaurantType;

import javax.persistence.*;

/**
 * Created by Timi on 4/5/2017.
 */
@Entity(name = "Restaurant")
@Table(name = "noche_restaurant")
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
    public Restaurant(String name, Location loc , String open, String web, String phone, /*Rank*/float rank,
                      String front, String inside,RestaurantType type,boolean isKosher)
    {
        super(name,loc,open,web,phone,rank,front,inside);
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


