package org.noche.model.places;

import dto.PlaceInfo;
import org.noche.model.LiteAbstractEntity;
import dto.Rank;

import javax.persistence.*;

/**
 * Created by Timi on 1/14/2017.
 */
@MappedSuperclass
public class Place {

    /* --- Static members --- */

    private static final long serialVersionUID = 1196751272306957719L;

    /* --- Members --- */

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "name")
    private String name;

    // TODO figure this out
//    private int freeSeats;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "locationId")
    private Location location;

    @Column(name = "openingHours")
    private String openingHours;

    @Column(name = "web")
    private String web;

    @Column(name = "phone")
    private String phone;

    @Column(name = "rank")
    @Enumerated(EnumType.STRING)
    private Rank rank;

    @Column(name = "urlFront")
    private String urlFront;

    @Column(name ="urlInside")
    private String urlInside;
/*
@Column(name = "review")
@OneToMany
private List<Review> review;
*/

    /* --- Constructor --- */

    public Place() {
    }

    public Place(String name,Location loc ,String open,String web,String phone,Rank rank,String front,String inside) {
        this.name = name;
        this.location = loc;
        this.openingHours = open;
        this.web = web;
        this.phone = phone;
        this.rank = rank;
        this.urlFront = front;
        this.urlInside = inside;
    }

    /* --- Public methods --- */

    public PlaceInfo getInfo() {
        PlaceInfo info = new PlaceInfo();
//        info.setLocationInfo();
        info.setName(name);
        info.setOpeningHours(openingHours);
        info.setPhone(phone);
        info.setUrl(web);
        return info;
    }

    /* --- Equal methods --- */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Place place = (Place) o;

        if (name != null ? !name.equals(place.name) : place.name != null) return false;
        if (location != null ? !location.equals(place.location) : place.location != null) return false;
        if (openingHours != null ? !openingHours.equals(place.openingHours) : place.openingHours != null) return false;
        if (web != null ? !web.equals(place.web) : place.web != null) return false;
        if (phone != null ? !phone.equals(place.phone) : place.phone != null) return false;
        return rank == place.rank;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (openingHours != null ? openingHours.hashCode() : 0);
        result = 31 * result + (web != null ? web.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (rank != null ? rank.hashCode() : 0);
        return result;
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

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
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
