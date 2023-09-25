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
	
	public static void canIfHaveBreak()
	{
		int a = 1 ;
		if(a==1)
		{
			System.out.println( "1" );
		}
		
		System.out.println( "Hey" );
	}
}
