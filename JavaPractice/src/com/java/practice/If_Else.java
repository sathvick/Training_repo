package com.java.practice;


import java.util.*;


/**
 * 
 * @author Sathvick
 *Sample if-else program to print the string for the given conditions.
 */
public class If_Else {



	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		scanner.close();
		if(N%2==1)
			/**
			 *  checks if the number is odd
			 */
		{
			System.out.println("Weird");
		}
		else 
		{
			if((2<=N) && (N<=5))
			{
				System.out.println("Not Weird");
			}
			if((6<=N) && (N<=20))
			{
				System.out.println("Weird");
			}
			if(N>20)
			{
				System.out.println("Not Weird");
			}

		}
	}
}
