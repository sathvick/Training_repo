package com.java.practice;


import java.util.*;

/**
 * 
 * @author Sathvick
 *
 */
public class HelloWorldChallenge {
	
    public static void main(String[] args) {
        /**
         *  Create a Scanner object to read input from stdin.
         */
        Scanner scan = new Scanner(System.in);
/**
 * Scanner used to obtain the input stream.
 */
        /**
         *  Read a full line of input from stdin and save it to our variable, inputString.
         */
        String inputString = scan.nextLine();

        /**
         * Close the scanner object, because we've finished reading
         */
        /**
         * all of the input from stdin needed for this challenge.
         */
        scan.close();

        /**
         *  Print a string literal saying "Hello, World." to stdout.
         */
        System.out.println("Hello, World.");

        /**
         *  Print the contents of inputString to stdout.
         */
        System.out.println(inputString);
    }
}