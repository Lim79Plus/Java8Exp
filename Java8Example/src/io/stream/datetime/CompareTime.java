package io.stream.datetime;

import java.time.LocalDateTime;

public class CompareTime {

	public static void main(String[] args) {

		LocalDateTime dt = LocalDateTime.now();
		print(dt);//show now date 
		
		LocalDateTime oldDt = dt.minusYears(1).minusMonths(2).minusDays(3);
		print(oldDt);// show old date
		print(dt.isAfter(oldDt)); //true
		print(dt.isBefore(oldDt)); //false
		
	}
	
	private static void print(Object obj){
		System.out.println(obj);
	}

}
