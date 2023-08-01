package com.arunima.games.hangman;

public class PuzzleCell {
	
	private char character = (char)-1 ;
	private boolean isBlank = true ;
	private boolean isRevealed = false ;
	
	public PuzzleCell( char c, boolean blank ) {
		this.character = c ;
		this.isBlank = blank ;
		this.isRevealed = !blank ;
	}
	
	public char getChar() {
		return character ;
	}
	
	public boolean isBlank() {
		return isBlank ;
	}

	public boolean isRevealed() {
		return isRevealed ;
	}

}
