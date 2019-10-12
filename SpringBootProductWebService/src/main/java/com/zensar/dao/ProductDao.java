 package com.zensar.dao;

import java.util.List;

import com.zensar.entities.Product;

/**
 * @author Sushma Kumari
 * @creation_date 04 Oct 2019 10:08 AM
 * @version 4.0
 * @modification_date 12 Oct 2019 03:42 PM
 * @copyright All rights are reserver by Zensar.
 * @description It is Product Dao class.
 * 				It is used in Persistence layer.
 * 		
 */
public interface ProductDao {
	
	List<Product> getAll();
	Product getById(int productId);
	void insert(Product p);
	void update(Product p);
	void delete(Product p);

	
}
