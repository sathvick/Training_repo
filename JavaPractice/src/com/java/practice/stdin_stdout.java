package com.java.practice;

	import java.util.*;
/**
 * 
 * @author Sathvick
 * Basic stdin and stdout program
 *
 */
	public class stdin_stdout {
	    private static Scanner scan;

		public static void main(String[] args) {
	        scan = new Scanner(System.in);
	        int a = scan.nextInt();
	        int b = scan.nextInt();
	        int c = scan.nextInt();

	        System.out.println(a);
	        System.out.println(b);
	        System.out.println(c);
	    }
	}
