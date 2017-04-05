package org.noche.model.logs;

import org.noche.model.LiteAbstractEntity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Timi on 4/5/2017.
 */
@Entity(name = "UsageLog")
@Table(name = "noche_usage_log")
public class UsageLog extends LiteAbstractEntity {

    /* --- Members --- */

    @Column(name = "userName")
    private String userName;

    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @Column
    private String location;

    /* --- Constructor --- */

    public UsageLog() {
        date = new Date();
    }

    public UsageLog(String userName, Date date, String location) {
        this.userName = userName;
        this.date = date;
        this.location = location;
    }

    /* --- Getters/Setters --- */

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
