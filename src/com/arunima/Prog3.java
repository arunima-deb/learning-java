package com.arunima;

import java.util.*;
public class Prog3
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1- Trains travelling in same direction");
        System.out.println("2- Trains travelling in opposite direction");
        System.out.print("Choice= ");
        int c = sc.nextInt();
        
        System.out.print("Enter first train velocity: ");
        double a = sc.nextDouble();
        System.out.print("Enter first train length: ");
        double b = sc.nextDouble();
        
        System.out.print("Enter second train velocity: ");
        double d = sc.nextDouble();
        System.out.print("Enter second train length: ");
        double e = sc.nextDouble();
        
        double x = 0.0;
        
        switch(c) 
        {
        case 1: x = Math.abs(a - d); break;
        case 2: x = a + d; break;
        }
        
        double t = (b + e) / x;
        System.out.println("Relative Velocity = " + x);
        System.out.println("Time taken to cross = " + t);
    }
}