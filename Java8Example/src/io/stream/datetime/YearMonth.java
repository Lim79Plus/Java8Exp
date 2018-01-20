package io.stream.datetime;

import java.time.Month;
import java.time.MonthDay;
import java.time.Year;

public class YearMonth {

	public static void main(String[] args) {
		Year y = Year.now();
		print(y);//2018
		print(y.isLeap());//false
		print(y.isBefore(Year.of(2013)));//false
		print(y.isAfter(Year.parse("2013")));//true
		
		MonthDay md = MonthDay.of(Month.FEBRUARY, 29);
		print(md.atYear(2011));//2011-02-28
		print(md.isValidYear(2012));//true
		print(md.isValidYear(2013));//false
		
	}
	
	private static void print(Object obj){
		System.out.println(obj);
	}

}
