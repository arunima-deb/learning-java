package com.arunima.basics.arrays;

import java.util.Scanner ;

public class SequentialSearch 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in) ;
		int[] arr = {4, 5, 2, 8, 1, 5, 3, 7, 9, 2, 3} ;
		
		System.out.println( "Enter key : " ) ;
		int key = sc.nextInt() ;
		int keyIndex = 0 ;
		boolean isFound = false ;
		
		for( int i=0; i<arr.length; i++ )
		{
			if( arr[i]==key )
			{
				keyIndex = i ;
				isFound = true ;
			}
		}
		
		if( isFound )
			System.out.println( "Index of key in array is " + keyIndex ) ;
		else
			System.out.println( "Not found." ) ;
		sc.close();
	}
}
