package com.lynda.javatraining;

import com.lynda.javatraining.olives.Ligurio;

public class Main {

	public static void main(String[] args) {
		
		Object o = new Ligurio();
		
		Class<?> c = o.getClass();
		System.out.println("The class name: "+c.getName());
		
		Class<?> sup = c.getSuperclass();
		 System.out.println("Super name: "+ sup.getName());

		 Class<?> top = sup.getSuperclass();
		 System.out.println("top name: "+ top.getName());
		 
		 Package p = c.getPackage();
		 System.out.println("package:"+p.getName());
	}

}
