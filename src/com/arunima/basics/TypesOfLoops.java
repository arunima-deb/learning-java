package com.arunima.basics;

/*
 * Types of loops:
 * 1. For loop
 * 2. Do-while loop
 * 3. While loop
 * 
 * Initialization - 
 * 
 * Termination condition - 
 *    Is a logical condition which will keep the loop looping till it is true
 *    
 * Post loop processing
 *    
 * Block of statements -
 *    This is the block that executes till the loop condition is true
 *    
 *    continue, break
 */
public class TypesOfLoops {

	public static void main(String[] args) {
		
		System.out.println( "Using while loop." ) ;
		int j=0 ;
		while( j<5 ) {
			System.out.println( j ) ;
			j++ ;
		}
		
		System.out.println( "\nUsing for loop." ) ;
		for( int i=0; i<5; i++ ) {
			System.out.println( i );
		}
		
		System.out.println( "\nUsing do-while loop." ) ;
		int k=0 ;
		do {
			System.out.println( k ) ;
			k++ ;
		}
		while( k < 5 ) ;
	}
}
