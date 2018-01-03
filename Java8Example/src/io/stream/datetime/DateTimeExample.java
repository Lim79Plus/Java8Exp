package io.stream.datetime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

public class DateTimeExample {

	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.of(2018, Month.JANUARY,20,0,0);
		System.out.println("dt is "+ dt);
		
		LocalDateTime aTime = LocalDateTime.of(2018, Month.FEBRUARY,10,0,0);
		System.out.println("aTime is "+ aTime);
	
		long ns = Duration.between(dt, aTime).toDays();
		System.out.println("There are " + ns + " days between dt and aTime.");
	}

}
