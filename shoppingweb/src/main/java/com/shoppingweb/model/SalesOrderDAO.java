package com.shoppingweb.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesOrderDAO extends JpaRepository<SalesOrder,String>{
	List<SalesOrder> findBystatusCode(String statusCode);
	List<SalesOrder> findBygenerateDate(String generateDate);
}