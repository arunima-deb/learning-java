package com.arunima.basics.oop;

class Car {
    
    private String color      = null ;
    private String model      = null ;
    private int    yearOfMake = 0 ;
    
    public Car( String color, String model, int yearOfMake ) {
        this.color = color ;
        this.model = model ;
        this.yearOfMake = yearOfMake ;
        
        System.out.println( "Constructing car " + 
                            "[ " + color + 
                            ", " + model +
                            ", " + yearOfMake + 
                            "]" ) ;
    }
    
    public boolean isOld() {
        return this.yearOfMake < 2000 ;
    }
    
    public String getColor() {
        return this.color ;
    }
    
    public String getModel() {
        return this.model ;
    }
}

public class ClassAndObjects {

    public static void main( String[] args ) {
        ClassAndObjects app = new ClassAndObjects() ;
        app.execute() ;
    }
    
    private void execute() {
        
        Car redCar  = new Car( "red",  "Ford"   , 1995 ) ;
        Car blueCar = new Car( "blue", "Renault", 2012 ) ;
        
        System.out.println( "" ) ;
        System.out.println( "Is redCar old? = " + redCar.isOld() ) ;
        System.out.println( "Is blueCar old? = " + blueCar.isOld() ) ;
    }
}
