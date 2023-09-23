package com.arunima.basics.operators;

public class Operand {

	public static void main(String[] args) {
		int c = -(10+getTemperature()) ;
		System.out.println( c ) ;
	}
	
	public static int getTemperature() {
		return 10 ;
	}
}
