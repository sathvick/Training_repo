package com.java.practice;


import java.util.*;

public class pract {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Code");

		String code = input.next();
		char c = code.charAt(0);
		if( (!Character.isDigit(c)) && (!Character.isLetter(c) && (!Character.isWhitespace(c)))){

			if(c == '%' || c=='$'){

				System.out.println("Its what u want");
			}else{
				System.out.println("Not what u want");
			}
		}else{
			System.out.println("Not what u want$");
		}


	}
}