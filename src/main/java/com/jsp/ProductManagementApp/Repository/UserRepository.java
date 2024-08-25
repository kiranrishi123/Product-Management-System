package com.jsp.ProductManagementApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.ProductManagementApp.Entity.User;

public interface UserRepository extends JpaRepository<User, Integer>
{
	

}
