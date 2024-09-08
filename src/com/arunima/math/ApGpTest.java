package com.arunima.math;

public class ApGpTest {
	public static void main(String args[]) {
		for( int i=0; i<=1000; i++ ) {
			for( int j=1; j<=1000; j++ ) {
				if( i-j==i/j && i+j==i*j )
				{
					System.out.println( i-j + ", " + i + ", " + i+j ) ;
				}
			}
		}
	}
}
