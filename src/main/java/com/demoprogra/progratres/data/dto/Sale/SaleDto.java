package com.demoprogra.progratres.data.dto.Sale;

import java.util.Date;

public class SaleDto {

    private String saleId;

    private String offerId;

    private String userId;

    private Double salePrice;

    private Date createdAt;

    public SaleDto() {
    }

    public SaleDto(String saleId, String offerId, String userId, Double salePrice, Date createdAt) {
        this.saleId = saleId;
        this.offerId = offerId;
        this.userId = userId;
        this.salePrice = salePrice;
        this.createdAt = createdAt;
    }

    public String getSaleId() {
        return saleId;
    }

    public void setSaleId(String saleId) {
        this.saleId = saleId;
    }

    public String getOfferId() {
        return offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
