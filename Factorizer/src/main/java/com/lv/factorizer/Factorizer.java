/**
 *@author Landarby Vincent
 *email: vincentlandarby@gmail.com
 *date: 06/20/2022
 *purpose: write a program that receives an integer value from a user and 
 *         then calculates and prints out a list that includes all of the factors of that number, 
 *         whether or not the number is perfect, and whether or not the number is prime.
 */
package com.lv.factorizer;

import java.util.Scanner;

/**
 *
 * @author vince
 */
public class Factorizer {
    
    public static void main(String[] arg ){
        
        //declare and initialize a scanner object to read my input
        Scanner userInput= new Scanner(System.in);
        
        // declare and initialize string variables that the user types in
        String stringNum= "";
        
        // Ask the user for a number
        System.out.println("What number would you like to factor?");
        
        // put the value into stringNum
        stringNum = userInput.nextLine();
        
        //convert stringNum into integer
        int num = Integer.parseInt(stringNum);
        
        System.out.print("Factors of " + num + " are: ");
        
        int count = 0;
        int isPerfectNumber=0;
       
        // loop to get the factors of the number and check if it is a perfect number.
        for (int i=1;i<=num;i++){
            // if the remainder is equal to 0
            if (num % i == 0 ){
                count++;   
                // print i
                System.out.println(i);
            
                //if i != num
                if (i != num){
                    // add the numbers
                    isPerfectNumber += i;
                }
                    
            }
            
        }
        
        // print how many factors the number have
        System.out.println(num + " has " + count + " factors.");
        
        
        if (isPerfectNumber == num ){
        
        // print if  it is a perfect number
        System.out.println(num +" is a perfect number.");
        }
        
        else{
            
            // print it is not a perfect number
            System.out.println(num +" is not a perfect number.");
        
        }
            
        boolean isPrime= true;
        //loop to check if it a prime number
        for (int i = 2; i < num; i++){
            
            //check when isPrime is false
            if (num % i == 0){
                
                isPrime = false;
                break;
            }
        
        
        }
        
        if (isPrime){
            
            System.out.println( num +" is a prime number.");
        }
        else{
            
            System.out.println( num +" is not a prime number.");
        
        }
    }
    
    
    
}
