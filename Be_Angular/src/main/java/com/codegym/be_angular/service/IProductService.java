package com.codegym.be_angular.service;

import com.codegym.be_angular.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    void delete(Long id);
    void save(Product product);
    Product findById(Long id);
    List<Product> findByName( String name);

}
