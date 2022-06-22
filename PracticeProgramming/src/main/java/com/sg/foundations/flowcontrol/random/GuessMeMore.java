/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.random;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author vince
 */
public class GuessMeMore {
    
     public static void main(String[] args){
    
    // Set the random number
    
    Random num = new Random();
    
    // Set the random number between -100 and 100
    int guessNumber= -100 + num.nextInt(100);
    
    // declare and initialize a scanner object to read the user's input
    Scanner userInput= new Scanner(System.in);
    
    System.out.println("I've chosen a number between -100 and 100. Bet you can't guess it!");
    
    //Ask the user to take their guess
    System.out.println("Your guess :");
    
    // Put the value on answer
        String ans= userInput.nextLine();
    
    // convert answer into integer
    int answer=Integer.parseInt(ans);
    
    if(guessNumber < answer){
        
        System.out.println("Ha, nice try - too low! Try again!");
        System.out.println("Your guess :" + ans);
    }
    
}
}