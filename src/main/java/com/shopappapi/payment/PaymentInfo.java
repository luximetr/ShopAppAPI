package com.shopappapi.payment;

public class PaymentInfo {

	private String cardNumber;
	private int expiredMonth;
	private int expiredYear;
	private String cvv;
	
	public PaymentInfo(String cardNumber, int expiredMonth, int expiredYear, String cvv) {
		super();
		this.cardNumber = cardNumber;
		this.expiredMonth = expiredMonth;
		this.expiredYear = expiredYear;
		this.cvv = cvv;
	}
	
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public int getExpiredMonth() {
		return expiredMonth;
	}
	public void setExpiredMonth(int expiredMonth) {
		this.expiredMonth = expiredMonth;
	}
	public int getExpiredYear() {
		return expiredYear;
	}
	public void setExpiredYear(int expiredYear) {
		this.expiredYear = expiredYear;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	
	
}
