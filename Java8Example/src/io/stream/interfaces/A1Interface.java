package io.stream.interfaces;

public interface A1Interface {
	
	public default void doSomething(){
		
		System.out.println("THis is A1 Interface doSomething default method");
	}
	
	public default void doAnotherThing(){
		System.out.println("THis is A1 Interface doAnotherThing defaultc method");
	}

}
