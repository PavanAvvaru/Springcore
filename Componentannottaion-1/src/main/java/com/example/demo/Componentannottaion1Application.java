package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.controller.NonVegPizza;
import com.example.demo.controller.PizzaController;
import com.example.demo.controller.VegPizza;

@SpringBootApplication
public class Componentannottaion1Application {

	public static void main(String[] args) {
		ApplicationContext a=SpringApplication.run(Componentannottaion1Application.class, args);
		PizzaController p1=a.getBean(PizzaController.class);
		VegPizza p2=a.getBean(VegPizza.class);
		NonVegPizza p3=a.getBean(NonVegPizza.class);
		System.out.println(p1.getpizza());
		System.out.println(p2.getvegpizza());
		System.out.println(p3.getnonvegpizza());
	}

}
