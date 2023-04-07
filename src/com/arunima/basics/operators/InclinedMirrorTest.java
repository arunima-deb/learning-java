package com.arunima.basics.operators;

import static org.junit.jupiter.api.Assertions.assertEquals ;

import org.junit.jupiter.api.Test ;

class InclinedMirrorTest {
    
    InclinedMirrors mirrors = new InclinedMirrors() ;

    @Test
    void testGetNumImagesEvenSymmetric() {
        for( int i=4; i<=10; i+=2 ) {
            double theta = 360/i ;
            assertEquals( i-1, mirrors.getNumImages( theta, true ) ) ;
        }
    }
    
    @Test
    void testGetNumImagesEvenAsymmetric() {
        for( int i=4; i<=10; i+=2 ) {
            double theta = 360/i ;
            assertEquals( i-1, mirrors.getNumImages( theta, false ) ) ;
        }
    }
    
    @Test
    void testGetNumImagesOddSymmetric() {
        for( int i=5; i<=11; i+=2 ) {
            double theta = 360/i ;
            assertEquals( i-1, mirrors.getNumImages( theta, true ) ) ;
        }
    }
    
    @Test
    void testGetNumImagesOddAsymmetric() {
        for( int i=5; i<=11; i+=2 ) {
            double theta = 360/i ;
            assertEquals( i, mirrors.getNumImages( theta, false ) ) ;
        }
    }
    
    @Test
    void testGetNumImagesDecimalSymmetric() {
        for( int i=4; i<=10; i+=2 ) {
            double theta = 360/(i+Math.random()) ;
            int numImages = (int)(360/theta - 1) ;
            assertEquals( numImages, mirrors.getNumImages( theta, true ) ) ;
        }
    }

    @Test
    void testGetNumImagesDecimalAsymmetric() {
        for( int i=4; i<=10; i+=2 ) {
            double theta = 360/(i+Math.random()) ;
            int numImages = (int)(360/theta) ;
            assertEquals( numImages, mirrors.getNumImages( theta, false ) ) ;
        }
    }
}
