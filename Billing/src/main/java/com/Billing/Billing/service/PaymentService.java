package com.Billing.Billing.service;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.Billing.Billing.entiy.Payment;
import com.Billing.Billing.repo.PaymentRepository;

@Service
public class PaymentService implements IPayment  {

	
	public PaymentRepository peyRepo;
	
	@Override
	public boolean createPayement(Payment newPayment) {

		Optional<Payment> existingpayment= peyRepo.findById(newPayment.getPaymentId());
		if(!ObjectUtils.isEmpty(existingpayment))
		{
			throw new ResourceAlreadyExistException("payment already available with id.");
		}
		
		// 2.if not  available with same name save team
		Payment savePayment = peyRepo.save(newPayment);
	     if(ObjectUtils.isEmpty(savePayment))
	     {
	    	 return true;
	     }
	     else
	     {
	    	 return false;
	     }
		
	
	}
	

	@Override
	public Collection<Payment> readAllPayment(LocalDate date) {
		return peyRepo.findByDate(date);
		
		
			
			
		}

	

	@Override
	public Payment readPaymentById(Integer id) {
		return peyRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("payment not found of id:"+id));
		
		
	}

	@Override
	public Payment refundpayment(String paystatus) {
		return null;
		
		
	
	}


	@Override
	public Payment refundpayment(Payment newPayment) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Payment deletepayment(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
		
	

	/*@Override
	public Payment deletepayment(Integer id) {
		
		 Payment deletepayment=peyRepo.deleteById(id).orElseThrow(()-> new ResourceNotFoundException("payment not found of id or already deleted:"+id));
		
		 return deletepayment;
	}*/


	

	
	

}
