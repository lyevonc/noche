package org.noche.model.places;

import dto.BarType;
import dto.MusicType;

import javax.persistence.*;

/**
 * Created by Timi on 4/1/2017.
 */
@Entity(name = "Bar")
@Table(name = "noche_bar")
public class Bar extends Place
{

    /* --- Static members --- */

    private static final long serialVersionUID = -3174204710537114672L;

    /* --- Private members --- */

    @Column(name = "BarType")
    @Enumerated(EnumType.STRING)
    private BarType barType;

    @Column(name = "MusicType")
    @Enumerated(EnumType.STRING)
    private MusicType musicType;

    /* --- Constructor --- */

    public Bar() {
    }
    public Bar(String name, Location loc , String open, String url, String phone, /*Rank*/float rank){
        super(name,loc,open,url,phone,rank,"wwww","llllll");
        //this.line=Line.HAPPY_HOUR;
    }



    /* --- Getters/Setters --- */

    public BarType getBarType() {
        return barType;
    }

    public void setBarType(BarType barType) {
        this.barType = barType;
    }

    public MusicType getMusicType() {
        return musicType;
    }

    public void setMusicType(MusicType musicType) {
        this.musicType = musicType;
    }
    // public Line getLine() {
    //return line;
}

//public void setLine(Line line) {
//this.line = line;


