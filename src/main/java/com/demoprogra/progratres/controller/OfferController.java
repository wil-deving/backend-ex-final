package com.demoprogra.progratres.controller;

import com.demoprogra.progratres.bo.OfferBo;
import com.demoprogra.progratres.data.dto.Offer.OfferDto;
import com.demoprogra.progratres.data.entity.Offer;
import com.demoprogra.progratres.service.Costumer.CostumerService;
import com.demoprogra.progratres.service.Offer.OfferService;
import com.demoprogra.progratres.service.Product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("v1/offer")
public class OfferController {

    @Autowired
    private OfferService offerService;

    @Autowired
    private CostumerService costumerService;

    @Autowired
    private ProductService productService;

    private OfferBo offerBo;

    public OfferController() { this.offerBo = new OfferBo(); }

    @GetMapping("/costumers")
    public @ResponseBody
    List<Map<String, String>> getCostumerList() { return costumerService.getCostumerList(); }

    @GetMapping("/products")
    public @ResponseBody
    List<Map<String, String>> getProductList() { return productService.getProductListForOffer(); }

    @GetMapping()
    public @ResponseBody
    List<Map<String, String>> getAllProductList() { return offerService.getAllProductList(); }

    @PostMapping()
    public @ResponseBody Offer saveOffer(@RequestBody OfferDto offerDto) {
        Offer offerToSave = offerBo.prepareOffer(offerDto);
        return offerService.save(offerToSave);
    }

    @PutMapping()
    public @ResponseBody Offer updateOffer(@RequestBody OfferDto offerDto) {
        Offer offerToSave = offerBo.prepareOffer(offerDto);
        return offerService.save(offerToSave);
    }

    @GetMapping("/{offerId}")
    public Offer getOfferById(@PathVariable String offerId) {
        return offerService.getOfferById(offerId);
    }

}
