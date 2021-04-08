package com.demoprogra.progratres.repository;

import com.demoprogra.progratres.data.dto.Product.ProductResponseDto;
import com.demoprogra.progratres.data.entity.Product;
import com.demoprogra.progratres.data.entity.ProductType;
import com.demoprogra.progratres.data.entity.Tester;
import org.hibernate.mapping.Any;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface ProductRepository extends CrudRepository<Product, Integer> {

    @Query(
            value = " SELECT p.id_product idProduct, p.city, p.address, pt.description, p.code_folio codeFolio, " +
                    " p.price, p.surface, p.builded_surface buildedSurface " +
                    " FROM products p " +
                    " INNER JOIN product_types pt ON p.id_product_type = pt.id_product_type ",
            nativeQuery = true
    )
    public List<Map<String, String>> getProductList();

    @Query(
            value = " SELECT id_product, id_product_type, city, address, code_folio, code_catastro, price, surface, " +
                    " builded_surface " +
                    " FROM products " +
                    " WHERE id_product = :idProduct ",
            nativeQuery = true
    )
    public Product findByIdProduct(@Param("idProduct") String idProduct);

}
