package com.capgemin.dao;

import java.util.HashMap;
import java.util.Map;

import com.capgemin.bean.Account;

public class AccountDao implements AccountDaoInterface {

	public Map<String, Account> xyz = new HashMap<String, Account>();

	@Override
	public void storeIntoMap(Account account) {
		xyz.put(account.getAccountNo(), account);

	}

	@Override
	public Map<String, Account> displayAccount() {

		return xyz;
	}

}
