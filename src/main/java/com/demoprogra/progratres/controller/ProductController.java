package com.demoprogra.progratres.controller;

import com.demoprogra.progratres.bo.ProductBo;
import com.demoprogra.progratres.data.dto.Product.ProductDto;
import com.demoprogra.progratres.data.dto.Tester.TesterResponseDto;
import com.demoprogra.progratres.data.entity.Product;
import com.demoprogra.progratres.data.entity.ProductType;
import com.demoprogra.progratres.data.entity.Tester;
import com.demoprogra.progratres.service.Product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("v1/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    private ProductBo productBo;

    public ProductController() {
       this.productBo = new ProductBo();
    }

    @GetMapping("/types")
    public Iterable<ProductType> getProductTypesList() {
        return productService.getProductTypesList();
    }

    @PostMapping()
    public @ResponseBody Product saveProduct(@RequestBody ProductDto productDto) {
        Product productEntity = productBo.prepareProduct(productDto);
        return productService.save(productEntity);
    }

    @PutMapping()
    public @ResponseBody Product updateProduct(@RequestBody ProductDto productDto) {
        Product productEntity = productBo.prepareProduct(productDto);
        return productService.save(productEntity);
    }

    @GetMapping()
    public @ResponseBody
    List<Map<String, String>> getProductList() {
        return productService.getProductList();
    }

    @GetMapping("/{idProduct}")
    public Product getListProductById(@PathVariable String idProduct) {
        return productService.findByIdProduct(idProduct);
    }

    @DeleteMapping("/{idProduct}")
    public String deleteProduct(@PathVariable String idProduct) {
        Product productEntity = new Product();
        productEntity.setIdProduct(idProduct);
        productService.deleteProduct(productEntity);
        return idProduct;
    }
}
