package javaTest;

public class InnerClassExample {

	private String msg ="Message from outer class";
	
	InnerClass i = new InnerClass();
	public static void main(String[] args) {

		InnerClassExample exam = new InnerClassExample();
		System.out.println(" Outer Class: " + exam.msg );
		InnerClassExample.InnerClass in = exam. new InnerClass();
		in.message();
		System.out.println(in.msg);
	}

	public class InnerClass {
		
		private String msg = " Inner Class";
		void message() {
			//msg = "";
			System.out.println("Message:  "+this.msg);
			System.out.println("Message: " + InnerClassExample.this.msg);
		}
	}
}
