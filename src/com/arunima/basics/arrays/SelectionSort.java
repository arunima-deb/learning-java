package com.arunima.basics.arrays;

import java.util.Scanner ;

public class SelectionSort 
{
	public static void main(String args[])
	{
		// Accepting array
		Scanner sc = new Scanner(System.in) ;
		print( "Enter length of array : " ) ;
		int arrLen = sc.nextInt() ;
		int[] arr = new int[arrLen] ;
		print( "Enter " + arrLen + " array elements one by one : " ) ;
		for( int i=0; i<arrLen; i++ )
		{
			arr[i] = sc.nextInt() ;
		}
		
		print( "\nUnsorted array : " ) ;
		print( arr ) ;
		
		int mi ;
		for( int ami=0; ami<arrLen; ami++ )
		{
			mi = ami ;
			for( int i=0; i<arrLen; i++ )
			{
				if( arr[i]<arr[ami] )
					mi = i ;
			}
			interchange( arr, ami, mi ) ;
			print( arr ) ;
		}
		
		print( "\n\nSorted array : " ) ;
		print( arr ) ;
		
		sc.close() ;
	}
	
	public static int[] interchange( int[] array, int prevIndex, int newIndex )
	{
		int temp = array[prevIndex] ;
		array[prevIndex] = array[newIndex] ;
		array[newIndex] = temp ;
		return array ;
	}
	
	public static boolean isSorted( int[] array )
	{
		boolean isSorted = false ;
		for( int i=1; i<array.length; i++ )
		{
			if( array[i]>array[i-1] )
			{
				isSorted = true ;
			}
		}
		return isSorted ;
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
