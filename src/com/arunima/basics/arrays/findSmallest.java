package com.arunima.basics.arrays;

public class findSmallest 
{
	public static void main(String args[])
	{
		int[] arr = {4, 3, 2, 1, -19, 3, -109, 5} ;
		int min = arr[0] ;
		int minIndex=0 ;
		
		for( int i=0; i<arr.length; i++)
		{
			if( arr[i]<min )
			{
				min = arr[i] ;
				minIndex = i ;
			}	
		}
		System.out.println( "Minimum number in array is " + min ) ;
		System.out.println( "Index of minimum number is " + minIndex ) ;
	}
}
