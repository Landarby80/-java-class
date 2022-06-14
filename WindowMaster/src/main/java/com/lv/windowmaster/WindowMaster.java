/**
 *@author Landarby Vincent
 *email: vincentlandarby@gmail.com
 *date: 06/14/2022
 *purpose: calculate the total cost for home replacement windows. 
 */

package com.lv.windowmaster;

import java.util.Scanner;


public class WindowMaster {
    
    public static void main(String[] args) {
    
    
    // declare and initialize string variables that the user types in
    String height="";
    String width="";
    
    // declare and initialize float of the new height and width for the convertion
    
    float newHeight=0;
    float newWidth=0;
    
    // declare the float variable and initialize to 0
    float area =0;
    float perimeter=0;
    float cost=0;
    
    
  // declare and initialize a scanner object to read the input
    Scanner myScanner= new Scanner(System.in);
    
    //ask the user for the height in feet
    
    System.out.println("Enter the height in feet:");
    
    //Put the value in height
    
    height = myScanner.nextLine();
    
    // ask the user for the width in feet
    
    System.out.println("Enter the width in feet");
    
    //Put the value in width
    
    width = myScanner.nextLine();
    
    //Convert height and width into integerger with parseInt
    
    newHeight = Integer.parseInt(height);
    newWidth = Integer.parseInt(width);
    
    // calculate the area
    
    area= newHeight * newWidth;
    
    // calculate the perimeter
    
    perimeter= 2*newHeight + 2*newWidth;
    
    //display the area and the perimeter
    
    System.out.println("The area is " + area);
    System.out.println("The perimeter is " + perimeter);
    
    // calculate the price of the glass and the trim
    
    cost =  (float) ((float) (3.50 * area) + (2.25 * perimeter));
    
    // display the prie of the glass and the trim
    
    System.out.println("The total cost is : " + cost );
    
}
}