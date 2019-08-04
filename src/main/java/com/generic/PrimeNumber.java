package com.generic;

public class PrimeNumber {

	public static void main(String[] args) {

		/*
		 * //loop through the numbers one by one-1st loop for (int i = 1; i<100; i++) {
		 * // check to see if the number is prime - 2nd loop for (int j = 2; j < i;j++ )
		 * { if (i % j == 0) { //not prime System.out.println(i + " Not prime");
		 * System.out.println("----------"); break; // exit the 2nd for loop SAROWER
		 * AHMMED
		 * 
		 * }else { System.out.println(i + " prime");
		 * System.out.println("================"); break;// exit the 2nd for loop } } }
		 * 
		 * 
		 *
		 */

		int num = 39;
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				System.out.println(" Not prime number::" + num);
				System.out.println("--------------");
				break;
			} else {
				System.out  .println("--------------");
				System.out.println("prime::" + num);
			}
		}

	}
}
