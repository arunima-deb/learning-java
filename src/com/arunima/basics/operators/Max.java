package com.arunima.basics.operators;

public class Max {

	public int getMax( int a, int b, int c ) {
		int d = (((a>b)? a : b )>c)?((a>b)?a:b) : c ;
		return d ;
	}
}
