package com.arunima.games.hangman.printers;

import java.util.List;

import com.arunima.games.hangman.Puzzle;
import com.arunima.games.hangman.PuzzleCell;

/**
 * This class prints the puzzle in the following format:
 * 
 * --------------------------------------------
 *   [a] [_] [_] [_] e
 *   
 *   Num hints remaining : 1
 *   Incorrect guesses : [g, h, b, t]
 * --------------------------------------------
 * 
 * Where:
 * 
 *   [_] - This letter is an unfilled blank
 *    e - This letter is exposed by default
 *   [a] - This letter was revealed after the user guessed it correctly
 *
 */
public class PuzzlePrinter {
	
	public void printPuzzle( Puzzle puzzle ) {
		printPuzzleCells( puzzle ) ;
		System.out.println( "Num hints remaining : " + puzzle.getNumRemainingHints() );
		System.out.println( "Incorrect guesses : " + puzzle.getWrongGuesses() );
	}
	
	private void printPuzzleCells( Puzzle puzzle ) {
		
		List<PuzzleCell> cells = puzzle.getPuzzleCells() ;
		for( int i=0; i<cells.size(); i++ ) {
			PuzzleCell cell = cells.get(i) ;
			if( cell.isBlank() ) {
				System.out.print( "[" ) ;
				if( cell.isRevealed() ) {
					System.out.print( cell.getChar() ) ;
				}
				else {
					System.out.print( "_" ) ;
				}
				System.out.print( "]" ) ;
			}
			else {
				System.out.print( cell.getChar() ) ;
			}
			System.out.print( " " ) ;
		}
		System.out.println( "\n" ) ;
	}
}
