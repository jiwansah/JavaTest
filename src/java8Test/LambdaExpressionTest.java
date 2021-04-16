package java8Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

//https://www.javatpoint.com/java-8-functional-interfaces

public class LambdaExpressionTest {

		String outerTest = "Test";
	public interface T{
		public abstract boolean test(String s);
	}
	
	public void test() {

		String methodTest = "Test";
		
		T test =  (String s) -> { System.out.println(this.outerTest); return s.equals("Test");};
		System.out.println( test.test("Jiwan") );
		
		Predicate<String> test2 = new Predicate<String>() {
			int k=0;
			public boolean test(String s) {
				/*System.out.println(LambdaExpressionTest.this.outerTest);
				System.out.println(this.k);
				System.out.println(methodTest);*/
				return s.equals("Test");
			}
		};
		//System.out.println( test2.test("Test") );
		List<String> nameList = new ArrayList<String>();
		nameList.add("Jiwan"); nameList.add("kumar"); nameList.add("Sah"); nameList.add("Test"); 
		
		System.out.println("Functional interface : "); 
		nameList.stream().filter(test2).forEach(System.out::print); System.out.println("");
		
		System.out.println("Method referance : ");
		nameList.stream().filter(LambdaExpressionTest::test).forEach(System.out::print); System.out.println("");
		
		System.out.println("Lamda expression : ");
		nameList.stream().filter(name -> name.equals("Sah")).forEach(System.out::print); System.out.println("");
	}
	
	public static void main(String []args) {
		new LambdaExpressionTest().test();
		
	}
	
	
	public static boolean test(String name) {
		return name.equalsIgnoreCase("Jiwan");
	}

	
}

interface Sayable{  
    public String say(String name);
}