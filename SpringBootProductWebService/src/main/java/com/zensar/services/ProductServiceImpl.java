package com.zensar.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zensar.dao.ProductDao;
import com.zensar.dao.ProductDaoImpl;
import com.zensar.entities.Product;

/**
 * @author Sushma Kumari
 * @creation_date 04 Oct 2019 11:39 AM
 * @version 1.0
 * @modification_date 04 Oct 2019 11:39 AM
 * @copyright All rights are reserver by Zensar.
 * @description It is Product Service Implementation class.
 * 				It is used in Business Layer.
 * 		
 */
@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDao productDao;
	
	@Override
	public List<Product> findAllProducts() {
		// TODO Auto-generated method stub
		return productDao.getAll();
	}

	@Override
	public Product findProductById(int productId) {
		// TODO Auto-generated method stub
		return productDao.getById(productId);
	}

	@Override
	public void addProduct(Product p) {
		// TODO Auto-generated method stub
		productDao.insert(p);

	}

	@Override
	public void updateProduct(Product p) {
		// TODO Auto-generated method stub
		productDao.update(p);

	}

	@Override
	public void removeProduct(Product p) {
		// TODO Auto-generated method stub
		productDao.delete(p);
	}

	@Override
	public List<Product> findProductsByPriceRange(float max, float min) {
		// TODO Auto-generated method stub
		ArrayList<Product> rangeList= new ArrayList<Product>();
		List<Product> list=productDao.getAll();
		for(Product p:list) {
			if(p.getPrice()<max && p.getPrice()>min)
				rangeList.add(p);
		}
		
		
		return rangeList;
	}

	@Override
	public List<Product> findProductByName(String name) {
		// TODO Auto-generated method stub
		ArrayList<Product> productByName= new ArrayList<Product>();
		List<Product> list=productDao.getAll();
		for(Product p:list) {
			if(p.getName()==name)
				productByName.add(p);
		}
		
		
		return productByName;
	}

	@Override
	public List<Product> findProductByBrand(String brand) {
		// TODO Auto-generated method stub
		ArrayList<Product> productByBrand= new ArrayList<Product>();
		List<Product> list=productDao.getAll();
		for(Product p:list) {
			if(p.getBrand()==brand)
				productByBrand.add(p);
		}
		
		
		return productByBrand;
	}

	@Override
	public long getProductCount() {
		// TODO Auto-generated method stub
		int count=0;
		List<Product> list=productDao.getAll();
		for(Product p:list)
			count++;
		
		return count;
	}

}
