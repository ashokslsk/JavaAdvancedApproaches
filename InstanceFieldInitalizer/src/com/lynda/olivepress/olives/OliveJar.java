package com.lynda.olivepress.olives;

import java.util.ArrayList;

public class OliveJar {

	public  ArrayList<Olive> olives;
	
	 {
		System.out.println("initializing...");
		olives = new ArrayList<>();
		olives.add(new Olive("Kalamata", 0x000000));
	}
	 
	 public OliveJar(){
		 System.out.println("Constructor....");
	 }
	 
	 public OliveJar(int nOlive, String oliveName, long color){
		 for (int i = 0; i < nOlive; i++) {
			 olives.add(new Olive(oliveName, color));
		}
	 }

}
