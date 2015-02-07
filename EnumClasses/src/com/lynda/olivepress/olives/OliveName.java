package com.lynda.olivepress.olives;

public enum OliveName {

	KALAMATA("Kalamata"),LAGURIO("Lagurio"),PICHOLINE("Picholine"),GOLDEN("Golden");
	
	private String nameAsString;
	
	private OliveName(String nameAsString){
		this.nameAsString  = nameAsString; 
	}
	
	@Override
	public String toString() {

		return this.nameAsString;
	}
	
}
