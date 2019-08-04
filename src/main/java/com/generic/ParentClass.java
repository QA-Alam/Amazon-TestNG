package com.generic;

public class ParentClass extends GrandParent{

	public void ParentHouse(){
		/*
		 * GrandParent obj = new GrandParent(); obj.getHouse();
		 * 
		 * ParentClass obj2 = new ParentClass(); obj2.getHouse();
		 */
		
		GrandParent obj3 = new ParentClass();
		obj3.getHouse();
		
		/*
		 * ParentClass obj4 = new GrandParent();//not allow obj4.getHouse();
		 */
		
	}
	
	
	
	
}
