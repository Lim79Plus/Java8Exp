package io.stream;

import io.stream.interfaces.A1Interface;
import io.stream.interfaces.A2Interfase;

public class ImplementMultiInterface implements A1Interface, A2Interfase {

	public static void main(String[] args) {
		ImplementMultiInterface thisclass = new ImplementMultiInterface();
		thisclass.doSomething();
		thisclass.doAnotherThing();
	}

	@Override
	public void doSomething() {
		//chose A1Interface default method 
		A1Interface.super.doSomething();
	}

	@Override
	public void doAnotherThing() {
		System.out.println("THis is ImplementMultiInterface method");
	}

}
