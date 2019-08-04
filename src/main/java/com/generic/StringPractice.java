package com.generic;

public class StringPractice {

	public static void main(String[] args) {
		String country = "United State Of America";

		for(int i=0;i<country.length();i++) {
			
			if(country.charAt(i)=='E'|| country.charAt(i)=='e') {
				
				System.out.println(i);
			}
			
		}
	
		System.out.println("-------------------");
		
		String parse[] = country.split(" ");

		for (String i : parse) {
			System.out.println(i);
		}

		
		
		
	}

}
