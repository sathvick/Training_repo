package com.java.practice;

import java.util.*;

/**
 * 
 * @author Sathvick
 *checks the input data for the data type it can be fitted to.
 */
public class Datatype{
    public static void main(String []argh)
    {
         Scanner sc = new Scanner(System.in);
         int t=sc.nextInt();
         /**
          * t - number of input data it should check for 
          */
         for(int i=0;i<t;i++)
        	 /**
        	  * loop to check for all data types
        	  */
         {
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)
                    System.out.println("* byte");
                if(x>= -Math.pow(2,15) && x<= Math.pow(2,15) - 1)
                    System.out.println("* short");
                if(x>= -Math.pow(2,31) && x<= Math.pow(2,31) - 1)
                    System.out.println("* int");
                if(x>= -Math.pow(2,63) && x<= Math.pow(2,63) - 1)
                    System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
                /**
                 * return can't be fitted anywhere. if input data doesn't fit any data type.
                 */
            }
         }
    sc.close();
    }
    
}