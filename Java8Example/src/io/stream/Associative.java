package io.stream;

import java.util.stream.IntStream;

public class Associative {

	public static void main(String[] args) {

		//it is printed in no order
		  System.out.println("Runnning in parallel");
		  IntStream.range(1, 1000)
		  		.parallel()
		  		.filter(a -> a%2 ==1)
		  		.limit(10)
		  		.sorted()
		  		.forEach(System.out::println);
		  
		  //it is printed in order
		  System.out.println("Runnning in serial");
		  IntStream.range(1, 1000)
	  		.filter(a -> a%2 ==1)
	  		.limit(10)
	  		.forEach(System.out::println);
		  
		//it is printed in order
		  System.out.println("Runnning in parallel2 with forEachOrdered");
		  IntStream.range(1, 1000)
		  		.parallel()
		  		.filter(a -> a%2 ==1)
		  		.limit(10)
		  		.sorted()
		  		.forEachOrdered(System.out::println);
		  
		//it is printed in order
		  System.out.println("Runnning in parallel3 with forEachOrdered");
		  IntStream.range(1, 1000)
		  		.parallel()
		  		.filter(a -> a%2 ==0)
		  		.limit(10)
		  		.sorted()
		  		.forEachOrdered(System.out::println);
		  
		//it is printed in order
		  System.out.println("Runnning in parallel4 with forEachOrdered");
		  IntStream.range(1, 1000)
		  		.parallel()
		  		.filter(a -> a%2 ==1 && a%3 !=0 && a%5 !=0)
		  		.limit(10)
		  		.sorted()
		  		.forEachOrdered(System.out::println);
		  
		  
		  
		  
	}

}
