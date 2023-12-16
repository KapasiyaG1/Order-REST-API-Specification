package com.kapasiya.springboot.services;

import java.util.List;


import com.kapasiya.springboot.entity.*;

public interface Services 
{
	  List<Order> getAllOrders();
	  
	  Order saveOrder(Order order);
	  
	  Order getOrderId(Long orderId);
		
	  Order updateOrder(Order order);
		
	  void deleteOrderById(Long orderId);

}
