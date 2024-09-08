package com.arunima;

import java.util.Scanner ;

public class RapidTypingPractice 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in) ;
		int r = 0 ;
		for( int i=1; i<=10; i++ )
		{
			r = RandInt() ;
			System.out.println(r) ;
			int input = sc.nextInt() ;
			if(r!=input)
				break ;
		}
		sc.close();
	}
	
	static int RandInt()
	{
		return (int)(Math.random()*1000) ;
	}
}
