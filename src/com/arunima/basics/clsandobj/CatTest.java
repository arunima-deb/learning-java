package com.arunima.basics.clsandobj ;

public class CatTest {

	public static void main( String[] args ) {
		
		Cat motherCat = new Cat( "black", "golden" ) ;
		motherCat.printEnergyLevel() ;
		
		
		motherCat.jump() ;
		motherCat.printEnergyLevel() ;

		motherCat.jump() ;
		motherCat.printEnergyLevel() ;
		
		motherCat.eat() ;
		
		motherCat.jump() ;
		motherCat.printEnergyLevel() ;
	}
}
