package com.klef.jfsd.exam.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.klef.jfsd.exam.model.Order;
import com.klef.jfsd.exam.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService{
	
	private final OrderRepository orderRepository;
	public OrderServiceImpl(OrderRepository orderRepository) {
		this.orderRepository=orderRepository;
	}

	@Override
	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}

}
