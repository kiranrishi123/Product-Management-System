package com.jsp.ProductManagementApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.ProductManagementApp.Entity.MyCart;



public interface MyCartRepository extends JpaRepository<MyCart, Integer>{

}
