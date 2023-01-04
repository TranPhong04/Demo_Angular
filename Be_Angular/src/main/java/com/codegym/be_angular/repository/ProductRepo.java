package com.codegym.be_angular.repository;

import com.codegym.be_angular.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Long> {
}
