package com.arunima.games.hangman;

public class UserInterface {
	
	private HangmanPrinter hangmanPrinter = new HangmanPrinter() ;

	public void printBanner() {
	    System.out.println( " _    _                                                  __        ___  " ) ;
	    System.out.println( "| |  | |                                                /_ |      / _ \\ " ) ;
	    System.out.println( "| |__| | __ _ _ __   __ _ _ __ ___   __ _ _ __     __   _| |     | | | |" ) ;
	    System.out.println( "|  __  |/ _` | '_ \\ / _` | '_ ` _ \\ / _` | '_ \\    \\ \\ / / |     | | | |" ) ;
	    System.out.println( "| |  | | (_| | | | | (_| | | | | | | (_| | | | |    \\ V /| |  _  | |_| |" ) ;
	    System.out.println( "|_|  |_|\\__,_|_| |_|\\__, |_| |_| |_|\\__,_|_| |_|     \\_/ |_| (_)  \\___/ " ) ;
	    System.out.println( "                     __/ |                                              " ) ;
	    System.out.println( "                    |___/                                               " ) ;
	    System.out.println( "\n\nWelcome to Hangman v1.0!                                            " ) ;
	    System.out.println( "* Enter exit to abandon round and new to start a new round.             " ) ;
		
	}

	public int getDifficultyLevel() {
		return 2 ;
	}
	
	public void printHangman( Puzzle puzzle ) {
		hangmanPrinter.printHangman( puzzle.getNumErrors() ) ;
	}

	public void printChallenge(Puzzle puzzle) {
		puzzle.getCurrentWordState() ;
	}
	
}