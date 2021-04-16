package javaTest;

public abstract class AbstractClassTest {

	public String sayHello(String data) {
		return "Hello";
	}
	// public abstract String sayHello(String data, String data2) ;
	
	public static void main(String arg[]) {
		System.out.println("Test");
		AbstractClassTest t = new AbstractClassTest() {
			
		};
	}
}
