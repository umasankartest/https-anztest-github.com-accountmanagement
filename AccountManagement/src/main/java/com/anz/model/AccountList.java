package com.anz.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity(name="AccountList")
@Table(name="account_list")
public class AccountList {

	
	@Id
	private int accountNumber;
	private String accountname;
	private String accountType;
	private Date balancedate;
	private String currency;
	private double availBalance;
	@OneToMany(cascade = CascadeType.ALL,orphanRemoval=true)
	private List<AccountTransaction> transactions;
	
	
	public int getAccountNumber() {
		return accountNumber;
	}



	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}



	public String getAccountname() {
		return accountname;
	}



	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}



	public String getAccountType() {
		return accountType;
	}



	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}



	public Date getBalancedate() {
		return balancedate;
	}



	public void setBalancedate(Date balancedate) {
		this.balancedate = balancedate;
	}



	public String getCurrency() {
		return currency;
	}



	public void setCurrency(String currency) {
		this.currency = currency;
	}



	public double getAvailBalance() {
		return availBalance;
	}



	public void setAvailBalance(double availBalance) {
		this.availBalance = availBalance;
	}

  
	public List<AccountTransaction> getTransactions() {
		return transactions;
	}



	public void setTransactions(List<AccountTransaction> transactions) {
		this.transactions = transactions;
	}
		

}
