package com.kapasiya.springboot.servicesimpl;

import java.util.List;


import com.kapasiya.springboot.entity.Order;
import com.kapasiya.springboot.repo.OrderRepo;
import com.kapasiya.springboot.services.*;


public class ServiceImpl implements Services
{
	
	private OrderRepo oRepo;
	
	private Services services;
	

	@Override
	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return oRepo.findAll();
	}


	@Override
	public Order saveOrder(Order order) {
		// TODO Auto-generated method stub
		services.saveOrder(order);
		
		return oRepo.save(order);
	}


	@Override
	public Order getOrderId(Long orderId) {
		// TODO Auto-generated method stub
		return oRepo.getById(orderId);
	}


	@Override
	public Order updateOrder(Order order) {
		// TODO Auto-generated method stub
		return oRepo.save(order);
	}


	@Override
	public void deleteOrderById(Long orderId) {
		// TODO Auto-generated method stub
		oRepo.deleteById(orderId);
	}
	

	

}
