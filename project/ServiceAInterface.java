package com.capgemin.service;

import java.util.Map;

import com.capgemin.bean.Account;
import com.capgemin.exception.AccountNotFoundExp;
import com.capgemin.exception.InsufficientBalanceExp;

public interface ServiceAInterface {
	public abstract void CreateAccount(Account account);

	public void deposit(String accountNo, double amount) throws AccountNotFoundExp;

	public void withDraw(String accountNo, double amount) throws AccountNotFoundExp, InsufficientBalanceExp;

	public void showBalance(String accountNo) throws AccountNotFoundExp;

	public void fundTransfer(String fromAccount, String toAccount, double amount)
			throws AccountNotFoundExp, InsufficientBalanceExp;

	public void showTransaction(String accountNo) throws AccountNotFoundExp;

	public Map<String, Account> displayAccount();
}
