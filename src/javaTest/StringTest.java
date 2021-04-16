package javaTest;

public class StringTest {

	String a = "Test";
	public static void main(String[] args) {

		String a = "Test";
		StringTest stringTest = new StringTest();
		System.out.println(stringTest.a == a);
		StringBuilder sb = new StringBuilder("Test");
		
		{
			stringTest.a = "Test";
			System.out.println(stringTest.a == a);
			System.out.println( sb.toString() == a );
		}
	}

}
