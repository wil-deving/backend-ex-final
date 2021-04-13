package com.demoprogra.progratres.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "interested")
public class Interested {

    @Id
    private String interestedId;

    private String peopleId;

    public Interested() {
    }

    public Interested(String interestedId, String peopleId) {
        this.interestedId = interestedId;
        this.peopleId = peopleId;
    }

    @Column(name = "interested_id")
    public String getInterestedId() {
        return interestedId;
    }

    public void setInterestedId(String interestedId) {
        this.interestedId = interestedId;
    }

    @Column(name = "people_id")
    public String getPeopleId() {
        return peopleId;
    }

    public void setPeopleId(String peopleId) {
        this.peopleId = peopleId;
    }
}
