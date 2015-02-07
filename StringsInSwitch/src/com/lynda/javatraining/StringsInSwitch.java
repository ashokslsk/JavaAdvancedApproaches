package com.lynda.javatraining;

import java.util.ArrayList;
import java.util.Random;

import com.lynda.olivepress.olives.Olive;

public class StringsInSwitch {

	public static void main(String[] args) throws Exception {

		Olive o1 = new Olive("Kalamata", 0x000000);
		Olive o2 = new Olive("Picholine", 0x00FF00);
		Olive o3 = new Olive("Ligurio", 0x000000);
		
		ArrayList<Olive> list = new ArrayList<>();
		
		list.add(o1);
		list.add(o2);
		list.add(o3);
		
		Random genertar = new Random();
		int index = genertar.nextInt(3);
		System.out.println("Random value :" + index);
		
		Olive o = list.get(index);
		switch (o.oliveName) {
		case "Kalamata":
			System.out.println("Its a greek");
			break;
		case "Picholine":
			System.out.println("Its a french");
			break;
		case "Ligurio":
			System.out.println("Its a Italian");
			break;
			
		default:
			System.out.println("I dont know where its from");
			break;
		}
	}
	
}
