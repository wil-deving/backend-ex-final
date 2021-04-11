package com.demoprogra.progratres.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "sales")
public class Sale {

    @Id
    private String saleId;

    private String offerId;

    private String userId;

    private Double salePrice;

    private Date createdAt;

    public Sale() {
    }

    public Sale(String saleId, String offerId, String userId, Double salePrice, Date createdAt) {
        this.saleId = saleId;
        this.offerId = offerId;
        this.userId = userId;
        this.salePrice = salePrice;
        this.createdAt = createdAt;
    }

    @Column(name = "sale_id")
    public String getSaleId() {
        return saleId;
    }

    public void setSaleId(String saleId) {
        this.saleId = saleId;
    }

    @Column(name = "offer_id")
    public String getOfferId() {
        return offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    @Column(name = "user_id")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Column(name = "sale_price")
    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    @Column(name = "created_at")
    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

}
