package com.arunima.basics.constructor;

import static com.arunima.basics.constructor.Log.log ;

@SuppressWarnings("unused")
public class Cat {

	private String name ;
	
	public Cat( String name ) {
		this.name = name ;
	}
	
	protected String getName() {
		return name ;
	}
}
