package com.sujon;

public class Account {

	int balance;
	int add;
	int withdraw;

	Account(int balance, int add, int withdraw) {
		this.balance = balance;
		this.add = add;
		this.withdraw = withdraw;
	}

	void add() {

		int updatebanace = balance + add;
		System.out.println(updatebanace);
	}

	void withdraw() {
		int finalbalance = (balance + add) - withdraw;
		System.out.println(finalbalance);
	}

}
