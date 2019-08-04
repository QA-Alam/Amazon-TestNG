package com.learning;

public class variableBasic {
	
	int b=2;//instance
	static int c=20;//static /class level
	
	public void getsalary() {	
		int a=1;//local
		b=40;//instance
		c=30;//static
	}
	
	public static void getmoney() {
		int d=70;//local
		//b=90;//instance<<<<<<<<<<<<<<<problem
		c=50;//static
		
	}
	

}
