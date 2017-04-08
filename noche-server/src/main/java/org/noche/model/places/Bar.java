package org.noche.model.places;

import dto.Line;

import javax.persistence.*;

/**
 * Created by Timi on 4/1/2017.
 */
@Entity(name = "Bar")
@Table(name = "noche_bar")
public class Bar extends Place {

    /* --- Static members --- */

    private static final long serialVersionUID = -3174204710537114672L;

    /* --- Private members --- */

    @Column(name = "line")
    @Enumerated(EnumType.STRING)
    private Line line;

    /* --- Constructor --- */

    public Bar() {
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
