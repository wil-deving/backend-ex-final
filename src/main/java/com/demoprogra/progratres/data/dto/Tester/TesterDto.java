package com.demoprogra.progratres.data.dto.Tester;

public class TesterDto {

    private String id;
    private String colTwo;

    public TesterDto() {
    }

    public TesterDto(String id, String colTwo) {
        this.id = id;
        this.colTwo = colTwo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColTwo() {
        return colTwo;
    }

    public void setColTwo(String colTwo) {
        this.colTwo = colTwo;
    }
}
