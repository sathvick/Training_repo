package com.java.practice;

import java.io.*;
import java.util.*;
/**
 * 
 * @author Sathvick
 *EOF stands for end-of-file
 */
public class EOF {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lineNumber = 0;
        while(sc.hasNext()){
            lineNumber++;
            System.out.println(""+lineNumber+" "+sc.nextLine());
            /**
             * assign line number to the written string and returns the line number and string together.
             */
        }
    }
}