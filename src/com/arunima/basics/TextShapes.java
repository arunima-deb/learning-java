package com.arunima.basics;

import java.util.Scanner;

/**
 * This class prints geometrical shapes like triangles, squares etc.
 * by using loops.
 */
public class TextShapes {
	
	/*
	    System.out.println( "Using while loop." ) ;
		int j=0 ;
		while( j<5 ) {
			System.out.println( j ) ;
			j++ ;
		}
		
		System.out.println( "\nUsing for loop." ) ;
		for( int i=0; i<5; i++ ) {
			System.out.println( i );
		}
		
		System.out.println( "\nUsing do-while loop." ) ;
		int k=0 ;
		do {
			System.out.println( k ) ;
			k++ ;
		}
		while( k < 5 ) ;
	 */
	public void drawSquareByMunni( int sideLength ) {
		
		int j = 0 ;
		do{
			int k = 0 ;
			do{
				System.out.print( "* " );
				k++ ;
			}
			while( k<sideLength );
			j++ ;
			System.out.println( "" );
		}
		while( j<sideLength );
	}

	public void drawSquareByBaba( int sideLength ) {
		
		for( int row=0; row<sideLength; row++ ) {
			for( int col=0; col<sideLength; col++ ) {
				System.out.print( "* " ) ;
			}
			System.out.print( "\n" ) ;
		} ;
	}
	
	public void drawLeftTriangleByBaba( int sideLength ) {
		
		for( int row=0; row<sideLength; row++ ) {
			for( int col=0; col<row+1; col++ ) {
				System.out.print( "* " ) ;
			}
			System.out.print( "\n" ) ;
		} ;
	}
	
	public void drawRightTriangleByMunni( int sideLength ) {
	
		int rowNum = -1 ;
		do {
			rowNum++ ;
			
			int numSpaces = sideLength-rowNum-1 ;
			int numStars = rowNum+1 ;
			
			if( numSpaces > 0 ) {
				int i=0 ;
				do {
					System.out.print( "  " ) ;	
					i++ ;
				}
				while( i < numSpaces ) ;				
			}

			
			if( rowNum < sideLength ) {
				int i = 0 ;
				do {
					System.out.print( " *" ) ;
					i++ ;
				}
				while( i < numStars ) ;
			}
			
			System.out.println();
			
		}
		while(rowNum<sideLength) ;
	}

	public void drawRightTriangleByBaba( int sideLength ) {
		
		for( int rowNum=0; rowNum<sideLength; rowNum++ ) {
			int numSpaces = sideLength - rowNum - 1 ;
			for( int i=0; i<sideLength; i++ ) {
				System.out.print( i < numSpaces ? "  " : " *" ) ;
			}
			System.out.println() ;
		}
	}
	
	public static void main(String[] args) {
		
		System.out.print( "Enter side length: " ) ;
		
		Scanner scanner = new Scanner( System.in ) ;
		int sideLength = scanner.nextInt() ;
		scanner.close() ;
		
		TextShapes shapes = new TextShapes() ;
/*		
		System.out.println( "\nSquare drawn by Munni :" );
		shapes.drawSquareByMunni( sideLength ) ;
		System.out.println( "" );
		System.out.println( "Square drawn by Baba :" );
		shapes.drawSquareByBaba( sideLength )
		
		shapes.drawLeftTriangleByBaba( sideLength );
*/		
		shapes.drawRightTriangleByBaba( sideLength ) ;
		
	}
}
