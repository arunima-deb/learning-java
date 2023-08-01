package com.arunima.games.hangman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * What does it do?
 * 
 * > At the time of creation loads a list of words from a file
 * > Returns a word at random whose length depends on difficultyLevel 1-3
 */
public class WordRepository {
	
	private static final String WORD_LIST = 
								"/com/arunima/games/hangman/hangman-words.txt" ;
	
	private List<String> allWords = new ArrayList<>() ; 
	
	public WordRepository() {
		loadWords() ;
	}
	
	private void loadWords() {
		
		try {
			InputStream is = WordRepository.class.getResourceAsStream( WORD_LIST ) ;
			BufferedReader br = new BufferedReader( new InputStreamReader( is ) ) ;
			
			String line = br.readLine() ;
			while( line != null ) {
				allWords.add( line.trim().toLowerCase() ) ;
				line = br.readLine() ;
			}
		} 
		catch (IOException e) {
			e.printStackTrace() ;
		}
	}
	
	
	public String chooseRandomWord( int difficultyLevel ) {
		
		int[] lengthRange = getWordLength( difficultyLevel ) ;
		List<String> eligibleWords = new ArrayList<>() ;
		
		for ( int i = 0; i < allWords.size(); i++ ) {
			String word = allWords.get( i ) ;
			int wordLen = word.length() ;
			
			if( lengthRange[0]<=wordLen && wordLen<=lengthRange[1] ) {
				eligibleWords.add(word) ;
			}
		}
		
		int randomIndex = new Random().nextInt( eligibleWords.size() ) ;
		return eligibleWords.get( randomIndex ) ;
		
	}
	
	private int[] getWordLength( int difficultyLevel ) {
		
		if( difficultyLevel == 1 ) {
			return new int[]{ 3, 5 } ;
		}
		else if( difficultyLevel == 2 ) {
			return new int[]{ 6, 9 } ;
		}
		else if( difficultyLevel == 3 ) {
			return new int[]{ 10, 16 } ;
		}
		return new int[]{ 6, 8 } ;
	}
}	
	