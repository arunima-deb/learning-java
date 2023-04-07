package com.arunima.basics.operators;

public class InclinedMirrors {

	public int getNumImages( double angleOfInclination, boolean symmetric ) {
		double n = 360.0/angleOfInclination;
		return (int)n-1 ;
	}
}
