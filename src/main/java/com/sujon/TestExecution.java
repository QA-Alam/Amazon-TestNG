package com.sujon;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class TestExecution {
	int a;
	 int b;
	 int c;
	@Test()
	public void getvalue() {
		Account obj = new Account(a,b,c);
		obj.add();
		obj.withdraw();
	}
	
	 @Factory (dataProvider="value")
	    public TestExecution(int a,int b,int c){
		 System.out.println(a+b+c);
	        this.a=a;
	        this.b =b;
	        this.c=c;
	       
	    }
	
	@DataProvider(name = "value")

	public static Object[][] amount() {

		return new Object[][] { { 1000 ,100 , 500}};

	}
	
}
