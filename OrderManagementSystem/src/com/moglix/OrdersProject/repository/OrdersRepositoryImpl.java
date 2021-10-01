package com.moglix.OrdersProject.repository;

import com.moglix.OrdersProject.dto.Orders;

public class OrdersRepositoryImpl implements OrdersRepository {
	
private static int counter =0;
	
	Orders orders[] = new Orders[10];
	

	private static OrdersRepository ordersRepository;
	
	private OrdersRepositoryImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public static OrdersRepository getInstance() {
		if(ordersRepository == null) {
			ordersRepository = new OrdersRepositoryImpl();
			return ordersRepository;
		}
		else {
			return ordersRepository;
		}
		
	}
	
	
	@Override
	public String addOrder(Orders order) {

		if(counter<orders.length) {
			
			orders[counter++] = order;
			return "success";
		}
		
		else
		{
			return "array is full";
		}
	}
	
	
	@Override
	public void deleteAllOrder() {
		orders = null;
	}
	
	
	@Override
	public Orders getOrderById(String id) {
		for (Orders order1 : orders) {
			
			if(order1 != null && id.equals(order1.getOrderId())){
				
				return order1;
			}
			
		}
	 return null;
	}
	
	
	@Override
	public Orders[] getOrders() {
		return orders;
	}
	
	private int  getIndex(String id) {
		for (int i = 0; i < orders.length; i++) {
			if(orders[i] != null && orders[i].getOrderId().equals(id)) {
				return i;
			}
			
		}
		return -1;
	}
	
	
	
	@Override
	public String updateOrder(String id, Orders order) {
		int index = this.getIndex(id);
		if(index !=-1) {
			orders[index] = order;
			return "success";
		}
		else {
			return "notfound";
		}
	
	}
	
	@Override
	public String deleteOrderById(String id) {
		int index = this.getIndex(id);
		if(index !=-1) {
			orders[index] = null;
			return "success";
		}
		else {
			return "notfound";
		}
	
	
}
	}
