package com.moglix.OrdersProject.service;

import com.moglix.OrdersProject.dto.Orders;
import com.moglix.OrdersProject.repository.OrdersRepository;
import com.moglix.OrdersProject.repository.OrdersRepositoryImpl;

public class OrdersServiceImpl implements OrdersServiceIn {
	
	OrdersRepository ordDao = OrdersRepositoryImpl.getInstance();
	
	private static  OrdersServiceIn ordersServices;
	private OrdersServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public static OrdersServiceIn getInstace() {
		if(ordersServices == null) {
			ordersServices = new OrdersServiceImpl();
			return ordersServices;
		}
		else {
			return ordersServices;
		}
	}
	
	@Override
	public String addOrder(Orders order) {
		return ordDao.addOrder(order);
	}

@Override
public void deleteAllOrder() {
	ordDao.deleteAllOrder();
	
}

@Override
public String deleteOrderById(String id) {
	return ordDao.deleteOrderById(id);

}

@Override
public Orders getOrderById(String id) {
	return ordDao.getOrderById(id);

}

@Override
public Orders[] getOrders() {
	return ordDao.getOrders();

}

@Override
public String updateOrder(String id, Orders order) {
	return ordDao.updateOrder(id, order);

}

}
