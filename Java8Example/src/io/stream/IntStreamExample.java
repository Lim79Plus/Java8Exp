package io.stream;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class IntStreamExample {

	public static void main(String[] args) {

		//print IntStream.range[0123456789]
		System.out.print("IntStream.range[");
		IntStream.range(0, 10).forEach(System.out::print);
		System.out.println("]");
		
		//print OptionalDouble[4.5]
		OptionalDouble result = IntStream.range(0, 10).average();
		System.out.println(result);
		
		//print OptionalInt[9]
		OptionalInt result2 = IntStream.range(0, 10).max();
		System.out.println(result2);
	}

}
