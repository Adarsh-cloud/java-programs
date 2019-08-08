package com.capgemini.banking.bean;

public class Account {
	private String AccountType;
	private int AccountNumber;
	private int Balance;
	public int getBalance() {
		return Balance;
	}

	public void setBalance(int balance) {
		Balance = balance;
	}

	Customer customer;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account( String accountType,Customer customer, int accountNumber) {
		super();
		setCustomer(customer);
		setAccountType(accountType);
		setAccountNumber(accountNumber);
	}

	
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setAccountType(String accountType) {
		AccountType = accountType;
	}

	public String getAccountType() {
		return AccountType;
	}

	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}

	public int getAccountNumber() {
		return AccountNumber;
	}

	@Override
	public String toString() {
		return String.format("Account [AccountType=%s, AccountNumber=%s, customer=%s]", AccountType, AccountNumber,
				customer);
	}
	
	
}
