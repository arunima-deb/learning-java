package com.arunima.basics.clsandobj;

class Flower {
	
	private  String name = null ;
	
	Flower( String name ) {
		this.name = name ;
	}
	
	String getName() {
		return this.name ;
	}
	
	static String getType() {
		return "Flower" ;
	}
}

public class InstanceAndClassVariables {

	public static void main(String[] args) {
		
		Flower hibiscus = new Flower( "Hibiscus" ) ;
		Flower rose     = new Flower( "Rose" ) ;
		
		System.out.println( hibiscus.getName() ) ;
		System.out.println( rose.getName() ) ;
		
		System.out.println( Flower.getType() ) ;
	}
}
