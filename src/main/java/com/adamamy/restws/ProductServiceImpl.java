package com.adamamy.restws;

import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.adamamy.restws.entities.Product;
import com.adamamy.restws.repos.ProductRepository;

public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepository repository;

	@Override
	public List<Product> getProducts() {
		return repository.findAll();
	}

	@Override
	public Product getProduct(int id) {
		return repository.findById(id).get();
	}

	@Override
	public Response createProduct(Product product) {
		Product savedProd = repository.save(product);
		return Response.ok(savedProd).build();
	}

	@Override
	public Response updateProduct(Product product) {
		Product savedProd = repository.save(product);
		return Response.ok(savedProd).build();
	}

}
