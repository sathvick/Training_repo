package com.java.practice;

import java.util.*;
import java.lang.*;
import java.io.*;

class Jumpyball {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(t=t;t>0;t--)
		{
			long H=sc.nextLong();
			long d=0;
			while(H>0)
			{
				d=d+(2*H);
				H=H/2;
			}
			System.out.println(d);
			
		}
	}
}