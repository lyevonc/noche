package org.noche.model.places;

import dto.PlaceInfo;
import org.noche.model.LiteAbstractEntity;
import dto.Rank;

import javax.persistence.*;

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

    // TODO figure this out
//    private int freeSeats;

    @OneToOne(fetch = FetchType.EAGER)
    @Column(name = "location")
    @JoinColumn(name = "locationId") // TODO check this
    private Location location;

    @Column(name = "openingHours")
    private String openingHours;

    @Column(name = "url")
    private String url;

    @Column(name = "phone")
    private String phone;

    @Column(name = "rank")
    @Enumerated(EnumType.STRING)
    private Rank rank;

//    @Column(name = "review")
//    @OneToMany
//    private List<Review> review;

    /* --- Constructor --- */

    public Place() {
    }

    public Place(String name) {
        this.name = name;
    }

    /* --- Public methods --- */

    public PlaceInfo getInfo() {
        PlaceInfo info = new PlaceInfo();
//        info.setLocationInfo();
        info.setName(name);
        info.setOpeningHours(openingHours);
        info.setPhone(phone);
        info.setUrl(url);
        return info;
    }

    /* --- Getters/Setters --- */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
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

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }
}
