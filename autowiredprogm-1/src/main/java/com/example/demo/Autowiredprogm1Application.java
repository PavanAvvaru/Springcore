package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.controller.paymentprocessor;
import com.example.demo.services.CreditCard;
import com.example.demo.services.debitcard;
import com.example.demo.services.zitacard;

@SpringBootApplication
public class Autowiredprogm1Application {

	public static void main(String[] args) {
		ApplicationContext a=SpringApplication.run(Autowiredprogm1Application.class, args);
		paymentprocessor p=a.getBean(paymentprocessor.class);
		System.out.println(p.dopayment());
	}

}
