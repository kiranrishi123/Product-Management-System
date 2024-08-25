package com.jsp.ProductManagementApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.ProductManagementApp.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>
{
	

}
