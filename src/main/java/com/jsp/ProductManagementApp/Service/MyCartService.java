package com.jsp.ProductManagementApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.ProductManagementApp.Entity.Product;
import com.jsp.ProductManagementApp.Repository.ProductRepository;

@Service
public class MyCartService 
{
	@Autowired
	ProductRepository pr;
	
	public void save(Product p)
	{
		pr.save(p);
	}
	
	public List<Product> getAllProducts()
	{
		return pr.findAll();
	}
	
	public void deleteById(int id)
	{
		pr.deleteById(id);
	}

	
	


}
