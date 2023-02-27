package com.arunima.basics.loops;

public class LineShapes {
	

	public static void main(String[] args) {
		int length = 272349 ;
		
		LineShapes app = new LineShapes() ;
		//app.exercise_01( length) ;
		//app.exercise_02( length ) ;
		app.exercise_03( length ) ;
	} 
	
	// Print length number of '*' using a for loop but without 
	// changing the 'length' variable
	public void exercise_01( int length ) {	
		for( int i=length; i>0; i-- ) {
			System.out.print( "*" ) ;
		}
	}

	// print length/2 number of '*' then length/4 number of spaces
	// five times.
	//
	// example. Length = 4
	// Output
	// ** ** ** ** **
	public void exercise_02( int length ) {	
		
		for( int a = 5; a>0; a-- ) {
			for( int b = length/2; b>0; b-- ) {
				System.out.print( "*" );
			}
				
			for( int c = length/4; c>0; c-- ) {
				System.out.print( " " );
			}
		}
	}

	// Given an integer number, find the factors of it.
	public void exercise_03( int number ) {	
		
		for( int a = 1; a<number+1; a++ ) {
			if((number % a) == 0) {
				System.out.println( a );
			}
		}
		
	}
}
