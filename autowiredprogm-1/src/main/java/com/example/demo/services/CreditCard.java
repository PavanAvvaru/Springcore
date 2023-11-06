package com.example.demo.services;

import org.springframework.stereotype.Component;

@Component
public class CreditCard implements Payment {

	@Override
	public String paybill() {
		
		return "payed by creditcard";
	}
	

}
