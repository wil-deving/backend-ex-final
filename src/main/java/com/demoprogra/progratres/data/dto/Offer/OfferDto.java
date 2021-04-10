package com.demoprogra.progratres.data.dto.Offer;

import java.util.Date;

public class OfferDto {

    private String offerId;

    private String costumerId;

    private String productId;

    private Double offerPrice;

    private int available;

    private Date createdAt;

    public OfferDto() {
    }

    public OfferDto(String offerId,
                    String costumerId,
                    String productId,
                    Double offerPrice,
                    int available,
                    Date createdAt) {
        this.offerId = offerId;
        this.costumerId = costumerId;
        this.productId = productId;
        this.offerPrice = offerPrice;
        this.available = available;
        this.createdAt = createdAt;
    }

    public String getOfferId() {
        return offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    public String getCostumerId() {
        return costumerId;
    }

    public void setCostumerId(String costumerId) {
        this.costumerId = costumerId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

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

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
