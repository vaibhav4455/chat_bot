package com.moglix.OrdersProject.repository;

import com.moglix.OrdersProject.dto.Orders;

public interface OrdersRepository {
	
	public String addOrder(Orders order);
	public Orders getOrderById(String id);
	public Orders[] getOrders();
	public String deleteOrderById(String id);
	public String updateOrder(String id , Orders order);
	public void deleteAllOrder();

}
