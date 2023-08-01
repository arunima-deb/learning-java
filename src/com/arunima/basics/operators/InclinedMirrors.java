package com.arunima.basics.operators;

public class InclinedMirrors {

	public int getNumImages( double angleOfInclination, boolean symmetric ) {
		double n = 360.0/angleOfInclination;
		int   n1 = (int)n ;
		int numImages = ( n1%2==0 || symmetric==true )? n1-1 : n1 ;
		return numImages ;
	}
}
