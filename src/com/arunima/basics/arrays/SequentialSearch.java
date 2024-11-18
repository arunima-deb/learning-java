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
		int keyIndex = -1;
		
		for( int i=0; i<arr.length; i++ )
		{
			if( arr[i]==key )
			{
				keyIndex = i ;
			}
		}
		
		System.out.println( "Index of key in array is " + keyIndex ) ;
		sc.close();
	}
}
