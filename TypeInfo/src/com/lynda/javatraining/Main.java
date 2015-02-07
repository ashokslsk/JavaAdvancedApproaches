package com.lynda.javatraining;

import java.lang.reflect.Constructor;

import com.lynda.javatraining.olives.Olive;
import com.lynda.javatraining.olives.OliveName;

public class Main {

	public static void main(String[] args) {
		Olive o = new Olive(OliveName.PICHOLINE, 0x00FF00);
		
		Class<?> c = o.getClass();
		
		System.out.println(c);
		System.out.println(c.getName());
		System.out.println(c.getSimpleName());
		
		Constructor<?>[] constructors = c.getConstructors();
		System.out.println("Number of  constructors"+constructors.length);
		
		Constructor<?> con = constructors[0];
		Object obj= null;
		
		try {
			obj = con.newInstance(OliveName.PICHOLINE,0x00FF00);
			System.out.println(obj);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
