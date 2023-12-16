package com.kapasiya.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kapasiya.springboot.entity.Order;


public interface OrderRepo extends JpaRepository<Order,Long>
{
	

}
