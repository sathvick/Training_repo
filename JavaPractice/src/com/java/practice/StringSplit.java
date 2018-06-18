package com.java.practice;

import java.io.*;
import java.lang.*;
import java.util.*;


public class StringSplit
{

	public static void main(String[] args)
	{
		String input="sath 123 sath";
		String a="abcd";
		String[] w=input.split(" "); 
		int wrc=1,b=0; 
		for(int i=0;i<w.length;i++) 
		{
			for(int j=i+1;j<w.length;j++) 
			{
				if(w[i].equals(w[j])) 
				{
					wrc=wrc+1; 
					w[j]="0"; 
				}
			}
			if(w[i]!="0"&&b<=wrc)
			{a=w[i] ;b=wrc;}
			wrc=1;
		}  
		System.out.println(a+"--"+b); 
	}
}