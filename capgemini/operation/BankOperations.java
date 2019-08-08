package com.capgemini.operation;
import com.capgemini.banking.bean.Account;



public interface BankOperations {
	Account createAccount();
	int showBalance(int accountNumber);
	int Deposit(int amount);
	int withdraw(int amount);
	int fundTransfer();
	void printTransactions();

}
