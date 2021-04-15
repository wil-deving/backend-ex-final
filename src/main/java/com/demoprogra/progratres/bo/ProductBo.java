package com.demoprogra.progratres.bo;


import com.demoprogra.progratres.data.dto.Product.ProductDto;
import com.demoprogra.progratres.data.entity.Product;
import com.demoprogra.progratres.data.entity.ProductType;
import com.demoprogra.progratres.service.Product.ProductService;
import com.demoprogra.progratres.service.Product.ProductServiceMysql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class ProductBo {

    public Product prepareProduct(ProductDto productDto) {
        Product productToSave = new Product();
        productToSave.setIdProduct(productDto.getIdProduct());
        productToSave.setIdProductType(productDto.getIdProductType());
        productToSave.setCity(productDto.getCity());
        productToSave.setAddress(productDto.getAddress());
        productToSave.setCodeFolio(productDto.getCodeFolio());
        productToSave.setCodeCatastro(productDto.getCodeCatastro());
        productToSave.setPrice(productDto.getPrice());
        productToSave.setSurface(productDto.getSurface());
        productToSave.setBuildedSurface(productDto.getBuildedSurface());
        productToSave.setCreatedAt(new Date());
        return productToSave;
    }

}
