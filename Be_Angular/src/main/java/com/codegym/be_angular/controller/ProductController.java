package com.codegym.be_angular.controller;

import com.codegym.be_angular.model.Product;
import com.codegym.be_angular.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("product")
public class ProductController {
    @Autowired
    IProductService iProductService;
    @GetMapping
    public ResponseEntity<List<Product>> getAll(){
        return new ResponseEntity<>(iProductService.findAll(), HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    public  ResponseEntity<?> delete(@PathVariable("id") Long id){
        iProductService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping
    public ResponseEntity<?> edit(@RequestBody Product product){
        iProductService.save(product);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<?> create(@RequestBody Product product){
        iProductService.save(product);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
