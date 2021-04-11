package com.demoprogra.progratres.service.Sale;

import com.demoprogra.progratres.data.entity.Sale;

import java.util.List;
import java.util.Map;

public interface SaleService {

    Sale save(Sale sale);

    List<Map<String, String>> getSalesData();
}
