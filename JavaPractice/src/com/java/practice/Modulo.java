package com.java.practice;

import java.util.*;

class Modulo {
	public static void main (String[] args) {
		Scanner sc =new Scanner(System.in);
		int A = sc.nextInt();
		for(int a=0;a<A;a++)
		{
			double n=sc.nextDouble();
			if(n%2==0)
			{ System.out.println((n/2)+1);}
			else
			{
				System.out.println((n+1)/2);

			}
			

		}
		sc.close();
	}
}