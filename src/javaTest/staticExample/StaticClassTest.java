package javaTest.staticExample;

class BaseClassTest {
	static int a;
	static {
		System.out.println("BaseClassTest Base Class static Block");
	}
}

public class StaticClassTest extends BaseClassTest{
	static int b;
	static {
		a = 0;
		System.out.println("StaticClassTest Child class static Block");
	}
	public static void main(String[] args) {
		a =10;
		
	}
}
