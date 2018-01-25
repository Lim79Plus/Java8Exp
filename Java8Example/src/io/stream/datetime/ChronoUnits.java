package io.stream.datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnits {

	public static void main(String[] args) {
		
		LocalDate ldt1 = LocalDate.now();
		LocalDate ldt2 = LocalDate.of(2020, Month.JULY, 24);
		
		long dayChrUni = ChronoUnit.DAYS.between(ldt1, ldt2);
		print(dayChrUni);
		
		long monthChrUni = ChronoUnit.MONTHS.between(ldt1, ldt2);
		print(monthChrUni);
		
		long yearChrUni = ChronoUnit.YEARS.between(ldt1, ldt2);
		print(yearChrUni);
	}
	
	private static void print(Object obj){
		System.out.println(obj);
	}
}
