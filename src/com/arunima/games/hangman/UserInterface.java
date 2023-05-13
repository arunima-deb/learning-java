package com.arunima.games.hangman;

import com.arunima.games.hangman.printers.BannerPrinter;
import com.arunima.games.hangman.printers.HangmanPrinter;
import com.arunima.games.hangman.printers.PuzzlePrinter;

public class UserInterface {
	
	private HangmanPrinter hangmanPrinter = new HangmanPrinter() ;
	private BannerPrinter bannerPrinter = new BannerPrinter() ;
	private PuzzlePrinter puzzlePrinter = new PuzzlePrinter() ;

	public int getDifficultyLevel() {
		return 2 ;
	}
	
	public void printHangman( Puzzle puzzle ) {
		hangmanPrinter.printHangman( puzzle.getNumErrors() ) ;
	}

	public void printPuzzle( Puzzle puzzle ) {
		puzzlePrinter.printPuzzle( puzzle ) ;
	}

	public void printBanner() {
		bannerPrinter.printBanner();
	}
	
}