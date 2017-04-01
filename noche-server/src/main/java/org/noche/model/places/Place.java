package org.noche.model.places;

import org.noche.model.LiteAbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Timi on 1/14/2017.
 */
@Entity(name = "Place")
@Table(name = "noche_places")
public class Place extends LiteAbstractEntity {

    /* --- Static members --- */

    private static final long serialVersionUID = 1196751272306957719L;

    /* --- Members --- */

    @Column(name = "name")
    private String name;

    /* --- Constructor --- */

    public Place() {
    }

    public Place(String name) {
        this.name = name;
    }

    /* --- Getters/Setters --- */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
