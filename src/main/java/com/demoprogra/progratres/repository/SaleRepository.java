package com.demoprogra.progratres.repository;

import com.demoprogra.progratres.data.entity.Sale;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface SaleRepository extends CrudRepository<Sale, Integer> {


    @Query(
            value = " SELECT s.sale_id saleId, p.city, p.address, pt.description, p.code_folio codeFolio, " +
                    " CONCAT(peo2.name, ' ', peo2.apaterno, ' ', peo2.amaterno) costumerName, " +
                    " CONCAT(peo1.name, ' ', peo1.apaterno) agentName, p.price priceCatastral, " +
                    " o.offer_price offerPrice, s.sale_price salePrice, o.created_at offerDate, " +
                    " s.created_at saleDate " +
                    " FROM sales s INNER JOIN offers o ON s.offer_id = o.offer_id " +
                    " INNER JOIN products p ON p.id_product = o.id_product " +
                    " INNER JOIN costumers c ON c.costumer_id = o.costumer_id " +
                    " INNER JOIN product_types pt ON pt.id_product_type = p.id_product_type " +
                    " INNER JOIN users u ON u.user_id = s.user_id " +
                    " INNER JOIN people AS peo1 ON peo1.people_id = u.people_id " +
                    " INNER JOIN people AS peo2 ON peo2.people_id = c.people_id ",
            nativeQuery = true
    )
    public List<Map<String, String>> getSalesData();

    @Query(
            value = " SELECT s.sale_id saleId, p.city, p.address, pt.description, p.code_folio codeFolio, " +
                    " CONCAT(peo2.name, ' ', peo2.apaterno, ' ', peo2.amaterno) costumerName, " +
                    " CONCAT(peo1.name, ' ', peo1.apaterno) agentName, p.price priceCatastral, " +
                    " o.offer_price offerPrice, s.sale_price salePrice, o.created_at offerDate, " +
                    " s.created_at saleDate " +
                    " FROM sales s INNER JOIN offers o ON s.offer_id = o.offer_id " +
                    " INNER JOIN products p ON p.id_product = o.id_product " +
                    " INNER JOIN costumers c ON c.costumer_id = o.costumer_id " +
                    " INNER JOIN product_types pt ON pt.id_product_type = p.id_product_type " +
                    " INNER JOIN users u ON u.user_id = s.user_id " +
                    " INNER JOIN people AS peo1 ON peo1.people_id = u.people_id " +
                    " INNER JOIN people AS peo2 ON peo2.people_id = c.people_id " +
                    " WHERE p.city = :filterCity ",
            nativeQuery = true
    )
    public List<Map<String, String>> getSalesDataByCity(@Param("filterCity") String filterCity);
}
