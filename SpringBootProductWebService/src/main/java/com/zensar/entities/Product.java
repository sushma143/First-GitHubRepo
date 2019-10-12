package com.zensar.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

/**
 * @author Sushma Kumari
 * @creation_date 01 Oct 2019 10:13 AM
 * @version 5.0
 * @modification_date 11 Oct 2019 10:53 PM
 * @copyright All rights are reserver by Zensar.
 * @description It is a persistence class.
 * 				It is a POJO class.
 *	
 */
//@XmlRootElement
//@XmlType(propOrder = {"productId","name","brand","price"})
@Component
@Entity
public class Product {
	@Id
	@Column(name="id")
	private int productId;
	private String name;
	private String brand;
	private float price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(int productId, String name, String brand, float price) {
		super();
		this.productId = productId;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + productId + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}
	

}
