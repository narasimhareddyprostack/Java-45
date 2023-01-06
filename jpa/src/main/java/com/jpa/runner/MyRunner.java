package com.jpa.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jpa.entity.Account;
import com.jpa.repository.AccountRepository;

@Component
public class MyRunner implements CommandLineRunner {

	
	@Autowired
	AccountRepository accountRepo;
	@Override
	public void run(String... args) throws Exception {
		Account a1 = new Account();
		a1.setAcc_Id(101);
		a1.setAcc_Name("Rahul");
		a1.setAcc_EmailId("rahul@gmail.com");
		a1.setAcc_Amount(50000);
		
		accountRepo.save(a1);
		
	}

}
