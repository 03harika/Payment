package com.payment.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.payment.model.Payment;

public interface TransactionRepository extends JpaRepository<Payment, String>{

}
