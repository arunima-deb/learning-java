package com.arunima.basics.arrays;

import java.util.Scanner ;

public class SelectionSort 
{
	public static void main(String args[])
	{
		// Accepting array
		Scanner sc = new Scanner(System.in) ;
		int[] intArr = new int[10] ;
		System.out.println( "Enter 10 array elements one by one : " ) ;
		for( int i=0; i<10; i++ )
		{
			intArr[i] = sc.nextInt() ;
		}
		
		boolean isSorted = false ;
		int firstIndex = 0;
		int min = intArr[0] ;
		int minIndex = 0 ;
		
		for( int j=firstIndex; j<10; j++ )
		{
			for( int i=firstIndex; i<10; i++ )
			{
				if( intArr[i]<min )
				{
					min = intArr[i] ;
					minIndex = i ;
					firstIndex++ ;
				}
			}
			interchange( intArr, 0, minIndex ) ;
			printArr( intArr ) ;
			isSorted = true ;
		}
		
		sc.close() ;
	}
	
	public static int[] interchange( int[] array, int prevIndex, int newIndex )
	{
		int temp = array[prevIndex] ;
		array[prevIndex] = array[newIndex] ;
		array[newIndex] = temp ;
		return array ;
	}
	
	public static void printArr( int[] array )
	{
		System.out.print( "\n[ " ) ;
		System.out.print( array[0] ) ;
		for( int i=1; i<array.length; i++ )
		{
			System.out.print( ", " + array[i] );
		}
		System.out.print( " ]" ) ;
	}
}
