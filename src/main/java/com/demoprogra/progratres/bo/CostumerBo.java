package com.demoprogra.progratres.bo;

import com.demoprogra.progratres.data.dto.Costumer.CostumerDto;
import com.demoprogra.progratres.data.entity.Costumer;
import com.demoprogra.progratres.data.entity.People;

public class CostumerBo {

    public People preparePeople(CostumerDto costumerDto) {
        People personToSave = new People();
        personToSave.setPeopleId(costumerDto.getPeopleId());
        personToSave.setName(costumerDto.getName());
        personToSave.setApaterno(costumerDto.getaPaterno());
        personToSave.setAmaterno(costumerDto.getaMaterno());
        personToSave.setDocument(costumerDto.getDocument());
        personToSave.setExpDocument(costumerDto.getExpDocument());
        personToSave.setAddress(costumerDto.getAddress());
        personToSave.setPhone(costumerDto.getPhone());
        personToSave.setCellphone(costumerDto.getCellphone());
        personToSave.setEmail(costumerDto.getEmail());
        return personToSave;
    }

    public Costumer prepareCostumer(CostumerDto costumerDto) {
        Costumer costumerToSave = new Costumer();
        costumerToSave.setCostumerId(costumerDto.getCostumerId());
        costumerToSave.setPeopleId(costumerDto.getPeopleId());
        return costumerToSave;
    }

}
