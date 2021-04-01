package com.demoprogra.progratres.data.dto.Tester;

public class TesterResponseDto {

    private String idColumnOne;
    private String columnTwo;

    public TesterResponseDto() {
    }

    public TesterResponseDto(String idColumnOne, String columnTwo) {
        this.idColumnOne = idColumnOne;
        this.columnTwo = columnTwo;
    }

    public String getIdColumnOne() {
        return idColumnOne;
    }

    public void setIdColumnOne(String idColumnOne) {
        this.idColumnOne = idColumnOne;
    }

    public String getColumnTwo() {
        return columnTwo;
    }

    public void setColumnTwo(String columnTwo) {
        this.columnTwo = columnTwo;
    }
}
