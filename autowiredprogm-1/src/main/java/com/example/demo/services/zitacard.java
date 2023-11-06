package com.example.demo.services;

import org.springframework.stereotype.Component;

@Component
public class zitacard implements Payment{

	@Override
	public String paybill() {
		// TODO Auto-generated method stub
		return "payed using zetacard";
	}

}
