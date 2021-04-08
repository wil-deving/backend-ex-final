package com.demoprogra.progratres.data.entity;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    private String idProduct;

    private int idProductType;

    private String city;

    private String address;

    private String codeFolio;

    private String codeCatastro;

    private Double price;

    private Double surface;

    private Double buildedSurface;

    public Product() {
    }

    public Product(String idProduct,
                   int idProductType,
                   String city,
                   String address,
                   String codeFolio,
                   String codeCatastro,
                   Double price,
                   Double surface,
                   Double buildedSurface) {
        this.idProduct = idProduct;
        this.idProductType = idProductType;
        this.city = city;
        this.address = address;
        this.codeFolio = codeFolio;
        this.codeCatastro = codeCatastro;
        this.price = price;
        this.surface = surface;
        this.buildedSurface = buildedSurface;
    }

    @Column(name = "id_product")
    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    @Column(name = "id_product_type")
    public int getIdProductType() {
        return idProductType;
    }

    public void setIdProductType(int idProductType) {
        this.idProductType = idProductType;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Column(name = "code_folio")
    public String getCodeFolio() {
        return codeFolio;
    }

    public void setCodeFolio(String codeFolio) {
        this.codeFolio = codeFolio;
    }

    @Column(name = "code_catastro")
    public String getCodeCatastro() {
        return codeCatastro;
    }

    public void setCodeCatastro(String codeCatastro) {
        this.codeCatastro = codeCatastro;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getSurface() {
        return surface;
    }

    public void setSurface(Double surface) {
        this.surface = surface;
    }

    @Column(name = "builded_surface ")
    public Double getBuildedSurface() {
        return buildedSurface;
    }

    public void setBuildedSurface(Double buildedSurface) {
        this.buildedSurface = buildedSurface;
    }
}
