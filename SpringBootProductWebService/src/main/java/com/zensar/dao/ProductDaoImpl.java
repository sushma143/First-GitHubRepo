package com.zensar.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.zensar.entities.Product;

/**
 * @author Sushma Kumari
 * @creation_date 04 Oct 2019 10:25 AM
 * @version 3.0
 * @modification_date 12 Oct 2019 03:42 PM
 * @copyright All rights are reserver by Zensar.
 * @description It is Product Implementation Dao class.
 * 				It is used in Persistence layer.
 * 		
 */
@Repository
public class ProductDaoImpl implements ProductDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return (List<Product>) hibernateTemplate.find("from Product");
	}

	@Override
	public Product getById(int productId) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(Product.class, productId);
	}

	@Override
	public void insert(Product p) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(p);
	}

	@Override
	public void update(Product p) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(p);
	}

	@Override
	public void delete(Product p) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(p);
	}

	
}
