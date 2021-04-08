package com.demoprogra.progratres.controller;

import com.demoprogra.progratres.bo.CostumerBo;
import com.demoprogra.progratres.data.dto.Costumer.CostumerDto;
import com.demoprogra.progratres.data.dto.Product.ProductDto;
import com.demoprogra.progratres.data.entity.Costumer;
import com.demoprogra.progratres.data.entity.Product;
import com.demoprogra.progratres.service.Costumer.CostumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("v1/costumer")
public class CostumerController {

    @Autowired
    private CostumerService costumerService;

    private CostumerBo costumerBo;

    public CostumerController() { this.costumerBo = new CostumerBo(); }

    @PostMapping()
    public @ResponseBody
    Costumer saveCostumer(@RequestBody CostumerDto costumerDto) {
        Costumer costumerEntity = costumerBo.prepareCostumer(costumerDto);
        return costumerService.save(costumerEntity);
    }

    @PutMapping()
    public @ResponseBody Costumer updateCostumer(@RequestBody CostumerDto costumerDto) {
        Costumer costumerEntity = costumerBo.prepareCostumer(costumerDto);
        return costumerService.save(costumerEntity);
    }

    @GetMapping()
    public @ResponseBody
    List<Map<String, String>> getCostumerList() {
        return costumerService.getCostumerList();
    }

    @GetMapping("/{idCostumer}")
    public Costumer getListCostumerById(@PathVariable String idCostumer) {
        return costumerService.findByIdCostumer(idCostumer);
    }


    @DeleteMapping("/{idCostumer}")
    public String deleteCostumer(@PathVariable String idCostumer) {
        Costumer costumerEntity = new Costumer();
        costumerEntity.setCostumerId(idCostumer);
        costumerService.deleteCostumer(costumerEntity);
        return idCostumer;
    }
}
