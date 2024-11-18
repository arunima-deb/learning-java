package com.arunima.basics.arrays;

public class BubbleSortNew 
{
	public static void main(String args[])
	{
		int[] array = { 6, 5, 4, 3, 2, 1 } ;
		print( "Unsorted Array : " ) ;
		print( array ) ;
		bubbleSort(array) ;
		print( "Sorted Array : " ) ;
		print( array ) ;
	}
	
	public static void bubbleSort( int[] array )
	{
	}
	
	public static void swap( int[] array, int prevIndex, int newIndex )
	{
		int temp = array[prevIndex] ;
		array[prevIndex] = array[newIndex] ;
		array[newIndex] = temp ;
	}
	
	public static void print( int[] array )
	{
		System.out.print( "\n[ " ) ;
		System.out.print( array[0] ) ;
		for( int i=1; i<array.length; i++ )
		{
			System.out.print( ", " + array[i] );
		}
		System.out.println( " ]\n" ) ;
	}
	
	public static void print( String st )
	{
		System.out.print( st ) ;
	}
}
