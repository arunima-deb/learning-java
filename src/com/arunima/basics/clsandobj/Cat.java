package com.arunima.basics.clsandobj;

public class Cat {

	int    height    = 20 ;
	int    length    = 40 ;
	String eyeColor  = null ;
	String bodyColor = null ;
	
	private int energyLevel = 5 ;
	
	public Cat( String bColor, String eColor ) {
		eyeColor = eColor ;
		bodyColor = bColor ;
		System.out.println( "A cat is born." ) ;
	}
	
	public void eat() {
		System.out.println( "Yummm" ) ;
		digestFood() ;
	}
	
	public void jump() {
		if( energyLevel < 2 ) {
			System.err.println( "Can't jump. No energy :(" ) ;
		}
		else {
			System.out.println( "Jumping" ) ;
			energyLevel -= 2 ;
		}
	}
	
	public void run() {
		if( energyLevel < 1 ) {
			System.err.println( "Can't run. No energy :(" ) ;
		}
		else {
			System.out.println( "Running" ) ;
			energyLevel -= 1 ;
		}
	}

	private void digestFood() {
		System.out.println( "Digesting food." ) ;
		energyLevel += 3 ;
	}
	
	public void printEnergyLevel() {
		System.out.println( "Energy level = " + energyLevel ) ;
	}
}