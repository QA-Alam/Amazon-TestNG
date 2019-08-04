package com.sujon;

public class Sum {
	int a = 0;
	int b = 0;
	int c;

	Sum(int a, int b) {
		this.a = a;
		this.b = b;
	}

	void getValue() {
		c = a + b;
		System.out.println(c);
	}

	public static void main(String args[]) {
		Sum obj = new Sum(2, 4);
		obj.getValue();
	}

}
