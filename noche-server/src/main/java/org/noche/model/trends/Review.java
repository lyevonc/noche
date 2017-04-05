package org.noche.model.trends;

import org.noche.model.LiteAbstractEntity;

import javax.persistence.Column;
import javax.persistence.Lob;

/**
 * Created by Timi on 4/5/2017.
 */
public class Review extends LiteAbstractEntity {

    /* --- Members --- */

    @Column(name = "review")
    @Lob
    private String review;

    /* --- Constructor --- */

    public Review() {
    }

    public Review(String review) {
        this.review = review;
    }

    /* --- Getters/Setters --- */

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
}
