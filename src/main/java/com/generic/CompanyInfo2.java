package com.generic;

public class CompanyInfo2 {

	int a;
	int b;
	int c;

	public CompanyInfo2(int a, int b) {

		this.a = a;
		this.b = b;
		
	}

	void getAdd() {
		c = a + b;
		System.out.println(c);
	}

	void getSub() {
		c = a - b;
		System.out.println(c);
	}

	void getMultiply() {
		c = a * b;
		System.out.println(c);
	}
	void getDiv() {
		c = a / b;
		System.out.println(c);
	}

}
