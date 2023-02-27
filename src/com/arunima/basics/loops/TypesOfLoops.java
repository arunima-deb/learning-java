package com.arunima.basics.loops;

/*
 * There are three types of loops in Java:
 * 
 * 1. For loop
 * 2. Do-while loop
 * 3. While loop
 * 
 * Every loop has the following parts:
 * 
 * a) Termination/Continuation condition:
 *    This is a logical condition which will keep the loop looping till it is true.
 *    This also determines how many time the body of the loop will be executed.
 *    
 * b) Body of the loop:
 *    A set of statements which will be repeated during each loop
 *    
 *    
 *    continue, break
 */
public class TypesOfLoops {

	public static void main( String[] args ) {
		
		TypesOfLoops app = new TypesOfLoops() ;
		app.demoForLoop() ;
		app.demoWhileLoop() ;
		app.demoDoWhileLoop();
	}
	
	/**
	 * For loop has the structure:
	 * 
	 * for( <initialization condition>; <termination condition>; <post loop> ) {
	 *    <body of the loop>
	 * }
	 * 
	 * 1. Initialization condition:
	 *    This is executed only once and before anything else of the loop 
	 *    gets executed. This is usually used for initializing a loop index 
	 *    variable.
	 *    
	 * 2. Continuation condition:
	 *    This is executed before starting to execute the body of the loop.
	 *    If this condition is false, the loop will not be executed.
	 *    
	 * 3. Body of the loop:
	 *    If the termination condition is false, all the statements in the body
	 *    are executed.
	 *   
	 * 4. Post loop processing:
	 *    After all the body statements are executed, this logic is executed.
	 *    Usually this is used to increment/decrement the loop index variable.
	 *    
	 *    
	 * Sequence of execution:
	 * 1. Initialization
	 * 2. Check for continuation/termination
	 * 3. Execute body
	 * 4. Post loop processing
	 * 5. Go to step 2
	 */
	private void demoForLoop() {
		
		System.out.println( "\nUsing for loop." ) ;
		for( int i=0; i<5; i++ ) {
			System.out.println( i );
		}
	}
	
	private void demoWhileLoop() {
		
		System.out.println( "Using while loop." ) ;
		int j=0 ;
		while( j<5 ) {
			System.out.println( j ) ;
			j++ ;
		}
	}
	
	private void demoDoWhileLoop() {
		
		System.out.println( "\nUsing do-while loop." ) ;
		int k=0 ;
		do {
			System.out.println( k ) ;
			k++ ;
		}
		while( k < 5 ) ;
	}
}
