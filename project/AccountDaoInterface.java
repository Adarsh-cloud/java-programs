package com.capgemin.dao;

import java.util.Map;

import com.capgemin.bean.Account;

public interface AccountDaoInterface {
	void storeIntoMap(Account account);

	Map<String, Account> displayAccount();
}
