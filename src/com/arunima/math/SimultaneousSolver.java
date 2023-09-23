package com.arunima.math;

import java.util.* ;

public class SimultaneousSolver 
{
	public static void main( String args[] ) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println( "Enter a1 : " ) ;
		
		double a1 = sc.nextDouble() ;
		System.out.println( "Enter b1 : " ) ;
		double b1 = sc.nextDouble() ;
		System.out.println( "Enter c1 : " ) ;
		double c1 = sc.nextDouble() ;
		
		System.out.println( "\nEnter a2 : " ) ;
		double a2 = sc.nextDouble() ;
		System.out.println( "Enter b2 : " ) ;
		double b2 = sc.nextDouble() ;
		System.out.println( "Enter c2 : " ) ;
		double c2 = sc.nextDouble() ;
		
		double x = (b1*c2 - b2*c1)/(a1*b2-a2*b1) ;
		double y = (c1*a2 - c2*a1)/(a1*b2-a2*b1) ;
		
		System.out.println( "\nx = " + x ) ;
		System.out.println( "y = " + y ) ;
		
		sc.close();
	}
}
