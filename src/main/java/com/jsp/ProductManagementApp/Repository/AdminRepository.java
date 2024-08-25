package com.jsp.ProductManagementApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.ProductManagementApp.Entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer>
{
	Admin findByEmailAndPassword(String email, String password);
	
	

}
