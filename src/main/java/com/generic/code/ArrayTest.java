package com.generic.code;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayTest {

	public static void main(String[] args) {
	
		List<Integer> mylist =new ArrayList<>();//upcasting
		mylist.add(10);
		mylist.add(4);
		mylist.add(16);
		mylist.add(2);
		
		System.out.println("Total list size::"+mylist.size());
		
		int max=Collections.max(mylist);
		System.out.println("My Max::"+max);
		
		int min=Collections.min(mylist);
		System.out.println("My Minimum::"+min);
		
System.out.println("Original list::"+mylist);
		
Collections.reverse(mylist);
System.out.println("Reversed List::"+mylist);		
	}
}
