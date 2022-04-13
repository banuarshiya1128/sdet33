package com.crm.genericUtility;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;


/**
 * This class contains all java specific common methods
 * @author hp
 *
 */
public class JavaUtility {

	public static int generateRandomNumber(int limit) {
		Random ran = new Random();
		int RandomNumber = ran.nextInt(limit);
		return RandomNumber;

	}
	/**
	 * This method is used to get the current date and time in required format
	 * @return
	 */
	public static String getcurrentTimeAndDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");
		Date date = new Date();
		String requireFormatDate = sdf.format(date);
		return requireFormatDate;
	}
	
	public  static long convertStringToLong(String value) {
		
		 long data = Long.parseLong(value);
		 return data;
	}

}
