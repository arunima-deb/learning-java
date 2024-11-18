package com.arunima.basics.constructor;

import java.lang.reflect.Method;

import static com.arunima.basics.constructor.Log.log ;

public class Test {

	public static void main( String[] args ) 
			throws Exception {
		
		Test test = new Test() ;
		
		Method[] methods = Test.class.getDeclaredMethods() ;
		for( Method m : methods ) {
			if( m.getName().startsWith( "test" ) ) {
				log( "\nInvoking " + m.getName() ) ; 
				log( "-----------------------" ) ;
				m.invoke( test ) ;
			}
		}
	}
	
	public void test01() {
		Cat cat = new Cat( "Mama Cat" ) ;
		log( "Name of new cat is : " + cat.getName() ) ;
	}
	
	public void test02() {
		Book b = new Book( 100 ) ;
		log( "Price of book is " + b.getPrice() ) ;
		log( "GST on book is " + b.getGst() ) ;
	}
	
	public void test03() {
		
		SingleInstanceClass i1 = SingleInstanceClass.getInstance() ;
		log( "Instance 1 = " + i1 ) ;
		SingleInstanceClass i2 = SingleInstanceClass.getInstance() ;
		log( "Instance 2 = " + i2 ) ;
		
		Cat c1 = new Cat( "C1" ) ;
		log( "Cat 1 = " + c1.toString() ) ;

		Cat c2 = new Cat( "C1" ) ;
		log( "Cat 2 = " + c2.toString() ) ;
	}
}
