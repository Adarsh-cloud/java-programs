package com.capgemin.bean;

import java.util.ArrayList;
import java.util.List;

public class Account {
	
	private String accountNo;
	private String accountType;
	private double balance;
	private Customer customer;
	private List<Transaction> trans;

	public Account() {
		this.accountNo = setAccountNo();
		this.trans = new ArrayList<Transaction>();
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	private String setAccountNo() {
		String accountN = null;
		int ac = 0;
		ac = (int) (Math.random() * 1000000);
		accountN = "1234" + Integer.toString(ac);
		return this.accountNo = accountN;
	}

	public String getAccountNo() {

		return accountNo;
	}

	public Customer getCustomer() {
		return customer;
	}

	public List<Transaction> getTrans() {
		return trans;
	}

	public void addTransaction(Transaction tra) {
		this.trans.add(tra);
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		/*
		 * Scanner sc=new Scanner(System.in); System.out.
		 * println("Press 1 for Saving Account\nPress 2 for Current Account");
		 * int x=sc.nextInt(); sc.close(); if(x==1){
		 * accountType="Saving Account";} else
		 * if(x==2){accountType="Current Account";} else {accountType=null;}
		 * return accountType;
		 */

		this.accountType = accountType;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "accountNo=" + accountNo + ", accountType=" + accountType + ", balance=" + balance + "" + customer;
	}

}
