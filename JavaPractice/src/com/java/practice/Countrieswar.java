package com.java.practice;

import java.util.*;
import java.lang.*;
import java.io.*;

class Countrieswar {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=0;t<T;t++)
		{
			int N = sc.nextInt();
			
				int[] A = new int[N];
				int[] B = new int[N];

				int coa=0;
				int cob=0;

				for(int a=0;a<N;a++)
				{
					A[a]=sc.nextInt();
				}
				for(int b=0;b<N;b++)
				{
					B[b]=sc.nextInt();
				}
				for(int c=0;c<N;c++)
				{
					if( A[c]>B[c] )
					{
						coa++;

					}
					else if( A[c]<B[c] ) {
						cob++;
					}
				}

				System.out.print(coa+" "+cob);
				if(coa>cob)
				{
					System.out.println(" A");
				}
				else if(coa<cob)
				{
					System.out.println(" B");
				}
				else
				{
					System.out.println(" DRAW");
				}
			}


		}

}
