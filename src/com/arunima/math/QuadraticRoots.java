package com.arunima.math;

import java.util.Scanner ;

public class QuadraticRoots {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		
		System.out.print( "Enter 'a' : " ) ;
		double a = sc.nextDouble() ;
		System.out.print( "Enter 'b' : " ) ;
		double b = sc.nextDouble() ;
		System.out.print( "Enter 'c' : " ) ;
		double c = sc.nextDouble() ;
		
		double D = b*b - 4*a*c, alpha, beta ;
		
		if( D<0 )
			System.out.println( "\nRoots are imaginary.\n" ) ;
		
		String al = "\n  " + -1*b + " ± Root(" + D + ")  " ;
		System.out.println( al );
			
		for( int i=1; i<=al.length() ; i++ )
			System.out.print( "_" );
		
		System.out.println() ;
		
		for( int j=1; j<=al.length()/2; j++ )
			System.out.print(" ") ;
		
		System.out.println( 2*a ) ;
			
		
		if( D>=0 )
		{
			if( D>0 )
				System.out.println( "\nRoots are real and distinct." );
			if( D==0 )
				System.out.println( "\nRoots are real and equal." ) ;
			
			alpha = (-1*b + Math.sqrt(D))/(2*a) ;
			beta = (-1*b - Math.sqrt(D))/(2*a) ;
			
			System.out.println( "Alpha = " + alpha ) ;
			System.out.println( "Beta = " + beta ) ;
		}
		
		
		sc.close() ;
	}
}
