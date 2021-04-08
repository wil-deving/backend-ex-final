package com.demoprogra.progratres.repository;

import com.demoprogra.progratres.data.entity.ProductType;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ProductTypeRepository extends CrudRepository<ProductType, Integer> {

    @Query(
            value = " SELECT id_product_type, description FROM product_types ",
            nativeQuery = true
    )
    public Iterable<ProductType> getProductTypesList();

}
