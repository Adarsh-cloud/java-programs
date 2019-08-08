package com.capgemini.operation;

import java.util.HashMap;
import java.util.Scanner;

import com.capgemini.banking.bean.Account;
import com.capgemini.banking.bean.Customer;

public class BankOperations_Test implements BankOperations {
	
	HashMap<Integer, Account> hashMap = new HashMap<Integer, Account>();
	Scanner scan = new Scanner(System.in);
	@Override
	public  Account createAccount() {
		
		String firstName, lastName, address, emailId,phoneNumber;
		System.out.print("Enter your details\n");
		System.out.print("Enter your fname");
		firstName = scan.next();
		System.out.print("Enter your last");
		lastName = scan.next();
		System.out.print("Enter your add");
		address = scan.next();
		System.out.print("Enter your email");
		emailId = scan.next();
		System.out.print("Enter your ph");
		phoneNumber = scan.next();
		Customer customer = new Customer(firstName, lastName, phoneNumber, address, emailId);
		Account account = new Account("savings", customer, 1021215);
		hashMap.put(account.getAccountNumber(), account);
		
		
		return account;
		
	}

	@Override
	public int showBalance(int accountNumber) {
		int bal = 0;
		if(hashMap.containsKey(accountNumber)){
			
			bal=hashMap.get(accountNumber).getBalance();
		}
		
		return bal;
	}

	@Override
	public int Deposit(int amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int withdraw(int amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int fundTransfer() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void printTransactions() {
		// TODO Auto-generated method stub

	}

}
