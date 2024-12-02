package com.arunima.basics.arrays;

import java.util.Scanner; 

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		int[] array = new int[5] ;
		System.out.print( "Enter 5 array elements : " ) ;
		for( int i=0; i<5; i++ )
			array[i] = sc.nextInt() ;
		System.out.print( "\nUnsorted Array : " ) ;
		printArray(array) ;
		
		bubbleSort(array) ;
		 
		System.out.print( "\nSorted Array : " ) ;
		printArray(array) ;
	}
	
	public static void bubbleSort( int[] array ) {
		for( int i=0; i<array.length-1; i++ ) 
		{
			for( int j=0; j<array.length-i-1; j++ )
			{
				if( array[j]>array[j+1] )
				{
					swap( array, j, j+1 ) ;
				}
			}
		}
	}
	
	public static void swap( int[] array, int prevIndex, int newIndex )
    {
        int temp = array[prevIndex] ;
        array[prevIndex] = array[newIndex] ;
        array[newIndex] = temp ;
    }
	
	public static void printArray( int[] array ) {
		System.out.print( "\n[ " + array[0] ) ;
		for( int i=1; i<array.length; i++ )
			System.out.print( ", " + array[i] ) ;
		System.out.print( " ]\n" ) ;
		
	}
}
