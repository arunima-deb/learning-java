package com.arunima.basics.oop;

public class Polymorphism {

    public int add( int a, int b ) {
        return a + b ;
    }
    
    public String add( String a, String b ) {
        return a + b ;
    }
    
    public static void main( String[] args ) {

        Polymorphism app = new Polymorphism() ;
        System.out.println( "1 + 1 = " + app.add( 1, 1 ) ) ;
        System.out.println( "abc + def = " + app.add( "abc", "def" ) ) ;
    }
}
