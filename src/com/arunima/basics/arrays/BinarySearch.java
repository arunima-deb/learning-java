package com.arunima.basics.arrays;

public class BinarySearch 
{
	public static void main(String args[])
	{
		int[] arr = {1, 2, 3, 4, 5, 6, 7} ;
		binarySearch( arr, 1, 7, 3 ) ;
	}
	

	public static int binarySearch(int arr[], int low, int high, int x)
	{
	    while (low <= high) {
	        int mid = low + (high - low) / 2;

	        // Check if x is present at mid
	        if (arr[mid] == x)
	            return mid;

	        // If x greater, ignore left half
	        if (arr[mid] < x)
	            low = mid + 1;

	        // If x is smaller, ignore right half
	        else
	            high = mid - 1;
	    }

	    // If we reach here, then element was not present
	    return -1;
	}
	
	public static void print(String message)
	{
		System.out.println(message) ;
	}
}
