package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.service.historyBooks;
import com.example.demo.service.programmingbooks;
@Component
public class Librarycontrol {
	private historyBooks hb;
	private programmingbooks pb;
	@Autowired
	public Librarycontrol(historyBooks hb, programmingbooks pb) {
		super();
		this.hb = hb;
		this.pb = pb;
	}
	public String access()
	{
		return pb.books() +"\n"+hb.books();
	}
}
