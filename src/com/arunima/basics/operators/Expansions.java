package com.arunima.basics.operators;

public class Expansions {

	/** Returns (a+b)^2 */
	public double square( double a, double b ) {
		return a*a + b*b + 2*a*b ;
	}

	/** Returns (a+b+c)^2 */
	public double square( double a, double b, double c ) {
		return a*a + b*b + c*c + 2*a*b + 2*b*c + 2*a*c ;
	}
	
	/** Returns a^2 - b^2 */
	public double diffOfSquares( double a, double b ) {
		return a*a - b*b ;
	}

	/** Returns a^2 + b^2 */
	public double sumOfSquares( double a, double b ) {
		return a*a + b*b ;
	}
	
	/** Returns (a+b)^3 */
	public double cube( double a, double b ) {
		return a*a*a + b*b*b + 3*a*a*b + 3*a*b*b ;
	}
}
