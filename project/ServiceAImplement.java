package com.capgemin.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.capgemin.bean.Account;
import com.capgemin.bean.Transaction;
import com.capgemin.dao.AccountDao;
import com.capgemin.exception.AccountNotFoundExp;
import com.capgemin.exception.InsufficientBalanceExp;

public class ServiceAImplement implements ServiceAInterface {

	AccountDao dao = new AccountDao();
	// Map<String, Account> acc = new HashMap<>();

	@Override
	public void CreateAccount(Account account) {
		dao.storeIntoMap(account);
		// System.out.println("Account Created Successfully\n" + "Name:" +
		// account.getCustomer().getName()
		// + "\nAccount Number:" + account.getAccountNo() + "\nAccount Type:" +
		// account.getAccountType());

	}

	@Override
	public void deposit(String accountNo, double amount) throws AccountNotFoundExp {
		if (dao.xyz.containsKey(accountNo)) {

			dao.xyz.get(accountNo).setBalance(amount + dao.xyz.get(accountNo).getBalance());
			System.out.println("Deposite Successful");
			Transaction t1 = new Transaction();
			t1.setTransAmount(amount);
			t1.setTransDescription("Deposite");
			t1.setTransType("Cash");
			dao.xyz.get(accountNo).addTransaction(t1);
		} else
			throw new AccountNotFoundExp("Account Not Found");

	}

	@Override
	public void withDraw(String accountNo, double amount) throws InsufficientBalanceExp, AccountNotFoundExp {

		if (dao.xyz.containsKey(accountNo)) {
			if (dao.xyz.get(accountNo).getBalance() > amount) {
				double updateV = 0;
				updateV = dao.xyz.get(accountNo).getBalance() - amount;
				dao.xyz.get(accountNo).setBalance(updateV);
				Transaction t2 = new Transaction();
				t2.setTransAmount(amount);
				t2.setTransDescription("Withdraw");
				t2.setTransType("Cash");
				dao.xyz.get(accountNo).addTransaction(t2);
			} else {
				throw new InsufficientBalanceExp("Insufficient Balance");

			}
		} else
			throw new AccountNotFoundExp("Account Not Found");

	}

	@Override
	public void showBalance(String accountNo) throws AccountNotFoundExp {
		if (dao.xyz.containsKey(accountNo)) {
			System.out.println(dao.xyz.get(accountNo).getBalance());

		}
		throw new AccountNotFoundExp("Account Not Found");

	}

	@Override
	public void fundTransfer(String fromAccount, String toAccount, double amount)
			throws InsufficientBalanceExp, AccountNotFoundExp {

		if (dao.xyz.get(fromAccount).getBalance() > amount) {
			if (dao.xyz.containsKey(fromAccount)) {
				if (dao.xyz.containsKey(toAccount)) {
					dao.xyz.get(toAccount).setBalance(amount + dao.xyz.get(toAccount).getBalance());
					Transaction t3 = new Transaction();
					t3.setTransAmount(amount);
					t3.setTransDescription("FundTransfer ");
					t3.setTransType("Online");
					dao.xyz.get(fromAccount).addTransaction(t3);
					dao.xyz.get(fromAccount).setBalance(dao.xyz.get(fromAccount).getBalance() - amount);
				} else {
					throw new AccountNotFoundExp("Account Not found");
				}
				Transaction t4 = new Transaction();
				t4.setTransAmount(amount);
				t4.setTransDescription("FundTransfer");
				t4.setTransType("Online");
				dao.xyz.get(toAccount).addTransaction(t4);

			} else {
				throw new AccountNotFoundExp("Account Not found");
			}
		} else {
			throw new InsufficientBalanceExp("Insufficient Balance");
		}

	}

	@Override
	public void showTransaction(String accountNo) throws AccountNotFoundExp {
		if (dao.xyz.containsKey(accountNo)) {
			List<Transaction> trans = dao.xyz.get(accountNo).getTrans();
			Collections.sort(trans);
			DateFormat simple = new SimpleDateFormat("dd/MM/yyyy  HH:mm");
			System.out.println("Transaction Id    \tDate    \tType    \tAmount    \t Description");
			for (Transaction transaction : trans) {
				String date = simple.format(new Date((long) transaction.getTimeInMiliSeconds()));
				System.out.println(transaction.getTransId() + "   \t" + date + "   \t" + transaction.getTransAmount()
						+ "    s\t" + transaction.getTransDescription());
			}

		} else
			throw new AccountNotFoundExp("Account Not Found");
	}

	@Override
	public Map<String, Account> displayAccount() {

		return dao.displayAccount();
	}

}
