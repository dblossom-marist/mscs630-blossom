/**
 * file: Driver_lab1.java
 * author: Dan Blossom
 * course: MSCS 630 Security Algorithms & Protocols
 * assignment: lab 1
 * due date: February 3rd, 2019
 * version: 1
 * 
 * This file contains the main class driver
 * int[] str2int(String);
 */

/**
 * Import declarations section
 */
import java.util.Scanner;

/**
 * This class takes input and returns a numerical value 0-25 A-Z or 26 as space
 * 
 * The printout it displays is a numerical value 0-25 corresponding
 * to its place in the alphabet. A space will display the value 26.
 * @author Dan Blossom
 */
public class Driver_lab1 {
 
  /*
   * Main method and driver of this file.
   * 
   * @param args: Not used but required by method.
   */
  public static void main(String args[]){
    
    // take a string of input
    Scanner input = new Scanner(System.in);
        
    // create an instance of this class
    Driver_lab1 driverLab1 = new Driver_lab1();
    
    //... GO!
    driverLab1.processFile(input);
  }
  
  /**
   * This method processes a string and converts it to 
   * an integer between 0-25 and 26 for a space.
   * It will return an array of integers.
   * @param plainText The string we will convert to int 0-26
   * @return An array of integers 0-26, empty if the string isn't chars
   */
  private int[] str2int(String plainText) {
    
    // Since we are subtracting by 65 those are 
    // uppercase letters, so let's uppercase the sting
    plainText = plainText.toUpperCase();
    
    // The array we are returning
    int[] returnArray = new int[plainText.length()];
    
    // we want space to be 26
    int SPACE = 26;
    
    // A is 65 in ascii, so if we subtract ascii A
    // from each number it will result in 0 - 25 for A-Z
    int OFFSET = 65;
    
    // A holder for the int value of a character
    // Trying to reduce the number of times calling
    // 'charAt(int)' while doing comparisons
    int charCode;
    
    for(int i = 0; i < plainText.length(); i++) {
      
      // Get the characters integer value.
      charCode = ((int) plainText.charAt(i));
      
      // is it a space?
      if(charCode == 32) {
        returnArray[i] = SPACE;
      }else {
        returnArray[i] = (charCode - OFFSET);
      }
    }
    return returnArray;
  }
  
  /**
   * This method is a helper function for scanning a text file passed
   * In from the main program
   * @param filename The file which was passed to the main program.
   */
  private void processFile(Scanner input) {
    
    while(input.hasNext()) {
    
      // Grab the string
      String line = input.nextLine();
        
      // convert it to integers 
      int stringToIntArray[] = str2int(line);
        
      // Prints each int in array
      for(int i: stringToIntArray) {
        System.out.print(i + " ");
      }
      // new line
      System.out.println();
    }
  }
 }