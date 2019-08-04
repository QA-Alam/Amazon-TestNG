package com.learning;

import java.sql.Array;

public class ArrayTest {

	public static void main(String[] args) {
	
		int [] array = new int[5];//old
		array[0]=10;
		array[1]=20;
		array[2]=40;
		array[3]=60;
		array[4]=80;
		
		int [] array1 = {10,20,40,60,80,100};//new
		
		
	for(int x:array) {
		
		System.out.println(x);
	}
		
		
	}

}
