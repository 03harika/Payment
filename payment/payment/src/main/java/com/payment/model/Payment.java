package com.payment.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="APP",name="PAYMENT")
public class Payment {
	@Id
	@Column(name="PAYMENT_ID")
	private String paymentId;
	
	@Column(name="USER_ID ")
	private String userId;
	
	@Column(name="PRODUCT_NAME")
	private String productName;
	
	@Column(name="AMOUNT")
	private String amount;

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	
	
}

  


 
