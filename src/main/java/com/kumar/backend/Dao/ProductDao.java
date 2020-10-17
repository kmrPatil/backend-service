package com.kumar.backend.Dao;

import org.springframework.data.repository.CrudRepository;

import com.kumar.backend.model.Product;

public interface ProductDao extends CrudRepository<Product, Long>{

}
