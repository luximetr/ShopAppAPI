package com.shopappapi.payment;

import java.util.List;

public class PaymentForm {
	
	private List<CartItem> cartItems;
	private ShippingInfo shippingInfo;
	private PaymentInfo paymentInfo;
	
	public PaymentForm(List<CartItem> cartItems, ShippingInfo shippingInfo, PaymentInfo paymentInfo) {
		super();
		this.cartItems = cartItems;
		this.shippingInfo = shippingInfo;
		this.paymentInfo = paymentInfo;
	}
	
	public List<CartItem> getCartItems() {
		return cartItems;
	}
	public void setCartItems(List<CartItem> cartItems) {
		this.cartItems = cartItems;
	}
	public ShippingInfo getShippingInfo() {
		return shippingInfo;
	}
	public void setShippingInfo(ShippingInfo shippingInfo) {
		this.shippingInfo = shippingInfo;
	}
	public PaymentInfo getPaymentInfo() {
		return paymentInfo;
	}
	public void setPaymentInfo(PaymentInfo paymentInfo) {
		this.paymentInfo = paymentInfo;
	}
}
