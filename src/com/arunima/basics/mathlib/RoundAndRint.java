package com.arunima.basics.mathlib;

public class RoundAndRint {
    
    private static final double[] input = {
        -2.0,
        -1.9,
        -1.6,
        -1.5,
        -1.4,
        -1.1,
        -1.0,
        -0.9,
        -0.6,
        -0.5,
        -0.4,
        -0.1,
         0.0,
         0.1,
         0.4,
         0.5,
         0.6,
         0.9,
         1.0,
         1.1,
         1.4,
         1.5,
         1.9,
         2.0
    } ;

    public static void main( String[] args ) {
        
        System.out.println( "Input round  rint" ) ;
        for( int i=0; i<input.length; i++ ) {
            
            double d = input[i] ;

            System.out.println( 
                String.format( 
                    "%5.1f %5d %5.1f", 
                    d, 
                    Math.round( d ), 
                    Math.rint( d ) 
            ) ) ;
        }
    }
}
