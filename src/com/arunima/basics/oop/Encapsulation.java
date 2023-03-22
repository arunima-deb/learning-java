//
// This program demonstrates data encapsulation.
//
// Data encapsulation - The mechanism whereby the implementation details of a
// class are kept hidden from the user of the class
//

package com.arunima.basics.oop ;

/**
 * This class computes the simple interest
 */
class SICalculator {

    private float principal = 0 ;
    private float ratePA = 0 ;
    
    public SICalculator( float principal, float ratePA ) {
        this.principal = principal ;
        this.ratePA = ratePA ;
    }
    
    public float calculateSI( int numTerms ) {
        return (principal * ratePA * numTerms)/100 ;
    }
    
    public float calculateAmountWithSI( int numTerms ) {
        return principal * ( 1 + (ratePA * numTerms)/100 ) ;
    }    
}

public class Encapsulation {
    
    public static void main( String[] args ) {
        
        SICalculator calculator = null ;
        calculator = new SICalculator( 1000, 10 ) ;
        
        // Note how we are not bothered by how the calculator computes the
        // SI. This is a way of saying that the calculator 'encapsulates' the
        // logic and data required. 
        System.out.println( calculator.calculateSI( 1 ) ) ;
        System.out.println( calculator.calculateAmountWithSI( 1 ) ) ;
    }
}
