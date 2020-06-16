package com.anz.dao;

import org.springframework.data.repository.CrudRepository;

import com.anz.model.AccountTransaction;


public interface AccountTransactionRepository extends CrudRepository<AccountTransaction, Integer>{



}
