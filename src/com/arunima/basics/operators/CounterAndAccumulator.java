package com.arunima.basics.operators;

import com.arunima.basics.clsandobj.Cat;

public class CounterAndAccumulator {

	public static void counterExample() throws Exception {
		
		// These are counters. They contain number of times 
		// an event happened.
		int catEat = 0 ;
		int catJump = 0 ;
		int catRun = 0 ;
		
		Cat cat = new Cat( "orange", "green" ) ;
		
		while( cat.getEnergyLevel() > 0 ) {
			double random = Math.random() ;
			System.out.println( "Energy = " + cat.getEnergyLevel() ) ;
			if( random < 0.3 ) {
				cat.eat() ;
				catEat++ ;
			}
			else if( random < 0.6 ) {
				cat.jump() ;
				catJump++ ;
			}
			else {
				cat.run() ;
				catRun++ ;
			}
			
			Thread.sleep( 100 ) ;
		}
		
		System.out.println( "Cat ate " + catEat + " times." ) ;
		System.out.println( "Cat jumped " + catJump + " times." ) ;
		System.out.println( "Cat ran " + catRun + " times." ) ;
	}
	
	public static void accumulatorExample() {
		
		int[] marks = { 10, 20, 30, 40, 10, 11, 14 } ;
		
		// This is an accumulator. It accumulates values of some
		// events or variables.
		int totalMarks = 0 ;
		
		for( int mark : marks ) {
			totalMarks += mark ;
		}
		System.out.println( "Total marks = " + totalMarks ) ;
	}
	
	public static void main(String[] args) throws Exception {
		counterExample() ;
		//accumulatorExample() ;
	}
}
