package com.Billing.Billing.repo;

import java.time.LocalDate;
import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Billing.Billing.entiy.Payment;
import com.Billing.Billing.service.IPayment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
	
	public Collection<Payment> findByDate(LocalDate date);
	
	public Payment deletepayment(Integer id);

}
