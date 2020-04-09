package com.java.learning.java8;

/**
 * Java 8 have introduced a new feature where we had to make
 * the local variable <b>final</b> to be used inside the lambda. Hence,
 * they've provided it as a feature. If you aren't changing the value
 * (which means it is effectively final) then there is no need to add
 * the <b>final</b> keyword anymore.
 * 
 * Enjoy!!!!!
 * @author Taurus
 *
 */
public class EffectiveFinalVariable {

	public static void main(String[] args) {
		String message = "This is a message which is never changed!";
		// Uncomment following line and it'll throw compile time error (even by IDE)
		// message = "Changing the message!";
		new Thread(() -> System.out.println(message)).start();
	}

}
