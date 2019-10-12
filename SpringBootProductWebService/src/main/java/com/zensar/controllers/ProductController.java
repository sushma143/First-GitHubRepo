package com.zensar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.entities.Product;
import com.zensar.services.ProductService;

/**
 * @author Sushma Kumari
 * @creation_date 12 Oct 2019 03:45 PM
 * @version 1.0
 * @modification_date 12 Oct 2019 3:47 PM
 * @copyright All rights are reserver by Zensar.
 * @description It is a restful web service class to access Product entity.
 * 				
 *	
 */
@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/products")
	public List<Product> getAllProducts(){
		return productService.findAllProducts();
	}
	
	@GetMapping("/products/{id}")
	public Product getProduct(@PathVariable("id") int productId) {
		return productService.findProductById(productId);
	}
	
	@PostMapping("/products/add")
	public String add(@RequestBody Product product) {
		productService.addProduct(product);
		return "New product is added. "+product.getProductId()+" is added successfully.";
	}
	
	@PostMapping("/addProduct")
	public String addProduct(@RequestParam("id") int productId,@RequestParam("name") String name, @RequestParam("brand")String brand,@RequestParam("price") int price) {
		
		Product product=new Product(productId,name,brand,price);
		productService.addProduct(product);
		return "New product is added. "+product+" is added successfully.";
		
	}
	
	@PutMapping("/products/update")
	public String update(@RequestBody Product product) {
		if(productService.findProductById(product.getProductId())!=null){
			productService.updateProduct(product);
			return "Product is updated. "+product.getProductId()+" is updated successfully.";
		}
		else
			return "Sorry! Product not found.";
	}
	
	@DeleteMapping("/products/delete")
	public String delete(@RequestBody Product product) {
		if(productService.findProductById(product.getProductId())!=null){
			productService.removeProduct(product);
			return "Product is deleted. "+product.getProductId()+" is deleted successfully.";
		}
		else
			return "Sorry! Product not found.";
	}
}
