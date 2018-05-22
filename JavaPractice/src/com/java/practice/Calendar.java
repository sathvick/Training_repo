package com.java.practice;

import java.util.*;

public class Calendar { 
    public static String getDay(String day, String month, String year) {

     int year_int = Integer.parseInt(year);
     if(year_int>2000 && year_int<3000) {

        Calendar cal = Calendar.getInstance();
        cal.set(Integer.valueOf(year), (Integer.valueOf(month) - 1), Integer.valueOf(day));
      return cal.getDisplayName(Calendar.DAY_OF_WEEK,Calendar.LONG, Locale.getDefault()).toUpperCase();
    }
        else  {
         
            return null;
     }

}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        System.out.println(getDay(day, month, year));
    }
}