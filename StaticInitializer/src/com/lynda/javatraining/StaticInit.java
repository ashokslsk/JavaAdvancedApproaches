package com.lynda.javatraining;

import java.util.ArrayList;

import com.lynda.olivepress.olives.Olive;
import com.lynda.olivepress.olives.OliveJar;

public class StaticInit {

	public static void main(String[] args) throws Exception {
		System.out.println("Application initializing...");
		ArrayList<Olive> olives = OliveJar.olives;
		for (Olive o : olives) {
			System.out.println("Its a "+ o.oliveName + "olive");
		}
	}
	
}
