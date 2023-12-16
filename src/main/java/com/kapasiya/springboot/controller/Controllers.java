package com.kapasiya.springboot.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.kapasiya.springboot.entity.Order;
import com.kapasiya.springboot.services.Services;

public class Controllers 
{
	private Services services;
	
	@GetMapping("/orders")
	public String listOredr(Model model)
	{
		model.addAttribute("orders",services.getAllOrders());
		return "orders";
	}
	
	@GetMapping("/orders/new")
	public String createStudentForm(Model model)
	{
		Order order = new Order();
		model.addAttribute("orders",order);
		
		return "create_order";
	}
	
	@PostMapping("/order")
	public String saveStudent(@ModelAttribute("order") Order order)
	{
		
		services.saveOrder(order);
		return "redirect:/orders";
	}
	
	@GetMapping("/orders/edit/{orderId}")
	public String editStudentForm(@PathVariable Long order,Model model)
	{
		model.addAttribute("order",services.getOrderId(order));
		return "edit_student";
	}
	
	@GetMapping("/orders/{orderId}")
	public String deleteStudent(@PathVariable Long order) {
		services.deleteOrderById(order);
		return "redirect:/students";
	}
	
	@PostMapping("/students/{orderId}")
	public String updateStudent(@PathVariable Long order,@ModelAttribute("order") Order orders,Model model) {
		
		// get student from database by id
		Order existingStudent = services.getOrderId(order);
		existingStudent.setOrderId(orders.getOrderId());
		existingStudent.setOrdername(orders.getOrdername());
		existingStudent.setCurrencyUomId(orders.getCurrencyUomId());
		existingStudent.setSalesChannelEnumId(orders.getSalesChannelEnumId());
		existingStudent.setStatusId(orders.getStatusId());
		existingStudent.setProductStoreId(orders.getProductStoreId());
		existingStudent.setPlacedDate(orders.getPlacedDate());
		
		// save updated student object
		services.updateOrder(existingStudent);
		return "redirect:/students";		
	}
}
