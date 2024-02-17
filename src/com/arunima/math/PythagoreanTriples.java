package com.arunima.math;

public class PythagoreanTriples {

	public static void main(String[] args) 
	{
		for( int i=1; i<=100; i++ )
		{
			System.out.println( 2*i + ", " + (i*i-1) + ", " + (i*i+1) ) ;
		}
	}

}
