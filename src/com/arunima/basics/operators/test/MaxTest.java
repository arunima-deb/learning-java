package com.arunima.basics.operators.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.arunima.basics.operators.Max;

class MaxTest {

	@Test
	void testGetMax() {
		Max max = new Max() ;
		assertEquals( 100, max.getMax(100, 3, 7)) ;
		assertEquals( 100, max.getMax(3, 100, 7)) ;
		assertEquals( 100, max.getMax(7, 3, 100)) ;
	}

}
