package com.crudopr.springbootcrud.repository;

import com.crudopr.springbootcrud.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product , Interger> {

}
