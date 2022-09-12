package com.crudopr.springbootcrud.controller;


import com.crudopr.springbootcrud.entity.Product;
import com.crudopr.springbootcrud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
@Autowired
    private ProductService service ;
    @PostMapping("/addProduct")
    public Product addProduct (@RequestBody Product product){
        return service.saveProduct(product) ;
    }
    @PostMapping("/addProducts")
    public List<Product> addProduct (@RequestBody List<Product> products){
        return service.saveProducts(products) ;
    }
    @GetMapping("/products")
    public List <Product> findAllProducts (List <Product> products){
        return service.getProduct(products) ;
    }
    @GetMapping("/product/{id}")
    public Product findProductidByid  (@PathVariable  int id ){
        return service.getProductbyid(id) ;
    }
    @PutMapping("/update")
    public Product updateProduct (@RequestBody Product product){
        return service.updateProduct(product) ;
    }
    @DeleteMapping("/delete/{id}")
    public String deleteProduct (@PathVariable int id){
        return service.deleteProduct(id);
    }
}
