package com.moglix.OrdersProject.dto;

public class Orders {
	
	private String orderId;
	private String userId;
	private String invId;
	private String productId;
	private String productQty;
	private float totalPrice;
	private float grandTotalPrice;
	
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getInvId() {
		return invId;
	}
	public void setInvId(String invId) {
		this.invId = invId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductQty() {
		return productQty;
	}
	public void setProductQty(String productQty) {
		this.productQty = productQty;
	}
	public float getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
	public float getGrandTotalPrice() {
		return grandTotalPrice;
	}
	public void setGrandTotalPrice(float grandTotalPrice) {
		this.grandTotalPrice = grandTotalPrice;
	}
	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", userId=" + userId + ", invId=" + invId + ", productId=" + productId
				+ ", productQty=" + productQty + ", totalPrice=" + totalPrice + ", grandTotalPrice=" + grandTotalPrice
				+ "]";
	}
	
	
	
	
	
}
