package com.java.learning.java8.methodreference;

@FunctionalInterface
interface CustomFunctionalInterface {
	public void display(String message);
}

@FunctionalInterface
interface CustomFunctionalStaticInterface {
	public int getCurrentAge();
}

@FunctionalInterface 
interface MyInterface{  
	Person display(String say);  
} 

class Person {
	private String gender;
	
	public void showMessage(String message) {
		System.out.println("Person message: " + message);
	}
	
	public static int getAge() {
		return 24; 
	}
	
	public String getGender() {
		return gender; 
	}
	
	Person(String gender) {
		this.gender = gender;
		System.out.println("Setting gender as: " + gender);
	}
	
	Person() {
		super();
	}
}

public class MethodReferenceExample {

	public static void main(String[] args) {
		Person person = new Person();
		CustomFunctionalInterface method = person::showMessage;
		method.display("Via CustomFunctionalInterface");
		
		CustomFunctionalStaticInterface method1 = Person::getAge;
		System.out.println("Current Age via CustomFunctionalStaticInterface: " + method1.getCurrentAge());
		
		MyInterface myInterface = Person::new;
		myInterface.display("Male");
	}

}
