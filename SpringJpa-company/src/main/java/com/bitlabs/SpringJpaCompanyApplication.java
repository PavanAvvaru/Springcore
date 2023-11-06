package com.bitlabs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bitlabs.entity.Company;
import com.bitlabs.repository.CompayRepos;

@SpringBootApplication
public class SpringJpaCompanyApplication implements CommandLineRunner{
	@Autowired
	private CompayRepos cr;
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaCompanyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Company c1=new Company();
		c1.setName("accenture");
		c1.setSalary(25000);
		Company c2=new Company();
		c2.setName("ibm");
		c2.setSalary(50000);
		cr.saveAll(listof(c1,c2));
		
	}

	private Iterable listof(Company c1, Company c2) {
		// TODO Auto-generated method stub
		return null;
	}
}
