package com.inventory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.inventory.model.Product;
import com.inventory.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository repository;
	
//	 Method to add the product in the stock
	
	public Product addProduct(Product product) {
		return repository.save(product);
	}
	
	
//	 Method to get the product by id
	public Product getProductById(int productId) {
		
		return repository.findById(productId).orElseThrow();
		
		
	}
	
//	 method to get the product by name
	
	public Product getProductByName(String ProductName) {
		return repository.getProductByProductName(ProductName);
	}
	
	public List<Product> getAllProduct(){
		return repository.findAll();
	}
	
	public int checkStock(int productId) {
		Product product = repository.findById(productId).orElseThrow();
		int qty= product.getQuantity();
		System.out.println(qty);
		return qty;
	}
	
	public void deleteById(int productId) {
		repository.deleteById(productId);
		
	}
	
	public Product updateProduct(int productId, Product product) {
		Product existingProduct = repository.findById(productId).orElseThrow();
		existingProduct.setProductName(product.getProductName());
		existingProduct.setDiscription(product.getDiscription());
		existingProduct.setPrice(product.getPrice());
		existingProduct.setQuantity(product.getQuantity());
		
		return existingProduct;
	}
}
