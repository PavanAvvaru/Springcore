package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.controller.Librarycontrol;

@SpringBootApplication
public class AutowiredprogmApplication {

	public static void main(String[] args) {
		ApplicationContext a=SpringApplication.run(AutowiredprogmApplication.class, args);
		Librarycontrol l=a.getBean(Librarycontrol.class);
		System.out.println(l.access());
	}

}
