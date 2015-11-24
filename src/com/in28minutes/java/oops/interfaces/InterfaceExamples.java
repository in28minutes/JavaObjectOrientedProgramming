package com.in28minutes.java.oops.interfaces;

interface Flyable {
	void fly();
}

class Aeroplane implements Flyable {
	public void fly() {
		System.out.println("Aeroplane is flying");
	}
}

class Bird implements Flyable {
	public void fly() {
		System.out.println("Bird is flying");
	}
}

public class InterfaceExamples {
	public static void main(String[] args) {
		Flyable flyable = new Bird();
		flyable.fly();
	}
}
