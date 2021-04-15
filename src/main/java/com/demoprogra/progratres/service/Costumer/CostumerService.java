package com.demoprogra.progratres.service.Costumer;

import com.demoprogra.progratres.data.entity.Costumer;
import com.demoprogra.progratres.data.entity.People;

import java.util.List;
import java.util.Map;

public interface CostumerService {

    People savePeople(People people);

    Costumer save(Costumer costumer);

    List<Map<String, String>> getCostumerList();

    Map<String, String> findByIdCostumer(String idCostumer);

    void deleteCostumer(Costumer costumer);
}
