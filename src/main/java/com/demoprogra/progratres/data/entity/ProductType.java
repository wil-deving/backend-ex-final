package com.demoprogra.progratres.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_types")
public class ProductType {

    @Id
    private int idProductType;

    private String description;

    public ProductType() {
    }

    public ProductType(int idProductType, String description) {
        this.idProductType = idProductType;
        this.description = description;
    }

    @Column(name = "id_product_type")
    public int getIdProductType() {
        return idProductType;
    }

    public void setIdProductType(int idProductType) {
        this.idProductType = idProductType;
    }

    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
