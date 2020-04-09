package com.java.learning.java8;

interface DisplayInterface {
	default void sayHello() {
		System.out.println("Hello from DisplayInterface");
	}
	
	static void staticHello() {
		System.out.println("Hi! I am static from DisplayInterface");
	}
}

public class DefaultInterfaceMethod implements DisplayInterface{

	public static void main(String[] args) {
		DefaultInterfaceMethod object = new DefaultInterfaceMethod();
		object.sayHello();
		DisplayInterface.staticHello();
	}

}
