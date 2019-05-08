/**
 * file: Driver_lab5.java
 * author: Dan Blossom
 * course: MSCS 630 Security Algorithms & Protocols
 * assignment: lab 5
 * due date: March 17th, 2019
 * version: 1
 * 
 * This file contains the main class driver
 * 
 */

import java.util.Scanner;

public class Driver_lab5 {

  public static void main(String[] args) {   
    // Scanner for input
    Scanner input = new Scanner(System.in);
    // Create an instance of the class
    AEScipher aes = new AEScipher();
    // ugh, backwards input
    // Get the key
    String keyHex = input.nextLine();
    // Get the plaintext
    String pTextHex = input.nextLine();
    // Call AES and get the cipher
    //String cTextHex = aes.AES(pTextHex, keyHex);
    System.out.println(pTextHex);
    String cTextHex = aes.encrypt(pTextHex, keyHex);
    // print it out, uppercase just in case
    System.out.println(cTextHex.toUpperCase());
    String a = aes.decrypt(cTextHex, keyHex);
    System.out.println(a.trim());
    // close input stream
    input.close();

  }
}
