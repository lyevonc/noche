package org.noche.model.places;

import dto.MusicType;
import org.noche.model.LiteAbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Timi on 4/5/2017.
 */
@Entity(name = "Club")
@Table(name = "noche_club")
public class Club extends Place {

    /* --- Members --- */

    @Column(name = "musicType")
    private MusicType musicType;
    @javax.inject.Inject
    private Location location1;

    /* --- Constructor --- */

    public Club() {
    }

    public MusicType getMusicType() {
        return musicType;
    }

    public void setMusicType(MusicType musicType) {
        this.musicType = musicType;
    }
/* public Club(String dj) {
        this.dj = dj;
    }*/

    /* --- Getters/Setters --- */

   /* public String getDj() {
        return dj;
    }

    public void setDj(String dj) {
        this.dj = dj;
    }*/
}
