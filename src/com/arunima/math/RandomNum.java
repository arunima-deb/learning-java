package com.arunima.math;

import java.util.Scanner ;

public class RandomNum 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println( "Enter lower limit : " ) ;
		int lowerLimit = sc.nextInt() ;
		System.out.println( "Enter upper limit : " ) ;
		int upperLimit = sc.nextInt() ;
		
		System.out.println( "\n\nRandom Number : " + Math.round(lowerLimit + Math.random()*(upperLimit-lowerLimit)) ) ;
	}
}
