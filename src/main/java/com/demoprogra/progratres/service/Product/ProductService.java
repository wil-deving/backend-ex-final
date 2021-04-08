package com.demoprogra.progratres.service.Product;

import com.demoprogra.progratres.data.entity.Product;
import com.demoprogra.progratres.data.entity.ProductType;

import java.util.List;
import java.util.Map;

public interface ProductService {

    Iterable<ProductType> getProductTypesList();

    Product save(Product product);

    List<Map<String, String>> getProductList();

    Product findByIdProduct(String idProduct);

    void deleteProduct(Product product);

}
