package com.java.practice;

import java.util.*;
import java.io.*;
/**
 * 
 * @author Sathvick
 *
 */
public class binary {
        public static void main(String []argh){
            Scanner in = new Scanner(System.in);
            /**
             * getting input stream
             */
            int t=in.nextInt();
            /**
             * reading t(int) for binary expression
             */

            for(int i=0;i<t;i++){
            	
                int result = 0;
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
/**
 * reading a,b,n for binary expression
 */
                for (int j = 0; j < n; j++ ){
                    if(j==0){
                        result = result + (a + (int)Math.pow(2,j) * b);
                    }
                    else{
                        result = result + ((int)Math.pow(2,j) * b);
                    }
                    System.out.print(result+" ");
                }
                System.out.println();
            }


        }
    }