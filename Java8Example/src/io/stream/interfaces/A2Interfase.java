package io.stream.interfaces;

public interface A2Interfase {

	public default void doSomething(){
		System.out.println("THis is A2 Interface doSomething default method");
	}
	
	public default void doAnotherThing(){
		System.out.println("THis is A2 Interface doAnotherThing defaultc method");
	}
}
