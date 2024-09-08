package com.arunima.basics.arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int stones[] = { 84, 20, 43, 6, 2 } ;
		printArray( "Unsorted array", stones ) ;
		bubbleSort( stones ) ;
		printArray( "Sorted array", stones ) ;
	}
	
	public static void bubbleSort( int[] array ) {
		
		for( int oli=0; oli<array.length-1; oli++ ) {
			for( int ili=0; ili<array.length-1-oli; ili++ ) { 
				
				int currentElement = array[ili] ;
				int nextElement = array[ili+1] ;
				
				if( currentElement > nextElement ) {
					int temp = nextElement ;
					array[ili+1] = currentElement ;
					array[ili] = temp ;
				}
			}
			printArray( "Outer loop " + (oli+1) + " complted.", array ) ;
		}
	}
	
	public static void printArray( String message, int[] array ) {
		System.out.println( message ) ;
		for( int i=0; i<array.length; i++ ) {
			System.out.println( "  array[" + i + "] = " + array[i] ) ;
		}
	}
}
