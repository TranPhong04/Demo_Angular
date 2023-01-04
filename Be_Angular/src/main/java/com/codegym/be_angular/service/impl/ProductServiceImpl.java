package com.codegym.be_angular.service.impl;

import com.codegym.be_angular.model.Product;
import com.codegym.be_angular.repository.ProductRepo;
import com.codegym.be_angular.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    ProductRepo productRepo;
    @Override
    public List<Product> findAll() {
        return productRepo.findAll();
    }

    @Override
    public void delete(Long id) {
        productRepo.deleteById(id);

    }

    @Override
    public void save(Product product) {
        productRepo.save(product);

    }

    @Override
    public Product findById(Long id) {
        return productRepo.findById(id).get();
    }

    @Override
    public List<Product> findByName(String name) {
        return null;
    }
}
