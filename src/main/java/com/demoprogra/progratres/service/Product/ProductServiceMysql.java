package com.demoprogra.progratres.service.Product;

import com.demoprogra.progratres.data.entity.Product;
import com.demoprogra.progratres.data.entity.ProductType;
import com.demoprogra.progratres.repository.ProductRepository;
import com.demoprogra.progratres.repository.ProductTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ProductServiceMysql implements ProductService {

    @Autowired
    private ProductTypeRepository productTypeRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Iterable<ProductType> getProductTypesList() {
        return productTypeRepository.getProductTypesList();
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Map<String, String>> getProductList() {
        return productRepository.getProductList();
    }

    @Override
    public Product findByIdProduct(String idProduct) {
        return productRepository.findByIdProduct(idProduct);
    }

    @Override
    public void deleteProduct(Product product) {
        productRepository.delete(product);
    }

    @Override
    public List<Map<String, String>> getProductListForOffer() {
        return productRepository.getProductListForOffer();
    }

}
