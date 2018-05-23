package com.java.practice;

import java.util.Scanner;
/**
 * 
 * @author Sathvick
 * Basic prgram to print the input data in a given format.
 *
 */
public class StdinStdout {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
int i = scan.nextInt();
double d = scan.nextDouble();
scan.nextLine();
String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}