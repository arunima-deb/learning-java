package com.arunima.basics.operators;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExpressionsTest {
	
	private Expansions app = new Expansions() ;

	@Test
	void testSquareDoubleDouble() {
		assertEquals( 25, app.square(2, 3) ) ;
	}

	@Test
	void testSquareDoubleDoubleDouble() {
		assertEquals( 81, app.square(2, 3, 4) ) ;
	}

	@Test
	void testDiffOfSquares() {
		assertEquals( -5, app.diffOfSquares(2, 3) ) ;
	}

	@Test
	void testSumOfSquares() {
		assertEquals( 13, app.sumOfSquares(2, 3) ) ;
	}

	@Test
	void testCube() {
		assertEquals( 125, app.cube(2, 3) ) ;
	}
	
}
