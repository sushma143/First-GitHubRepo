package com.zensar.services;

import java.util.List;

import com.zensar.entities.Product;

/**
 * @author Sushma Kumari
 * @creation_date 04 Oct 2019 11:39 AM
 * @version 2.0
 * @modification_date 04 Oct 2019 03:42 PM
 * @copyright All rights are reserver by Zensar.
 * @description It is Product Service class.
 * 				It is used in Business Layer.
 * 		
 */
public interface ProductService {
	List<Product> findAllProducts();
	Product findProductById(int productId);
	void addProduct(Product p);
	void updateProduct(Product p);
	void removeProduct(Product p);
	List<Product> findProductsByPriceRange(float max, float min);
	List<Product> findProductByName(String name);
	List<Product> findProductByBrand(String brand);
	long getProductCount();

}
