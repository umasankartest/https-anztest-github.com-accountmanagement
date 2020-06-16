package com.anz.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="AccountTranssaction")
@Table(name="account_transt")
public class AccountTransaction {

	
	@Id
	private int accountNumber;
	private String accountName;
	private String accountType;
	private Date   valueDate;
	public String getAccountName() {
		return accountName;
	}



	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}



	public String getAccountType() {
		return accountType;
	}



	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}



	public Date getValueDate() {
		return valueDate;
	}



	public void setValueDate(Date valueDate) {
		this.valueDate = valueDate;
	}



	public String getCurrency() {
		return currency;
	}



	public void setCurrency(String currency) {
		this.currency = currency;
	}



	public double getDebitAmount() {
		return debitAmount;
	}



	public void setDebitAmount(double debitAmount) {
		this.debitAmount = debitAmount;
	}



	public double getCreditAmount() {
		return creditAmount;
	}



	public void setCreditAmount(double creditAmount) {
		this.creditAmount = creditAmount;
	}



	public String getDebitOrCredit() {
		return debitOrCredit;
	}



	public void setDebitOrCredit(String debitOrCredit) {
		this.debitOrCredit = debitOrCredit;
	}



	public String getNarrative() {
		return narrative;
	}



	public void setNarrative(String narrative) {
		this.narrative = narrative;
	}



	private String currency;
	private double debitAmount;
	private double creditAmount;
	private String debitOrCredit;
	private String narrative;
	
	
	
	public int getAccountNumber() {
		return accountNumber;
	}



	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	

}
