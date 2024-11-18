package com.arunima.basics.constructor;

public class SingleInstanceClass {

	private static SingleInstanceClass instance ;
	
	public static SingleInstanceClass getInstance() {
		if( instance == null ) {
			instance = new SingleInstanceClass() ;
		}
		return instance ;
	}
	
	private SingleInstanceClass() {}
}
