package com.arunima.basics.conditionals;

import java.util.Scanner;

public class SwitchCase_Test1 
{
	public static void main( String args[] )
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println( "Enter a number : " );
		int a = sc.nextInt() ;
		
		switch(a)
		{
		case 1 :
			System.out.println( "1" );
		case 2 :
			System.out.println( "2" );	
		case 3 :
			System.out.println( "3" );
		case 4 :
			System.out.println( "4" );
		case 5 :
			System.out.println( "5" );
		}
		
		sc.close();
	}
}
