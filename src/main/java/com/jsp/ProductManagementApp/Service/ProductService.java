package com.jsp.ProductManagementApp.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.ProductManagementApp.Entity.Product;
import com.jsp.ProductManagementApp.Repository.ProductRepository;

@Service
public class ProductService 
{
	@Autowired 
	ProductRepository pr;
	
	public void save (Product p)
	{
		pr.save(p);
	}
	
	public Product getProductId(int id)
	{
		Optional<Product> optional=pr.findById(id);
		
		
		return pr.findById(id).get();
		
	}
	public void  deleteById(int id)
	{
		pr.deleteById(id);
			
	}

}
