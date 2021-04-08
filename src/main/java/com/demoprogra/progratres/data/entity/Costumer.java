package com.demoprogra.progratres.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "costumers")
public class Costumer {

    @Id
    private String costumerId;

    private String name;

    private String apaterno;

    private String amaterno;

    private String document;

    private String expDocument;

    private String address;

    private String phone;

    private String cellphone;

    private String email;

    public Costumer() {
    }

    public Costumer(String costumerId,
                    String name,
                    String apaterno,
                    String amaterno,
                    String document,
                    String expDocument,
                    String address,
                    String phone,
                    String cellphone,
                    String email) {
        this.costumerId = costumerId;
        this.name = name;
        this.apaterno = apaterno;
        this.amaterno = amaterno;
        this.document = document;
        this.expDocument = expDocument;
        this.address = address;
        this.phone = phone;
        this.cellphone = cellphone;
        this.email = email;
    }

    @Column(name = "costumer_id")
    public String getCostumerId() {
        return costumerId;
    }

    public void setCostumerId(String costumerId) {
        this.costumerId = costumerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApaterno() {
        return apaterno;
    }

    public void setApaterno(String apaterno) {
        this.apaterno = apaterno;
    }

    public String getAmaterno() {
        return amaterno;
    }

    public void setAmaterno(String amaterno) {
        this.amaterno = amaterno;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    @Column(name = "exp_document")
    public String getExpDocument() {
        return expDocument;
    }

    public void setExpDocument(String expDocument) {
        this.expDocument = expDocument;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
