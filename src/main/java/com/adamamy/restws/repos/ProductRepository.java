package com.adamamy.restws.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adamamy.restws.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
