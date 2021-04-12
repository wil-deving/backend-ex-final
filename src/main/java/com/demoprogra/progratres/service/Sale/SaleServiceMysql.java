package com.demoprogra.progratres.service.Sale;

import com.demoprogra.progratres.data.entity.Sale;
import com.demoprogra.progratres.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SaleServiceMysql implements SaleService {

    @Autowired
    private SaleRepository saleRepository;

    @Override
    public Sale save(Sale sale) {
        return saleRepository.save(sale);
    }

    @Override
    public List<Map<String, String>> getSalesData() {
        return saleRepository.getSalesData();
    }

    @Override
    public List<Map<String, String>> getSalesDataByCity(String filterCity) {
        if (!filterCity.equals("all")) return saleRepository.getSalesDataByCity(filterCity);
        return saleRepository.getSalesData();
    }

}
