package com.moglix.OrdersProject.service;

import com.moglix.OrdersProject.dto.Orders;

public interface OrdersServiceIn {
	
	public String addOrder(Orders order);
	public Orders getOrderById(String id);
	public Orders[] getOrders();
	public String deleteOrderById(String id);
	public String updateOrder(String id , Orders order);
	public void deleteAllOrder();

}
