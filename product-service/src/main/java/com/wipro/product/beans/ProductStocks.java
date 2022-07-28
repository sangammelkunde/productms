package com.wipro.product.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductStocks {
	
	
	

	private String productName;
	private Integer stock;
	
	public ProductStocks(String productName, Integer stock) {
		// TODO Auto-generated constructor stub
		super();
		this.productName = productName;
		this.stock = stock;
		
	}

}
