package com.shopappapi.payment;

public class ShippingInfo {

	private String fullName;
	private String address;
	private String city;
	private String zipCode;
	private String country;
	private String shippingMethod;
	
	public ShippingInfo(String fullName, String address, String city, String zipCode, String country,
			String shippingMethod) {
		super();
		this.fullName = fullName;
		this.address = address;
		this.city = city;
		this.zipCode = zipCode;
		this.country = country;
		this.shippingMethod = shippingMethod;
	}
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getShippingMethod() {
		return shippingMethod;
	}
	public void setShippingMethod(String shippingMethod) {
		this.shippingMethod = shippingMethod;
	}
	
}
