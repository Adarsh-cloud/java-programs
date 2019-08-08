package com.capgemini.ui;

import java.util.Scanner;

import com.capgemini.banking.bean.Account;
import com.capgemini.banking.bean.Customer;
import com.capgemini.operation.BankOperations_Test;

public class BankApplication {
	public static void main(String[] args) {
		BankOperations_Test bankOperation_Test = new BankOperations_Test();
		int ch = 0;
		Scanner sc = new Scanner(System.in);
		while (ch != 7) {
			System.out.println("--------Bank Account Application--------");
			System.out.println("--------1.Create an Account-------------");
			System.out.println("--------2.Show Balance------------------");
			System.out.println("--------3.Deposit-----------------------");
			System.out.println("--------4.Withdraw----------------------");
			System.out.println("--------5.FundTransfer------------------");
			System.out.println("--------6.Print Transactions------------");
			System.out.println("--------7.Exit--------------------------");
			System.out.println("Enter your choice");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				Account bool = bankOperation_Test.createAccount();
				System.out.println(bool);
				break;

			case 2:
				int x = sc.nextInt();
				System.out.println(bankOperation_Test.showBalance(x));

				break;

			case 3:
				break;

			case 4:
				break;

			case 5:
				break;

			case 6:
				break;

			case 7:
				System.exit(0);

			default:
				System.out.println("Please enter a valid Choice");
			}
		}
		sc.close();
	}
}
