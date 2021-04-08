package com.demoprogra.progratres.service.Costumer;

import com.demoprogra.progratres.data.entity.Costumer;
import com.demoprogra.progratres.data.entity.Product;
import com.demoprogra.progratres.data.entity.ProductType;

import java.util.List;
import java.util.Map;

public interface CostumerService {

    Costumer save(Costumer costumer);

    List<Map<String, String>> getCostumerList();

    Costumer findByIdCostumer(String idCostumer);

    void deleteCostumer(Costumer costumer);
}
