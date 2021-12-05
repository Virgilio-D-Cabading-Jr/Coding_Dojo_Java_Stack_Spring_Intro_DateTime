package com.vcabading.displaydate;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class DateTime {

	public static String getDate() {
        Date currentDate = new Date(System.currentTimeMillis()); 	// Get the Current Date
        String pattern = "EEEEE, MMMMM dd, yyyy";     	// Format the Currrent Date to get the Day of Week, Month, Day, and Year
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String currentDay = simpleDateFormat.format(currentDate);
        return currentDay;
	}
	
	public static String getTime() {
		Date currentDate = new Date(System.currentTimeMillis()); 	// Get the Current Date
		String pattern = "hh:mm aa z";           	// Format the Current Time to get Hour, Minute, Seconds, AM/PM, and Time Zone
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String currentTime = simpleDateFormat.format(currentDate);
        return currentTime;
	}
}
