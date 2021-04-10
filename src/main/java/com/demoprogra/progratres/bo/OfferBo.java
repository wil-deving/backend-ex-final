package com.demoprogra.progratres.bo;

import com.demoprogra.progratres.data.dto.Offer.OfferDto;
import com.demoprogra.progratres.data.entity.Offer;

import java.util.Date;

public class OfferBo {

    public Offer prepareOffer(OfferDto offerDto) {
        Offer offerToSave = new Offer();
        offerToSave.setOfferId(offerDto.getOfferId());
        offerToSave.setCostumerId(offerDto.getCostumerId());
        offerToSave.setProductId(offerDto.getProductId());
        offerToSave.setOfferPrice(offerDto.getOfferPrice());
        offerToSave.setAvailable(offerDto.getAvailable());
        offerToSave.setCreatedAt(new Date());
        return offerToSave;
    }
}
