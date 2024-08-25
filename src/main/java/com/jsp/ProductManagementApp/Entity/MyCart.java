package com.jsp.ProductManagementApp.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
public class MyCart
{
	public MyCart() {
		// TODO Auto-generated constructor stub
	}
	@Id
	private int id;
	private String name;
	private double price;
	

}
