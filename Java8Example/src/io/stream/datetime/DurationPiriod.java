package io.stream.datetime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;

public class DurationPiriod {

	public static void main(String[] args) {

		Instant i1 =Instant.now();
		try {
			Thread.sleep(1050L);
		} catch (InterruptedException e) {

		}
		
		Instant i2 = Instant.now();
		
		Duration d = Duration.between(i1, i2);
		
		System.out.printf("%d seconds and %d nanoseconds elapse\n", d.getSeconds(), d.getNano());
		//1 seconds and 50000000 nanoseconds elapse
		
		LocalDateTime ldt = LocalDateTime.now();
		print(ldt);
		print(ldt.plus(d));
		
	}

	private static void print(Object obj){
		System.out.println(obj);
	}
}
