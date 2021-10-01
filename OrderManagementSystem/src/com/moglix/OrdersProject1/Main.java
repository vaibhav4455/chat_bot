package com.moglix.OrdersProject1;

import com.moglix.OrdersProject.dto.Orders;
import com.moglix.OrdersProject.service.OrdersService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Orders orders = new Orders();
		
		orders.setOrderId("a001");
		orders.setUserId("b001");
		orders.setInvId("c001");
		orders.setProductId("d001");
		orders.setProductQty("A");
		orders.setTotalPrice(1000f);
		orders.setGrandTotalPrice(50000);
		
		System.out.println(orders.getOrderId());
		System.out.println(orders.getUserId());
		System.out.println(orders.getInvId());
		System.out.println(orders.getProductId());
		System.out.println(orders.getProductId());
		System.out.println(orders.getTotalPrice());
		System.out.println(orders.getGrandTotalPrice());
		
		
		

	}

}
