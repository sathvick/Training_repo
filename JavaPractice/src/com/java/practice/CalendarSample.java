package com.java.practice;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author Sathvick
 *this program is to retrieve the day of the given date, year, month by the user in DD MM YYYY format.
 */
public class CalendarSample {
	
	/**
	 * 
	 * @param day - to get the day
	 * @param month - to get the month
	 * @param year - to get the year
	 * @return - null if user entered year other than between 2000 and 3000
	 */
    public static String getDay(String day, String month, String year) {
/**
 * getDay method used to retrieve the day for the given Calendar date format
 */
     int year_int = Integer.parseInt(year);
     if(year_int>2000 && year_int<3000) {
/**
 * if-else used to check the year entered between 2000 and 3000
 */
    	 Calendar cal = Calendar.getInstance();
    	 /**
    	  * @Calendar.getInstance() - return a Calendar instance based on the current time
    	  */
        cal.set(Integer.valueOf(year), (Integer.valueOf(month) - 1), Integer.valueOf(day) - 2);
      return cal.getDisplayName(Calendar.DAY_OF_WEEK,Calendar.LONG, Locale.getDefault()).toUpperCase();
      /**
       * @DAY_OF_WEEK - is used to get the day for the given param
       */
    }
        else  {
         
            return null;
            /**
             * if the year doesnt come under given condition.
             */
     }

}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        System.out.println(getDay(day, month, year));
        in.close();
    }
}