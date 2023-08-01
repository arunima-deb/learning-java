package com.arunima.games.hangman;

public class Hangman {

	public static void main(String[] args) {
		Hangman game = new Hangman();
		game.startGame() ;
	}
	
	private UserInterface userInterface = new UserInterface() ;
	private WordRepository wordRepository = new WordRepository() ;
	private Puzzle puzzle = null ;
	
	public void startGame() {
		userInterface.printBanner() ;
		startNewGame() ;
	}
	
	private void startNewGame() {
		int difficultyLevel = userInterface.getDifficultyLevel() ;
		String word = wordRepository.chooseRandomWord( difficultyLevel ) ;
		puzzle = new Puzzle( word ) ;
		
		userInterface.printHangman( puzzle ) ;
		userInterface.printPuzzle( puzzle ) ;
	}
}
