package com.java.learning.java9;

interface DisplayInterface {
	default void display(String message) {
		privateDisplay(message);
		privateStaticDisplay(message);
	}
	
	private void privateDisplay(String message) {
		System.out.println("Message printed by privateDisplay: " + message);
	}
	
	private static void privateStaticDisplay(String message) {
		System.out.println("Message printed by privateStaticDisplay: " + message);
	}
}

public class PrivateMethodInterfaceExample implements DisplayInterface {
	
	public static void main(String args[]) {
		PrivateMethodInterfaceExample object = new PrivateMethodInterfaceExample();
		object.display("Hi! I am from Java 9.");
	}
}
