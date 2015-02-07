package com.lynda.javatraining;

import java.text.NumberFormat;

public class NumericLiteralDemo {

	public static void main(String[] args) {
		//Underscores are accepted as numeric literals in java 7 standards
		int numberofOlives = 1_000_000;
		NumberFormat formatter = NumberFormat.getInstance();
		// Output will be the underscores are replaced by commas 
		System.out.println(formatter.format(numberofOlives));
	}

}
