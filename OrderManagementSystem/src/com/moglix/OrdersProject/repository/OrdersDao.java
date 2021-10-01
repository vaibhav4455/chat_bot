package com.moglix.OrdersProject.repository;

import com.moglix.OrdersProject.dto.Orders;

public class OrdersDao {
	
	
	private static int counter =0;
	
	Orders orders[] = new Orders[10];
	
	public String addOrder(Orders order){
		
		if(counter<orders.length) {
			
			orders[counter++] = order;
			return "success";
		}
		
		else
		{
			return "array is full";
		}

}
	
	
	public Orders getOrderById(String id) {
		
		for (Orders order1 : orders) {
			
			if(order1 != null && id.equals(order1.getOrderId())){
				
				return order1;
			}
			
		}
	 return null;
	}
	
	
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
	
	public String updateOrder(String id , Orders order) {
		
		int index = this.getIndex(id);
		if(index !=-1) {
			orders[index] = order;
			return "success";
		}
		else {
			return "notfound";
		}
	
	}
	
	
	public void deleteAllOrder() {
		orders = null;
		
	}
	
	
}