package com.demoprogra.progratres.bo;

import com.demoprogra.progratres.data.dto.Sale.SaleDto;
import com.demoprogra.progratres.data.entity.Sale;

import java.util.Date;

public class SaleBo {

    public Sale prepareSale(SaleDto saleDto) {
        Sale saleToSave = new Sale();
        saleToSave.setSaleId(saleDto.getSaleId());
        saleToSave.setOfferId(saleDto.getOfferId());
        saleToSave.setUserId(saleDto.getUserId());
        saleToSave.setSalePrice(saleDto.getSalePrice());
        saleToSave.setCreatedAt(new Date());
        return saleToSave;
    }
}
