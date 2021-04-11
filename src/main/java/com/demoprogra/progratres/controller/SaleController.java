package com.demoprogra.progratres.controller;

import com.demoprogra.progratres.bo.SaleBo;
import com.demoprogra.progratres.data.dto.Sale.SaleDto;
import com.demoprogra.progratres.data.entity.Sale;
import com.demoprogra.progratres.service.Offer.OfferService;
import com.demoprogra.progratres.service.Sale.SaleService;
import com.demoprogra.progratres.service.User.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("v1/sale")
public class SaleController {

    @Autowired
    private OfferService offerService;

    @Autowired
    private UserService userService;

    @Autowired
    private SaleService saleService;

    private SaleBo saleBo;

    public SaleController() { this.saleBo = new SaleBo(); }

    @GetMapping("/products")
    public @ResponseBody
    List<Map<String, String>> getProductsAvailableToOffer() {
        return offerService.getProductsAvailableToOffer();
    }

    @GetMapping("/agents")
    public @ResponseBody
    List<Map<String, String>> getAgentList() {
        return userService.getAgentList();
    }

    @PostMapping()
    public @ResponseBody
    Sale saveSale(@RequestBody SaleDto saleDto) {
        Sale saleEntity = saleBo.prepareSale(saleDto);
        Sale saleSaved = saleService.save(saleEntity);
        offerService.disableOffer(saleDto.getOfferId());
        return saleSaved;
    }

    @GetMapping()
    public @ResponseBody
    List<Map<String, String>> getSalesData() {
        return saleService.getSalesData();
    }
}
