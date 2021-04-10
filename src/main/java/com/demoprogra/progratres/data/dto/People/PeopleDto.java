package com.demoprogra.progratres.data.dto.People;

public class PeopleDto {

    private String peopleId;

    private String name;

    private String aPaterno;

    private String aMaterno;

    private String document;

    private String expDocument;

    private String address;

    private String phone;

    private String cellphone;

    private String email;

    public PeopleDto() {
    }

    public PeopleDto(String peopleId,
                       String name,
                       String aPaterno,
                       String aMaterno,
                       String document,
                       String expDocument,
                       String address,
                       String phone,
                       String cellphone,
                       String email) {
        this.peopleId = peopleId;
        this.name = name;
        this.aPaterno = aPaterno;
        this.aMaterno = aMaterno;
        this.document = document;
        this.expDocument = expDocument;
        this.address = address;
        this.phone = phone;
        this.cellphone = cellphone;
        this.email = email;
    }

    public String getPeopleId() {
        return peopleId;
    }

    public void setPeopleId(String costumerId) {
        this.peopleId = costumerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getaPaterno() {
        return aPaterno;
    }

    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }

    public String getaMaterno() {
        return aMaterno;
    }

    public void setaMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

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
