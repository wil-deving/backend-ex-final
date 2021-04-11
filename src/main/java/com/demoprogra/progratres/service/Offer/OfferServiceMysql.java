package com.demoprogra.progratres.service.Offer;

import com.demoprogra.progratres.data.entity.Offer;
import com.demoprogra.progratres.repository.OfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class OfferServiceMysql implements OfferService {

    @Autowired
    OfferRepository offerRepository;

    @Override
    public Offer save(Offer offer) {
        return offerRepository.save(offer);
    }

    @Override
    public List<Map<String, String>> getAllProductList() {
        return offerRepository.getAllProductListForOffer();
    }

    @Override
    public Offer getOfferById(String offerId) {
        return offerRepository.getOfferById(offerId);
    }

    @Override
    public List<Map<String, String>> getProductsAvailableToOffer() {
        return offerRepository.getProductsAvailableToOffer();
    }

    @Override
    public void disableOffer(String offerId) {
        offerRepository.disableOffer(offerId);
    }

}
