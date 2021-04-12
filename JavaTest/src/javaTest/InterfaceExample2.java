package javaTest;

interface A {
	int a = 0;
	abstract void display();
	
default void msg() {
		
	}

	public default void defaultMethod() {
		System.out.println("I am in A:defaultMethod");
	}
	
	public static void staticMethod() {
		System.out.println("I am in A:staticMethod");
	}
}

interface B {
	int a = 0;
	abstract void display();
	
	public default void defaultMethod() {
		System.out.println("I am in A:defaultMethod");
	}
	
}

interface C extends A, B {
	
	default void display() {
	}

	@Override
	default void defaultMethod() {
		A.super.defaultMethod();
	}
}

class Test {
	public void msg() {
		
	}
}

public class InterfaceExample2 extends Test implements  A {

	public static void main(String[] args) {

		A a = new InterfaceExample2();
		a.defaultMethod();
		a.msg();
		
	}

	@Override
	public void display() {
	}

	

	
}



abstract class AbstaractClass {
	int a = 0;
	public abstract void display();
	
	public void defaultMethod() {
		System.out.println("I am in A:defaultMethod");
	}
	
	public static void staticMethod() {
		System.out.println("I am in A:staticMethod");
	}
}