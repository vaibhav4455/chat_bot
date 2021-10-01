package com.moglix.InventoryProject.dto;

public class Inventory {
	
	private String invId;
	private String userId;
	private String productId;
	private String productQty;
	private float productPrice;
	
	public String getInvId() {
		return invId;
	}
	public void setInvId(String invId) {
		this.invId = invId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
	public float getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}
	public Inventory(String invId, String userId, String productId, String productQty, float productPrice) {
		super();
		this.invId = invId;
		this.userId = userId;
		this.productId = productId;
		this.productQty = productQty;
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Inventory [invId=" + invId + ", userId=" + userId + ", productId=" + productId + ", productQty="
				+ productQty + ", productPrice=" + productPrice + "]";
	}
	
	

}
