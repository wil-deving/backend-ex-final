package com.demoprogra.progratres.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "inquiries")
public class Inquiry {

    @Id
    private String inquirieId;

    private String offerId;

    private String interestedId;

    private Date createdAt;

    public Inquiry() {
    }

    public Inquiry(String inquirieId, String offerId, String interestedId, Date createdAt) {
        this.inquirieId = inquirieId;
        this.offerId = offerId;
        this.interestedId = interestedId;
        this.createdAt = createdAt;
    }

    @Column(name = "inquirie_id")
    public String getInquirieId() {
        return inquirieId;
    }

    public void setInquirieId(String inquirieId) {
        this.inquirieId = inquirieId;
    }

    @Column(name = "offer_id")
    public String getOfferId() {
        return offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    @Column(name = "interested_id")
    public String getInterestedId() {
        return interestedId;
    }

    public void setInterestedId(String interestedId) {
        this.interestedId = interestedId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    @Column(name = "created_at")
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
