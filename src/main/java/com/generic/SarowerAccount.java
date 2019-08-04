package com.generic;

import org.testng.annotations.Test;

public class SarowerAccount {

	@Test
	public void getTestRunner() {
		Account obj = new Account(1000,300);
		//obj.setBalance(1000);
		//obj.setAdd(300);
	System.out.println(obj.getBalance()+obj.getAdd());
		
	}
	
}
