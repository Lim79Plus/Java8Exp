package io.stream.datetime;

import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class JapaneseDateSample {

	public static void main(String[] args) {

		JapaneseDate jYear = JapaneseDate.now();
		print(jYear); //Japanese Heisei 30-01-20
		print(jYear.format(DateTimeFormatter.ofPattern("yy"))); //30
		print(jYear.format(DateTimeFormatter.ofPattern("Gyy年MM月dd日"))); //平成30年01月20日
		print(jYear.get(ChronoField.YEAR_OF_ERA)); //30
		print(jYear.get(ChronoField.YEAR)); //2018
	}

	private static void print(Object obj){
		System.out.println(obj);
	}
}
