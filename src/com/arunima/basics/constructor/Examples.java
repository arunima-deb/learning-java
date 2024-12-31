package com.arunima.basics.constructor;

public class Examples {
	String eyeColor ;
	String hairColor ;
	static String franchise = "Blue Lock" ;
	
	public static void main(String[] args) {
		Examples Rin = new Examples( "Turquoise", "Viridian" ) ;
		Examples Gagamaru = new Examples( "Black", "Black&White" ) ;
		Examples Isagi = new Examples() ;
		Rin.printDetails();
		Gagamaru.printDetails() ;
		Isagi.printDetails();
		System.out.println( franchise ) ;
	}
	
	Examples( String eyeColor, String hairColor ) {
		this.eyeColor = eyeColor ;
		this.hairColor = hairColor ;
	}
	
	Examples() {
		this.eyeColor = "Black" ;
		this.hairColor = "Brown" ;
	}
	
	
	
	void printDetails() {
		System.out.println( "Eye color = " + this.eyeColor ) ;
		System.out.println( "Hair color = " + this.hairColor ) ;
	}
}
