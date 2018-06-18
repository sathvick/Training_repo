package com.java.practice;

import java.util.Scanner;
/**
 * 
 * @author Sathvick
 * gives a formatted output where the string consits 15 charac spaces and 3 digit spaces
 * even if u enter one or two digit number  0 is added at initial to form it 3 digit number 
 *
 */
public class FormattedOutput {

    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                String s2=sc.next();
                int y=sc.nextInt();
                String s3=sc.next();
                int z=sc.nextInt();
                System.out.printf("%-14s %03d", s1, x);
                System.out.println();
                System.out.printf("%-14s %03d", s2, y);
                System.out.println();
                System.out.printf("%-14s %03d", s3, z);
                System.out.println();
            System.out.println("================================");
     
            }
            sc.close();
    }
}