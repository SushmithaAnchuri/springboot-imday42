package com.jobiak.imd;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jobiak.imd.model.Customer;
import com.jobiak.imd.repositorry.CustomerRepo;

@SpringBootApplication
public class SpringbootImday42Application  {

	
	 
	 
		public static void main(String[] args) {
			//System.out.println("application started");
			SpringApplication.run(SpringbootImday42Application.class, args);
			//System.out.println("boot app started");
		}


		
			


		/*
		 * @Override public void run(String... args) throws Exception {
		 * 
		 * Customer c1 = new Customer(); c1.setAcctno(101); c1.setName("John");
		 * c1.setBalance(4000.00); repo.save(c1);
		 * 
		 * Customer c2 = new Customer(); c2.setAcctno(102); c2.setName("Rachel");
		 * c2.setBalance(5000); repo.save(c2);
		 * 
		 * Customer c3 = new Customer(); c3.setAcctno(103); c3.setName("Priya");
		 * c3.setBalance(9000); repo.save(c3);
		 * 
		 * Customer c4 = new Customer(); c4.setAcctno(104); c4.setName("Honey");
		 * c4.setBalance(10000); repo.save(c4);
		 * 
		 * Customer c5 = new Customer(); c5.setAcctno(105); c5.setName("Sushma");
		 * c5.setBalance(12000); repo.save(c5);
		 * 
		 * Optional<Customer> cust = repo.findById(102L); if (cust.isPresent()) {
		 * System.out.println(cust.get()); } List<Customer>list=repo.findAll();
		 * for(Customer c:list) { System.out.println(c); }
		 * 
		 * }
		 */
	}

