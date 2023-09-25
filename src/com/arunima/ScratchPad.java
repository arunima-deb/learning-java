package com.arunima;

public class ScratchPad 
{
	public static void main( String args[] )
	{
		canDefaultHaveBreak() ;
	}

	public static void canDefaultHaveBreak() 
	{
		int a = 2 ;
		switch(a)
		{
		case 1 :
			System.out.println( "1" ) ;
		default :
			System.out.println( "no case" ) ; break ;
		}
		
		System.out.println( "Hey" );
		
	}
}
