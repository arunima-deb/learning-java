package com.arunima.basics.arrays;

public class BinarySearch 
{
	public static void main(String args[])
	{
		int[] arr = {1, 2, 3, 4, 5, 6, 7} ;
		binarySearch( arr, 7 ) ;
	}
	
	static int binarySearch( int[] array, int key )
	{
		int halfLen = array.length/2 ;
		boolean keyIndexFound = false ;
		
		while(keyIndexFound!=true)
		{
			if(key<array[halfLen])
			{
				
			}
		}
		
		
		return 0 ;
	}
	
	public static void print(String message)
	{
		System.out.println(message) ;
	}
}
