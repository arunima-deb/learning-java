package com.arunima.math;

import java.util.* ;

public class SimultaneousSolverAdvanced {

	public static void main( String args[] ) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println( "Enter equation 1 : " ) ;
		String e1 = sc.nextLine() ;
		System.out.println( e1.length() ) ;
		
		if( e1.charAt(e1.length() - 1)!=0 )
		{
			
		}
		
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
		e1.replace( '=', '\0' ) ;
		System.out.println( e1 );
		
		int c1 = Integer.parseInt(e1) ;
		
		System.out.println( c1 );
		
		sc.close();
	}
}
