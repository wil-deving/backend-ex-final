package com.demoprogra.progratres.bo;

import com.demoprogra.progratres.data.dto.Costumer.CostumerDto;
import com.demoprogra.progratres.data.entity.Costumer;
import com.demoprogra.progratres.data.entity.Product;

public class CostumerBo {

    public Costumer prepareCostumer(CostumerDto costumerDto) {
        Costumer clientToSave = new Costumer();
        clientToSave.setCostumerId(costumerDto.getCostumerId());
        clientToSave.setName(costumerDto.getName());
        clientToSave.setApaterno(costumerDto.getaPaterno());
        clientToSave.setAmaterno(costumerDto.getaMaterno());
        clientToSave.setDocument(costumerDto.getDocument());
        clientToSave.setExpDocument(costumerDto.getExpDocument());
        clientToSave.setAddress(costumerDto.getAddress());
        clientToSave.setPhone(costumerDto.getPhone());
        clientToSave.setCellphone(costumerDto.getCellphone());
        clientToSave.setEmail(costumerDto.getEmail());
        return clientToSave;
    }

}
