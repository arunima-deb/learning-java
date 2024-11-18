package com.arunima.basics.arrays;

public class SelectionSortNew 
{
	public static void main(String args[])
	{
		int[] arr = { -2, -232, 1, -9, 9, 6 } ;
		print( "Unsorted array is:" ) ;
		print( arr ) ;
		selectionSort( arr ) ;
		print( "\n\nSorted array is:" ) ;
		print( arr ) ;
	}
	
	public static void selectionSort( int[] array ) 
	{	
		int minIndex ;
		int unsortedStart ;
		
		for( int i=0; i<array.length; i++ )
		{
			unsortedStart = i ;
			minIndex = getMinIndex( array, unsortedStart ) ;
			swap( array, unsortedStart, minIndex ) ;
		}
	}

	public static int getMinIndex( int[] array, int firstIndex )
	{
		int minIndex = firstIndex ;
		for( int i=firstIndex; i<array.length; i++ )
		{
			if( array[i]<array[minIndex] )
				minIndex = i ;
		}
		return minIndex ;
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
		System.out.print( " ]" ) ;
	}
	
	public static void print( String st )
	{
		System.out.print( st ) ;
	}
}
