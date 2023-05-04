package com.arunima.games.hangman;

import java.util.HashSet;
import java.util.Set;

public class Puzzle {

	private int numErrors ;
	private float pctCharactersRevealed ;
	private String word ;
	private Set<Character> allGuesses = new HashSet<>() ;
	private Set<Character> rightGuesses = new HashSet<>() ;
	private Set<Character> wrongGuesses = new HashSet<>() ;
	private char[] originalPuzzle ; // Contains characters of the chosen word with only defaultly revealed letters
	private char[] currentWordState ; // Contains characters of the chosen word with the correctly guessed letters and defaultly revealed letters
	private char[] allCharacters ; // Contains all the letters of the chosen word 
	
	public Puzzle( String word ) {
		this.word = word ;
	}

	public int getNumErrors() {
		return numErrors ;
	}

	public void getCurrentWordState() {
		
	}
}
