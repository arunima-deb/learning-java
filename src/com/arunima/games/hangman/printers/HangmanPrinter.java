package com.arunima.games.hangman.printers;

/**
 * Prints the hangman according to the number of errors the user has made
 */
public class HangmanPrinter {
	
	private static final String[][] PRINTING_HINTS = {
		{ 
			"|", 
			"|", 
			"|",
			"|" 
		}, // Hints for error level 0
		{ 
			"|      o", 
			"|",
			"|",
			"|" 
		}, // Hints for error level 1
		{ 
			"|      o",
			"|     /",
			"|", 
			"|" 
		}, // Hints for error level 2
		{ 
			"|      o",
			"|     /|",
			"|      |", 
			"|" 
		}, // Hints for error level 3
		{ 
			"|      o",
			"|     /|\\",
			"|      |", 
			"|" 
		}, // Hints for error level 4
		{ 
			"|      o",
			"|     /|\\",
			"|      |",
			"|     /" 
		}, // Hints for error level 5
		{ 
			"|      o",
			"|     /|\\",
			"|      |",
			"|     / \\" 
		}, // Hints for error level 6
	} ;
	
	/**
	 * @param errorLevel contains integer values 0-6, which mean the number of 
	 * errors that the player has made at any point.
	 */
	public void printHangman( int errorLevel ) {
		
		System.out.println( " ______" ) ;
		System.out.println( "|      |" ) ;
		printBody( errorLevel ) ;
		System.out.println( "|___________\n" ) ;
	}
	
	private void printBody( int errorLevel ) {
		
		String[] printingHints = PRINTING_HINTS[errorLevel] ;
		
		System.out.println( printingHints[0] ) ;
		System.out.println( printingHints[1] ) ;
		System.out.println( printingHints[2] ) ;
		System.out.println( printingHints[3] ) ;
	}
}