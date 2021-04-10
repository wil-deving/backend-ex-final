package com.demoprogra.progratres.repository;

import com.demoprogra.progratres.data.entity.Offer;
import com.demoprogra.progratres.data.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface OfferRepository extends CrudRepository<Offer, Integer> {

    @Query(
            value = " SELECT o.offer_id offerId, p.city, p.address, pt.description, p.code_folio codeFolio, " +
                    " p.surface, p.builded_surface buildedSurface, " +
                    " concat(peo.name, ' ', peo.apaterno, ' ', peo.amaterno) clientName, " +
                    " o.available, o.offer_price offerPrice " +
                    " FROM products p INNER JOIN product_types pt ON p.id_product_type = pt.id_product_type " +
                    " INNER JOIN offers o ON p.id_product = o.id_product " +
                    " INNER JOIN costumers c ON c.costumer_id = o.costumer_id " +
                    " INNER JOIN people peo ON c.people_id = peo.people_id ",
            nativeQuery = true
    )
    public List<Map<String, String>> getAllProductListForOffer();

    @Query(
            value = " SELECT offer_id, costumer_id, id_product, offer_price, " +
                    " available, created_at " +
                    " FROM offers " +
                    " WHERE offer_id = :offerId ",
            nativeQuery = true
    )
    public Offer getOfferById(@Param("offerId") String offerId);

}
