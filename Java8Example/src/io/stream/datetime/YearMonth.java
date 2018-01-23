package io.stream.datetime;

import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.time.temporal.ChronoUnit;

public class YearMonth {

	public static void main(String[] args) {
		Year y = Year.now();
		print(y);//2018
		print(y.isLeap());//false
		print(y.isBefore(Year.of(2013)));//false
		print(y.isAfter(Year.parse("2013")));//true
		
		print(y.length());//365
		print(Year.of(2012).length());//366
		
		//The units YEARS, DECADES, CENTURIES, MILLENNIA and ERAS are supported. 
		//Other ChronoUnit values will throw an exception. 
		Year ny = Year.of(2020);
		long amount = y.until(ny, ChronoUnit.YEARS);
		print(amount);//2
		
		Year fy = Year.of(2030);
		long amount2nd = y.until(fy, ChronoUnit.DECADES);
		print(amount2nd);//1
		
		try {
			long weekAmount = y.until(ny, ChronoUnit.WEEKS);
			print(weekAmount);
		} catch (Exception e) {
			System.out.println(e);
			//java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Weeks
		}
		
		MonthDay md = MonthDay.of(Month.FEBRUARY, 29);
		print(md.atYear(2011));//2011-02-28
		print(md.isValidYear(2012));//true
		print(md.isValidYear(2013));//false
		
	}
	
	private static void print(Object obj){
		System.out.println(obj);
	}

}
