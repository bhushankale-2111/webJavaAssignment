package com.Billing.Billing.service;

import java.time.LocalDate;
import java.util.Collection;

import com.Billing.Billing.entiy.Payment;

public interface IPayment {
	
	//Create payment
	boolean createPayement(Payment newPayment);
   // Read payments (By specific date)
	public Collection<Payment> readAllPayment(LocalDate date);
    // Read single payment
	public Payment readPaymentById(Integer id);
    // Refund payment
	public Payment refundpayment(Payment newPayment);
  // Delete payment
	public Payment deletepayment(Integer id);
	Payment refundpayment(String paystatus);

}
