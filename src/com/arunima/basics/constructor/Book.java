package com.arunima.basics.constructor;

import static com.arunima.basics.constructor.Log.log ;

public class Book {
	
	private float price ;
	private float gst ;
	
	public Book() {
		log( "Invoking default constructor." ) ;
	}
	
	public Book( float price ) {
		log( "Invoking parameterized constructor." ) ;
		this.price = price ;
		this.gst = (float)(0.18 * this.price) ;
	}
	
	public float getPrice() {
		return this.price ;
	}
	
	public float getGst() {
		return this.gst ;
	}
}
