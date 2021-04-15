package com.demoprogra.progratres.repository;

import com.demoprogra.progratres.data.entity.Inquiry;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface InquiryRepository extends CrudRepository<Inquiry, Integer> {

    @Query(
            value = " SELECT * " +
                    " FROM " +
                    " ( " +
                    " SELECT COUNT(1) as totalByOffer, i.inquirie_id AS inquiryId, p.city, " +
                    " p.address, pt.description, p.code_folio AS codeFolio, o.offer_price AS offerPrice, " +
                    " peo.name AS interestedName, i.created_at AS inquiryDate " +
                    " FROM inquiries i INNER JOIN offers o ON i.offer_id = o.offer_id " +
                    " INNER JOIN products p ON p.id_product = o.id_product " +
                    " INNER JOIN product_types pt ON pt.id_product_type = p.id_product_type " +
                    " INNER JOIN interested it ON it.interested_id = i.interested_id " +
                    " INNER JOIN people peo ON peo.people_id = it.people_id " +
                    " WHERE o.available " +
                    " GROUP BY i.offer_id " +
                    " HAVING COUNT(1) > 0 " +
                    " ) tmpInq " +
                    " ORDER BY tmpInq.totalByOffer DESC, tmpInq.inquiryDate DESC ",
            nativeQuery = true
    )
    public List<Map<String, String>> getInquiriesData();

    @Query(
            value = " SELECT * " +
                    " FROM " +
                    " ( " +
                    " SELECT COUNT(1) as totalByOffer, i.inquirie_id AS inquiryId, p.city, " +
                    " p.address, pt.description, p.code_folio AS codeFolio, o.offer_price AS offerPrice, " +
                    " peo.name AS interestedName, i.created_at AS inquiryDate " +
                    " FROM inquiries i INNER JOIN offers o ON i.offer_id = o.offer_id " +
                    " INNER JOIN products p ON p.id_product = o.id_product " +
                    " INNER JOIN product_types pt ON pt.id_product_type = p.id_product_type " +
                    " INNER JOIN interested it ON it.interested_id = i.interested_id " +
                    " INNER JOIN people peo ON peo.people_id = it.people_id " +
                    " WHERE o.available " +
                    " GROUP BY i.offer_id " +
                    " HAVING COUNT(1) > 0 " +
                    " ) tmpInq " +
                    " WHERE tmpInq.city = :filterCity " +
                    " ORDER BY tmpInq.totalByOffer DESC, tmpInq.inquiryDate DESC ",
            nativeQuery = true
    )
    public List<Map<String, String>> getInquiriesDataByCity(@Param("filterCity") String filterCity);

}
