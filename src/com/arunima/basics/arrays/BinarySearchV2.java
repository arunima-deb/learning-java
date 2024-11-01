package com.arunima.basics.arrays;

import java.util.Scanner ;

public class BinarySearchV2 
{
	public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in) ;
		
		int[] bdayArr = new int[8] ;
		
		System.out.println( "Enter " + bdayArr.length + " unique birthday dates in ascending order." ) ;
		for( int i=0; i<8; i++ )
		{
			bdayArr[i] = sc.nextInt() ;
		}
		
		System.out.println( "\nEnter bday date to search for: " );
		int key = sc.nextInt() ;
		
		int firstIndex = 0 ;
		int lastIndex = bdayArr.length-1 ;
		int keyIndex=-1 ;
		int midIndex = 0 ;
		
		while(midIndex>=firstIndex)
		{
			midIndex = (firstIndex+lastIndex)/2 ;
			if(key==bdayArr[midIndex])
			{
				keyIndex = midIndex ;
				break ;
			}
			if( key>bdayArr[midIndex] )
				firstIndex = midIndex ;
			else
				lastIndex = midIndex ;
		}	
		
		System.out.println( "\nIndex of " + key + " in array is " + keyIndex + "." ) ;
		
		sc.close() ;
	}
}
