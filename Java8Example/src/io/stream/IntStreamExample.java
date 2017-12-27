package io.stream;

import java.util.stream.IntStream;

public class IntStreamExample {

	public static void main(String[] args) {

		IntStream.range(0, 10).forEach(System.out::println);
	}

}
