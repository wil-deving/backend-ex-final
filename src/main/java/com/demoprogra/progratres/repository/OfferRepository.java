package com.demoprogra.progratres.repository;

import com.demoprogra.progratres.data.entity.Offer;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

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
                    " INNER JOIN people peo ON c.people_id = peo.people_id " +
                    " ORDER BY o.created_at DESC ",
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

    @Query(
            value = " SELECT o.offer_id offerId, p.id_product productId, p.code_folio codeFolio, " +
                    " CONCAT(peo.name, ' ', peo.apaterno, ' ', peo.amaterno) costumerName, " +
                    " p.price, o.offer_price offerPrice " +
                    " FROM offers o INNER JOIN products p ON o.id_product = p.id_product " +
                    " INNER JOIN costumers c ON c.costumer_id = o.costumer_id " +
                    " INNER JOIN people peo ON peo.people_id = c.people_id " +
                    " WHERE o.available = 1 " +
                    " ORDER BY o.created_at DESC ",
            nativeQuery = true
    )
    public List<Map<String, String>> getProductsAvailableToOffer();

    @Modifying
    @Transactional
    @Query(
            value = " UPDATE offers SET available = 0 " +
                    " WHERE offer_id = :offerId ",
            nativeQuery = true
    )
    public void disableOffer(@Param("offerId") String offerId);

    @Query(
            value = " SELECT o.offer_id offerId, p.city, p.address, pt.description, p.surface, " +
                    " p.builded_surface buildedSurface, o.offer_price offerPrice " +
                    " FROM offers o INNER JOIN products p ON o.id_product = p.id_product " +
                    " INNER JOIN product_types pt ON p.id_product_type = pt.id_product_type " +
                    " INNER JOIN costumers c ON c.costumer_id = o.costumer_id " +
                    " WHERE o.available = 1 " +
                    " ORDER BY o.created_at DESC ",
            nativeQuery = true
    )
    public List<Map<String, String>> getProductsAvailableToOfferForApp();

}
