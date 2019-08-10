package com.capgemin.ui;

import java.util.Scanner;

import com.capgemin.bean.Account;
import com.capgemin.bean.Customer;
import com.capgemin.exception.AccountNotFoundExp;
import com.capgemin.exception.InsufficientBalanceExp;
import com.capgemin.service.ServiceAImplement;

public class Test {
	static Scanner scan = new Scanner(System.in);

	public static String getInput(String message) {
		System.out.println(message);
		String input = scan.next();
		return input;
	}

	public static Account getAccount() {
		Account a1 = new Account();
		Customer c1 = new Customer();
		a1.setAccountType(getInput("Saving or Current"));
		c1.setName(getInput("Enter Name"));
		c1.setPhoneNo(getInput("Enter Your PhoneNo."));
		c1.setAddress(getInput("Enter Your Address"));
		a1.setBalance(Double.parseDouble(getInput("Enter Your Initial Balance")));
		a1.setCustomer(c1);
		return a1;
	}

	public static void main(String[] args) {
		ServiceAImplement Imple = new ServiceAImplement();
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		while (choice != 20) {
			System.out.println("Welcome to Anna Bank");
			System.out.println("1- Create New Account ");
			System.out.println("2- Deposite");
			System.out.println("3- Withdraw Money");
			System.out.println("4- Show Balance");
			System.out.println("5- Fund Transfer");
			System.out.println("6- Print Transaction");
			System.out.println("7- Display ");
			System.out.println("8- Exit");
			System.out.println("Enter a choice");
			choice = scan.nextInt();
			switch (choice) {
			case 1:

				Account a1 = getAccount();
				Imple.CreateAccount(a1);
				System.out.println("Account Created Successfully\n" + "Name:" + a1.getCustomer().getName()
						+ "\nAccount Number:" + a1.getAccountNo() + "\nAccount Type:" + a1.getAccountType());

				System.out.println("Account Created");

				break;
			case 2:
				try {
					System.out.println("Give Account and Amount to be Deposited");
					String Number = scan.next();
					double amt = scan.nextDouble();
					Imple.deposit(Number, amt);
				} catch (AccountNotFoundExp e) {
					System.out.println(e.getMessage());

				}
				break;

			case 3:
				try {
					System.out.println("Give Your Account Number and Amount to be WithDraw:");
					String accW = scan.next();
					double amt1 = scan.nextDouble();
					Imple.withDraw(accW, amt1);
					System.out.println("Withdraw SuccessFully");
				} catch (AccountNotFoundExp e) {
					System.out.println(e.getMessage());
				} catch (InsufficientBalanceExp e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				try {
					System.out.println("Give Your Account Number ");
					String accB = scan.next();
					Imple.showBalance(accB);
				} catch (AccountNotFoundExp e) {
					System.out.println(e.getMessage());
				}
				break;
			case 5:
				try {
					System.out.println("Give From Account Number ");
					String accf = scan.next();
					System.out.println("Give To Account Number ");
					String acct = scan.next();
					System.out.println("Amount To be Transferred ");
					double amtT = scan.nextDouble();
					Imple.fundTransfer(accf, acct, amtT);
					System.out.println("Transfer Successfull");
				} catch (InsufficientBalanceExp e) {
					System.out.println(e.getMessage());
				} catch (AccountNotFoundExp e) {
					System.out.println(e.getMessage());
				}
				break;

			case 6:
				try {
					System.out.println("Give From Account Number to Print Transaction Report");
					String accT = scan.next();
					Imple.showTransaction(accT);
				} catch (AccountNotFoundExp e) {
					System.out.println(e.getMessage());
					;
				}
				break;

			case 7:
				System.out.println(Imple.displayAccount());
				break;
			default:
				System.out.println("Wrong Input Entered");
				System.exit(0);

			}
			scan.close();

		}
	}

}
