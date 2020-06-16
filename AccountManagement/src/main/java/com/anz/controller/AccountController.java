package com.anz.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anz.dao.AccountRepository;
import com.anz.dao.AccountTransactionRepository;
import com.anz.model.AccountList;
import com.anz.model.AccountTransaction;

@RestController
public class AccountController {

	@Autowired
	AccountRepository repo;
	
	@Autowired
	AccountTransactionRepository transactionRepo;
		
	@GetMapping("/accountList")
	public Iterable<AccountList> getAccountList() {
		
		return repo.findAll();
	}
	
	@GetMapping("/accountTransactions")
	public Optional<AccountTransaction> getAccountTrnsactions(@RequestParam int id) {
		
	return transactionRepo.findById(id);
	
	}

}
