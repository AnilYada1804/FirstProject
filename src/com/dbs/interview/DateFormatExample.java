package com.dbs.interview;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatExample {
	public static void main(String[] args) {
		System.out.println("Util date "+new Date());
		System.out.println("Util date "+new java.sql.Date(1));
		String pattern = "MM-dd-yyyy";
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
		String date = dateFormat.format(new Date());
		try {
			Date parseDate = dateFormat.parse(date);
			System.out.println(parseDate);
		} catch (ParseException e) {
		}
		System.out.println(date);
	}

}
