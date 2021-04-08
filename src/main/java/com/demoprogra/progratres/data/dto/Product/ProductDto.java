package com.demoprogra.progratres.data.dto.Product;

public class ProductDto {

    private String idProduct;

    private int idProductType;

    private String city;

    private String address;

    private String codeFolio;

    private String codeCatastro;

    private Double price;

    private Double surface;

    private Double buildedSurface;

    public ProductDto() {
    }

    public ProductDto(String idProduct,
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

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

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

    public String getCodeFolio() {
        return codeFolio;
    }

    public void setCodeFolio(String codeFolio) {
        this.codeFolio = codeFolio;
    }

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

    public Double getBuildedSurface() {
        return buildedSurface;
    }

    public void setBuildedSurface(Double buildedSurface) {
        this.buildedSurface = buildedSurface;
    }
}
