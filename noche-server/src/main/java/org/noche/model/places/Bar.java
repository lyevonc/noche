package org.noche.model.places;

import dto.Line;
import dto.Rank;

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

    @Column(name = "line")
    @Enumerated(EnumType.STRING)
    private Line line;//TODO -ask what to do with this.

    /* --- Constructor --- */

    public Bar() {
    }
public Bar(String name, Location loc , String open, String url, String phone, Rank rank){
       super(name,loc,open,url,phone,rank,"wwww","llllll");
       this.line=Line.HAPPY_HOUR;
}

    public Bar(Line line) {
        this.line = line;
    }

    /* --- Getters/Setters --- */

    public Line getLine() {
        return line;
    }

    public void setLine(Line line) {
        this.line = line;
    }
}
