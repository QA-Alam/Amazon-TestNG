package com.learning;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Collection1 {

	public static void main(String[] args) {
		
		//parent List ==> interface
		//child ==> ArrayList, LinkedList, vector,stack==> class
		
		int a=10;
		//Variable >>>>>>>>one value
		int [] b= {10,20,30};
		//........... multiple value
		//Array >>>>>>>>>>>>length fixed
		//index theory
		//total == length
		
		//List  ........dynamic ==> resize possible
		
		List<String>  arraylist =new ArrayList<>();
		//internal structure is array
		//index theory
		//total no= size()
		// add/remove at end is faster
		// increase size by 50% (5===>5+2.5= 7.5)
		List<String>  linked =new LinkedList<>();
		// linked theory
		// add/remove at beginning is faster
		
		List<String>  vector =new Vector<>();
		// synchronize
		//thread safe
		// increase size by double (5===>10)
		
		
		List<String>  stack =new Stack<>();
		//LIFO
		// synchronize
		//thread safe
		
		
		
		
		
		
		arraylist.add("Milk");
		arraylist.add("Meat");
		arraylist.add("Fish");
		
		System.out.println(arraylist);
		//System.out.println(arraylist.get(0));
		//System.out.println(arraylist.get(1));
		//System.out.println(arraylist.get(2));
		
		//total array object =size()
		for(int i=0;i<arraylist.size(); i++) {
			
			System.out.println(arraylist.get(i));
		}
		//advance loop
		System.out.println("-----------------");
		for(String i:arraylist) {
			System.out.println(i);
		}
		System.out.println("===================");
		//foreach loop >>> 10 times faster other loop
		
		arraylist.forEach(item ->{
			
			System.out.println(item);
		});
		
		
		
		
		

		List<Integer>  aa =new ArrayList<>();
		aa.add(10);
		aa.add(20);
		aa.add(30);
		
		List<Integer>  bb =new LinkedList<>();
		List<Integer>  c =new Vector<>();
		List<Integer>  d =new Stack<>();
		
		List<Double>  x =new ArrayList<>();
		x.add(10.33);
		x.add(20.33);
		x.add(30.33);
		
		
		List<Double>  y =new LinkedList<>();
		List<Double> z =new Vector<>();
		List<Double> dd=new Stack<>();
	}

}
