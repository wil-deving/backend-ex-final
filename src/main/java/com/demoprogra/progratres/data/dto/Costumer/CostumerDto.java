package com.demoprogra.progratres.data.dto.Costumer;

import com.demoprogra.progratres.data.dto.People.PeopleDto;

public class CostumerDto extends PeopleDto {

    private String costumerId;

    public CostumerDto() {
    }

    public CostumerDto(String costumerId) {
        this.costumerId = costumerId;
    }

    public String getCostumerId() {
        return costumerId;
    }

    public void setCostumerId(String costumerId) {
        this.costumerId = costumerId;
    }

}
