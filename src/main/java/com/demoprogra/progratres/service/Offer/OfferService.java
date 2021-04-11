package com.demoprogra.progratres.service.Offer;

import com.demoprogra.progratres.data.entity.Offer;
import org.w3c.dom.ls.LSInput;

import java.util.List;
import java.util.Map;

public interface OfferService {

    Offer save(Offer offer);

    List<Map<String, String>> getAllProductList();

    Offer getOfferById(String offerId);

    List<Map<String, String>> getProductsAvailableToOffer();

    void disableOffer(String offerId);

}
