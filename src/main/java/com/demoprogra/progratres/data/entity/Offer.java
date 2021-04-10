package com.demoprogra.progratres.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "offers")
public class Offer {

    @Id
    private String offerId;

    private String costumerId;

    private String idProduct;

    private Double offerPrice;

    private int available;

    private Date createdAt;

    public Offer() {
    }

    public Offer(String offerId,
                 String costumerId,
                 String idProduct,
                 Double offerPrice,
                 int available,
                 Date createdAt) {
        this.offerId = offerId;
        this.costumerId = costumerId;
        this.idProduct = idProduct;
        this.offerPrice = offerPrice;
        this.available = available;
        this.createdAt = createdAt;
    }

    @Column(name = "offer_id")
    public String getOfferId() {
        return offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    @Column(name = "costumer_id")
    public String getCostumerId() {
        return costumerId;
    }

    public void setCostumerId(String costumerId) {
        this.costumerId = costumerId;
    }

    @Column(name = "id_product")
    public String getProductId() {
        return idProduct;
    }

    public void setProductId(String productId) {
        this.idProduct = productId;
    }

    @Column(name = "offer_price")
    public Double getOfferPrice() {
        return offerPrice;
    }

    public void setOfferPrice(Double offerPrice) {
        this.offerPrice = offerPrice;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    @Column(name = "created_at")
    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
