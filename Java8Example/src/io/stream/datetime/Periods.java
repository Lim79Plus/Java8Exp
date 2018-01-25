package io.stream.datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Periods {

	public static void main(String[] args) {
		LocalDate ldt1 = LocalDate.now();
		LocalDate ldt2 = LocalDate.of(2020, Month.JULY, 24);
		Period p = Period.between(ldt1, ldt2);
		System.out.printf("%d years, %d months, %d dayz\n",p.getYears(),p.getMonths(), p.getDays());
		System.out.println(p.toTotalMonths());
		System.out.println(p.toString());
	}

}
