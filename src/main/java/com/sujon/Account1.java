package com.sujon;

public class Account1 {

	int initialbalance ;
	int add = 100;
	int withdraw = 500;
	int updatebalance;// 1100
	
	Account1(int initialbalance){
		this.initialbalance=initialbalance;
	}

	void add() {
		// +100$
		updatebalance = initialbalance + add;// updatebalance
		System.out.println(updatebalance);
	}

	void withdraw() {
		// -500$
		int finalbalance = updatebalance - withdraw;
		System.out.println(finalbalance);
	}

}
