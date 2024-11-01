package com.arunima.basics.arrays;

import java.util.Scanner ;

public class SelectionSort 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in) ;
		int[] intArr = new int[10] ;
		System.out.println( "Enter 10 array elements one by one : " ) ;
		for( int i=0; i<10; i++ )
		{
			intArr[i] = sc.nextInt() ;
		}
		
		boolean isSorted = false ;
		int min = intArr[0] ; 
		
		for( int j=0; isSorted==false ; j++ )
		{
			for( int k=0; k<10; k++ )
			{
				if( intArr[k]<min )
					min = intArr[j] ;
				interchange( intArr, min, intArr[k] ) ;
			}
			isSorted = true ;
		}
		
		for( int l=0; l<10; l++ )
		{
			System.out.println( intArr[l] ) ;
		}
		
		sc.close() ;
	}
	
	public static int[] interchange( int[] array, int prevItem, int newItem )
	{
		int temp = prevItem ;
		prevItem = newItem ;
		newItem = temp ;
		return array ;
	}
}
