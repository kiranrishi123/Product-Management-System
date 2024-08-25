package com.jsp.ProductManagementApp.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class User 
{
	@Id
	private int id;
	private String name;
	private long phoneNumber;
	private int age;
	private String address;
	private String email;
	private String password;

}
