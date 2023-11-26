package com.april.Utility;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class DateUtils {
	static LocalDate today = LocalDate.now();

    // Get the day of the week as an enum (DayOfWeek)
	static DayOfWeek dayOfWeek = today.getDayOfWeek();
    
    public static String getTodaysFullDay() {
    	// Get the day of the week as a string (full name) //Thursday
        String dayFullName = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.getDefault());
        return dayFullName;
    }
    
    public static String getTodaysShortDay() {
    	// Get the day of the week as a string (short name)//Thu
        String dayShortName = dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.getDefault());
        return dayShortName;
    }
    
    public static String getTodaysDate() {
//    	today.toString();//2023-11-27
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String todayFormatted = today.format(formatter);
        return todayFormatted;//11/26/2023
    }
    

}
