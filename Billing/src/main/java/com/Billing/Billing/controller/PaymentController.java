package com.Billing.Billing.controller;

import java.time.LocalDate;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.CollectionUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Billing.Billing.entiy.Payment;
import com.Billing.Billing.service.IPayment;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	
		@Autowired
		private IPayment payService;
		
		private Payment newPayment;
		
		@PostMapping("/create")
		public ResponseEntity<?> createPayement(@RequestBody Payment newPayment)
		{
			try {
				Boolean isCreated=payService.createPayement(newPayment);
				if(isCreated)
				{
					System.out.println(" payment done Sucessfully!!");
					return new ResponseEntity<>("payment doneSucessfully!!",HttpStatus.CREATED);
					
				}
				else
				{
					
					return new ResponseEntity<>("payment not created",HttpStatus.BAD_REQUEST);
				}
			} catch ( Exception ex) {
				return new ResponseEntity<>(ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}


		@GetMapping("/allpay")
		public ResponseEntity<?> readAllPayment(LocalDate date)
		{
			Collection<Payment> payment=payService.readAllPayment(date);
			if(ObjectUtils.isEmpty(payment))
			{
				return new ResponseEntity<>(" payment not found",HttpStatus.NO_CONTENT);
			}
			else
			{
				return new ResponseEntity<>(newPayment,HttpStatus.OK);
			}
				
			}


}
