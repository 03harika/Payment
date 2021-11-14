package com.payment.service;
import java.util.List;
import com.payment.model.Payment;

public interface TransactionService {
	public List<Payment> getPaymentData();
}

