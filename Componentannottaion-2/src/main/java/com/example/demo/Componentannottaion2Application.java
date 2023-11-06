package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.controller.book;
import com.example.demo.controller.historyBook;
import com.example.demo.controller.javabook;

@SpringBootApplication
public class Componentannottaion2Application {

	public static void main(String[] args) {
		ApplicationContext a=SpringApplication.run(Componentannottaion2Application.class, args);
		book b=a.getBean(book.class);
		historyBook b1=a.getBean(historyBook.class);
		javabook b2=a.getBean(javabook.class);
		b.usebook();
		b1.histbook();
		b2.javbook();
		}

}
