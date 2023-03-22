package com.arunima.basics.oop;

class Ball {
}

class Player {
    void makeGoal() {
    }
    
    void passBall() {
    }
    
    void hitCorner() {
    }
    
    void makeFault() {
    }
}

class Team {
    Player[] players = new Player[11] ;
    Player goalkeeper = null ;
    Player centerForward = null ;
}

public class FootballGame {
    
    Ball ball = new Ball() ;
    Team teamA = new Team() ;
    Team teamB = new Team() ;
    
    public static void main( String[] args ) {
        //FootballGame game = new FootballGame() ;
    }
}
