package com.arunima.games.hangman;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Puzzle {

	private float pctCharactersRevealed ;
	private String word ;
	private Set<Character> allGuesses = new HashSet<>() ;
	private Set<Character> rightGuesses = new HashSet<>() ;
	private Set<Character> wrongGuesses = new HashSet<>() ;
	private char[] originalPuzzle ; // Contains characters of the chosen word with only defaultly revealed letters
	private char[] currentWordState ; // Contains characters of the chosen word with the correctly guessed letters and defaultly revealed letters
	private char[] allCharacters ; // Contains all the letters of the chosen word 
	
	private List<PuzzleCell> cells = new ArrayList<>() ;
	
	public Puzzle( String word ) {
		this.word = word ;
		cells.add( new PuzzleCell( 'a', false ) ) ;
		cells.add( new PuzzleCell( 'p', false  ) ) ;
		cells.add( new PuzzleCell( 'p', false  ) ) ;
		cells.add( new PuzzleCell( 'l', false ) ) ;
		cells.add( new PuzzleCell( 'e', true  ) ) ;
		
		wrongGuesses.add( 'z' ) ;
		wrongGuesses.add( 'h' ) ;
		wrongGuesses.add( 'g' ) ;
		wrongGuesses.add( 'k' ) ;
	}

	public int getNumErrors() {
		return wrongGuesses.size() ;
	}

	public void getCurrentWordState() {
	}

	public List<PuzzleCell> getPuzzleCells() {
		return cells ;
	}

	public int getNumRemainingHints() {
		return 3;
	}
	
	public Set<Character> getWrongGuesses() {
		return wrongGuesses ;
	}
	
}
