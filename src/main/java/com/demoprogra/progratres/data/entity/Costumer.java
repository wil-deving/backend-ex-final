package com.demoprogra.progratres.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "costumers")
public class Costumer {

    @Id
    private String costumerId;

    private String peopleId;

    private Date createdAt;

    public Costumer() {
    }

    public Costumer(String costumerId, String peopleId, Date createdAt) {
        this.costumerId = costumerId;
        this.peopleId = peopleId;
        this.createdAt = createdAt;
    }

    @Column(name = "costumer_id")
    public String getCostumerId() {
        return costumerId;
    }

    public void setCostumerId(String costumerId) {
        this.costumerId = costumerId;
    }

    @Column(name = "people_id")
    public String getPeopleId() {
        return peopleId;
    }

    public void setPeopleId(String peopleId) {
        this.peopleId = peopleId;
    }

    @Column(name = "created_At")
    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
