package javaTest;

import java.io.IOException;

public class MethodOverriding_Static extends BaseClass {

	// known as sub class or derived class, extended class, or child class
	String msg = "I am in Child Msg";
	static String msgStatic = "I am in Child static Msg";
	
	MethodOverriding_Static() {
		
	}
	public MethodOverriding_Static display() throws IOException{
		System.out.println(" I am in Child Class : " + msg);
		MethodOverriding_Static o=null;
		return o;
	}
	
	// Method Hiding 
	public static void staticDisplay() {
		System.out.println(" I am in Child Static Class Display : "+msgStatic);
	}
	
	public static void main(String[] args) throws Exception {
		
		MethodOverriding_Static obj1 = new MethodOverriding_Static();
		BaseClass obj2 = new BaseClass();
		BaseClass obj3 = new MethodOverriding_Static();
		
		System.out.println("=========== Polymorphism ============");
		System.out.println(" " + obj1.msg);
		obj1.display();
		
		System.out.println(" " + obj2.msg);
		obj2.display();
		
		System.out.println(" " + obj3.msg);
		obj3.display();
		
		System.out.println("=============== Now Static key ===============");

		System.out.println(" " + obj1.msgStatic);
		obj1.staticDisplay();
		
		System.out.println(" " + obj2.msgStatic);
		obj2.staticDisplay();
		
		System.out.println(" " + obj3.msgStatic);
		obj3.staticDisplay();
		
	}

}

class BaseClass {

	//Base Class, Super Class or Parent Class
	String msg = "I am in Parent Msg";
	static String msgStatic = "I am in Parent static Msg";
	
	public BaseClass display() throws Exception{
		System.out.println(" I am in Parent Class : " + msg);
		BaseClass o=null;
		return o;
	}
	
	public final void finalDisplay() {
		System.out.println(" I am in Parent Class : " + msg);
	}
	
	public static void staticDisplay() {
		System.out.println(" I am in Parent Static Class Display: " + msgStatic);
	}

}