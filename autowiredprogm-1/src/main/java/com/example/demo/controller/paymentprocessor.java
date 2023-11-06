package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.services.*;
@Component
public class paymentprocessor {
	@Autowired
	private debitcard db;
	//private CreditCard cd;
	//private zitacard zb;
	//@Autowired
	/*public paymentprocessor(debitcard db, CreditCard cd, zitacard zb) {
		super();
		this.db = db;
		this.cd = cd;
		this.zb = zb;
	}*/
	public String dopayment()
	{
		return db.paybill();
	}

}
