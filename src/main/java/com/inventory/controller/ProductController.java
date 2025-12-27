package com.inventory.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventory.model.Product;
import com.inventory.service.ProductService;

@RestController

@RequestMapping("/api/products")
public class ProductController {

	@Autowired
	public ProductService service;
	@PostMapping("/add")
	public ResponseEntity<Product> addProduct(@ModelAttribute Product product)
	{
	Product savedProduct = service.addProduct(product);
	if (savedProduct!=null) {
		return ResponseEntity.accepted().body(savedProduct);
	}else {
		return ResponseEntity.badRequest().build();
	}
	}
	
	@GetMapping("/get/{productId}")
	public ResponseEntity<Product> getById(@PathVariable("productId") int productId) {
	Product product=	service.getProductById(productId);
	if (product!=null) {
			return ResponseEntity.status(HttpStatus.FOUND).body(product);
	}
	else {
		return ResponseEntity.notFound().build();
	}
		
	}
	@GetMapping("/getAll")
	public ResponseEntity<List<Product>> getAllProducts() {
	    List<Product> products = service.getAllProduct();
	    
	    if (!products.isEmpty()) {
	        return ResponseEntity.status(HttpStatus.OK).body(products); // 200 OK
	    } else {
	        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(products); // 204 No Content
	    }
	}

	@PutMapping("/update/{productId}")
	
	public ResponseEntity<Product> updateProduct(@PathVariable("productId") int productId, @ModelAttribute Product product){
		
	Product updateProduct=	service.updateProduct(productId, product);
	if (updateProduct!=null) {
		return ResponseEntity.ok(updateProduct);
	}else {
		return ResponseEntity.noContent().build();
	}
		
	
	}

	@DeleteMapping("/delete/{productId}")
	public String delete(@PathVariable("productId")int productId ) {
		
		service.deleteById(productId);
		return "The product is deleted successfully";
		
	}
	
	@GetMapping("/get/stock/{productId}")
	public ResponseEntity<String> getStocks(@PathVariable("productId") int productId){
		
	int qty=service.checkStock(productId);
		if (qty!=0) {
			return ResponseEntity.ok("There are "+qty+ " stocks for the product ");
		}else {
			return ResponseEntity.notFound().build();
		}
	}
}

