package com.shopappapi.payment;

public class CartItem {

	private String productId;
	private int amount;
	
	public CartItem(String productId, int amount) {
		super();
		this.productId = productId;
		this.amount = amount;
	}
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}
