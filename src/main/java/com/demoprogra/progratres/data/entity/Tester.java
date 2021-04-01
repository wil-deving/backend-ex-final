package com.demoprogra.progratres.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "testing")
public class Tester {

    @Id
    private String idColumnOne;

    private String columnTwo;

    public Tester() {
    }

    public Tester(String idColumnOne, String columnTwo) {
        this.idColumnOne = idColumnOne;
        this.columnTwo = columnTwo;
    }

    @Column(name = "id_column_one")
    public String getIdColumnOne() {
        return idColumnOne;
    }

    public void setIdColumnOne(String idColumnOne) {
        this.idColumnOne = idColumnOne;
    }

    @Column(name = "column_two")
    public String getColumnTwo() {
        return columnTwo;
    }

    public void setColumnTwo(String columnTwo) {
        this.columnTwo = columnTwo;
    }
}
