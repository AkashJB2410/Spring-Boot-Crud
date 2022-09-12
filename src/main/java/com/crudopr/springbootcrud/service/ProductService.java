package com.crudopr.springbootcrud.service;


import com.crudopr.springbootcrud.entity.Product;
import com.crudopr.springbootcrud.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
     public ProductRepository repository ;

    public Product saveProduct (Product product){
        System.out.println("ID === " + product.getId());
        return repository.save(product) ;
    }
    public List<Product> saveProducts (List<Product> products){
        return repository.saveAll(products) ;
    }
    public List<Product> getProduct (){
        return repository.findAll() ;
    }
    public Product getProductbyid (int id){
        return repository.findById(id).orElse(null) ;
    }
    public List<Product> getProduct (List<Product> products){
        return repository.findAll() ;
    }

    public String deleteProduct (int id){
         repository.deleteById(id);
         return "Delete by id " + id ;
    }
    public Product updateProduct (Product product){
        Product exisitingProduct = repository.findById(product.getId()).orElse(null);
        exisitingProduct.setName(product.getName());
        exisitingProduct.setQuantity(product.getQuantity());
        exisitingProduct.setPrice(product.getPrice());
        return repository.save(exisitingProduct);
    }
}
