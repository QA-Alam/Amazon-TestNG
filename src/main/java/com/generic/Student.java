package com.generic;

public class Student {

	public static void main(String[] args) {
		// 1,2,3,4,5

		String[] a = new String[5];
		a[0] = "Hi";
		a[1] = "Hello";
		a[2] = "All";
		a[3] = "Exam";
		a[4] = "Saturday";

		for (String i : a) {
			System.out.println(i);
		}

		String[] b = { "Hi", "Hello", "All", "Exam", "Saturday" };

		for (String i : b) {
			System.out.println(i);
		}


	}

}
