package com.wipro.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PRODUCTS")
public class Product {
	
	@Id
	@Column(name = "PRODUCT_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer productId;
	private String name;
	private String price;
	private String description;
	private String category;
	@Column(name = "IMAGE_URL")
	private String imageURL;
	private Integer stock;
	

//	public void setEmailId(String emailId) {
//		this.emailId = emailId;
//	}
public String getPrice() {
		
		// TODO Auto-generated method stub
		return price;
	}
public String getDescription() {
	
	// TODO Auto-generated method stub
	return description;
}
public String getImageURL() {
	
	// TODO Auto-generated method stub
	return imageURL;
}
	public String getCategory() {
		
		// TODO Auto-generated method stub
		return category;
	}
	public Integer getProductId() {
		// TODO Auto-generated method stub
		return productId;
	}
	public Object getName() {
		// TODO Auto-generated method stub
		return name;
	}
	public Object getStock() {
		// TODO Auto-generated method stub
		return stock;
	}
	public void setCategory(String upperCase) {
		// TODO Auto-generated method stub
		this.category=upperCase;
		
	}
	

}
