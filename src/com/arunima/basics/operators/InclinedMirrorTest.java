package com.arunima.basics.operators;

import static org.junit.jupiter.api.Assertions.assertEquals ;

import org.junit.jupiter.api.Test ;

class InclinedMirrorTest {
    
    InclinedMirrors mirrors = new InclinedMirrors() ;

    @Test
    void testGetNumImages() {
        assertEquals(  3, mirrors.getNumImages( 90, false ) ) ;
        assertEquals(  3, mirrors.getNumImages( 90,  true ) ) ;
        assertEquals(  5, mirrors.getNumImages( 60, false ) ) ;
        assertEquals(  5, mirrors.getNumImages( 72, false ) ) ;
        assertEquals(  4, mirrors.getNumImages( 72,  true ) ) ;
        assertEquals( 11, mirrors.getNumImages( 30, false ) ) ;
        assertEquals( 11, mirrors.getNumImages( 30,  true ) ) ;
        assertEquals(  5, mirrors.getNumImages( 55,  true ) ) ;
        assertEquals(  6, mirrors.getNumImages( 55, false ) ) ;
    }
}
