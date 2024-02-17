package com.arunima.math;

import java.util.* ;

/* \Given a linear equation in 2 variables, how would you obtain
 * a1, b1 and c1 in integer variables?
 * 
 * 1. Check if the equation is in standard form. If not, convert.
 * 1a. How to convert?		
 * 	   
 * 
 */

public class SimultaneousSolverAdvanced {

	public static void main( String args[] ) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println( "Enter equation 1 : " ) ;
		String e1 = sc.nextLine() ;
		System.out.println( e1.length() ) ;
		
		int c = 0 ;
		
		String e1new = e1 ;
		
		do
		{
			e1new = e1.replace( e1.charAt(c), '\0' ) ;
			System.out.println( e1new ) ;
			e1 = e1new ;
			c++ ;
		}
		while( c<e1.length()-1 && e1.charAt(c)!='=' ) ;
		
		System.out.println( e1 );
		e1new = e1.replace( '=', '\0' ) ;
		System.out.println( e1new );
		
		int c1 =  Integer.parseInt( e1new ) ;
		System.out.println( c1-5 ) ;
		
		sc.close();
	}
}
