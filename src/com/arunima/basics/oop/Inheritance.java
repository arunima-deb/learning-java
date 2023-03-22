package com.arunima.basics.oop;

abstract class Animal {
    
    public abstract void saySomething() ;
    public abstract void eatMeat() ; 
    public abstract void eatVeggie() ;
}

abstract class Carnivore extends Animal {
    
    public void eatMeat() {
        System.out.println( "Yummm" ) ;
    }

    public void eatVeggie() {
        System.out.println( "Yukkk" ) ;
    }
}

abstract class Herbivore extends Animal {
    
    public void eatMeat() {
        System.out.println( "Yukkk" ) ;
    }

    public void eatVeggie() {
        System.out.println( "Yummm" ) ;
    }
}

class Lion extends Carnivore {

    public void saySomething() {
        System.out.println( "Roarrrr!" ) ;
    }
}

class Cow extends Herbivore {
    
    public void saySomething() {
        System.out.println( "Moooooo!" ) ;
    }
}

public class Inheritance {
    
    public static void main( String[] args ) {
        
        Lion lion = new Lion() ;
        
        System.out.println( "\nSaying hi to lion : " ) ; 
        lion.saySomething() ;
        System.out.println( "\nOffering veggie to lion" ) ;
        lion.eatVeggie() ;
    }
}
